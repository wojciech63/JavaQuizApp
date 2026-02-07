/*
package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    final QuestionRepository questionRepository;

    public DataSeeder(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (questionRepository.count() == 0) {
            MultipleChoiceQuestion question = new MultipleChoiceQuestion("Question");
            Answer answerMulti1 = new Answer("Answer", true);
            Answer answerMulti2 = new Answer("Answer", false);
            Answer answerMulti3 = new Answer("Answer", false);
            question.addAnswer(answerMulti1);
            question.addAnswer(answerMulti2);
            question.addAnswer(answerMulti3);
            TrueFalseQuestion trueFalseQuestion = new TrueFalseQuestion("Is hel an Island?", false);
            questionRepository.saveAll(List.of(question, trueFalseQuestion));
        }
    }
}
*/