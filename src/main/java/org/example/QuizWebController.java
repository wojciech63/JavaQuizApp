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

    @ModelAttribute("userAnswers")
    public List<Long> getUserAnswers() {
        return new ArrayList<>();
    }

    @GetMapping("/quiz")
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

    @PostMapping("/next")
    public String POST(@RequestParam int index, @RequestParam(required = false) Long selectedAnswerId, @ModelAttribute("userAnswers") List<Long> userAnswers){
        if (selectedAnswerId != null){
            userAnswers.add(selectedAnswerId);
        }
        int nextIndex = index + 1;
        int totalQuestions = quizService.getQuestions().size();
        if (nextIndex <= totalQuestions){
            return "redirect:/quiz?index=" + nextIndex;
        }else{
            return "redirect:/result";
        }
    }

    @GetMapping("/result")
    public String showResult(Model model, @ModelAttribute("userAnswers") List <Long> userAnswers, org.springframework.web.bind.support.SessionStatus status){
        int totalScore = quizService.calculateScore(userAnswers);
        model.addAttribute("score", totalScore);
        status.setComplete();
        return "result";
    }
}
