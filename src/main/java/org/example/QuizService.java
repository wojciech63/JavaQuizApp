package org.example;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuestionRepository questionRepository;

    public QuizService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    public int calculateScore(List<Long> selectedAnswerIds) {
        int score = 0;
        List<Question> questions = questionRepository.findAll();
        for(Question question: questions){
            for(Answer answer : question.getAnswers()) {
                if (selectedAnswerIds.contains(answer.getId()) && answer.isCorrect())
                score++;
            }
        }
        return score;
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

}
