package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz implements IQuiz{

    Scanner scanner = new Scanner(System.in);
    private List<IQuestion> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    @Override
    public void addQuestion(IQuestion question) {
        questions.add(question);
    }

    @Override
    public void play() {

        for (IQuestion question : questions) {
            System.out.println(question.getText());

            for (int i = 0; i < question.getAnswers().size(); i++) {
                System.out.println((i + 1) + "." + question.getAnswers().get(i));
            }
            System.out.println("Your choice: ");
            int choice = scanner.nextInt();

            if (question.checkAnswer(choice - 1)) {
                System.out.println("Congrats");
                score++;
            } else {
                System.out.println("Wrong choice");
            }

        }
        System.out.println("The end! Score: " + score);
    }
}