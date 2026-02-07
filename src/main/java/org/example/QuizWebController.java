package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SessionAttributes("userAnswers")
@Controller
public class QuizWebController {

    private QuizService quizService;

    @Autowired
    public QuizWebController(QuizService quizService) {
        this.quizService = quizService;
    }

    @ModelAttribute
    public List<Long> getUserAnswers() {
        return new ArrayList<>();
    }


    public String GET(@RequestParam(defaultValue = "0") int index, Model model){
        List<Question> questions = quizService.getQuestions();
        if(index >= questions.size()){
            return "redirect:/result";
        }
        model.addAttribute("question", questions.get(index));
        model.addAttribute("currentIndex", index);
        model.addAttribute("total", questions.size());
        return "quiz_step";
    }


    @GetMapping("/quiz")
    public String showQuiz(Model model) {
        model.addAttribute("questions", quizService.getQuestions());
        return "quiz";
    }

    @PostMapping("/submit")
    public String returnScore(@RequestParam(required = false) List<Long> selectedAnswerId, Model model) {
        int totalScore = quizService.calculateScore(selectedAnswerId);
        model.addAttribute("score", totalScore);
        return "result";
    }
}
