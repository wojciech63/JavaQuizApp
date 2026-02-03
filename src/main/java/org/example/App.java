package org.example;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Quiz quiz = new Quiz();
        QuizFileHandler quizFileHandler = new QuizFileHandler();

        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What is the capital of Poland?");
        question1.addAnswer(new Answer("Warsaw", true));
        question1.addAnswer(new Answer("Poznan", false));
        question1.addAnswer(new Answer("Bialystok", false));

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What is the capital of Portugal?");
        question2.addAnswer(new Answer("Porto", false));
        question2.addAnswer(new Answer("Lisbon", true));
        question2.addAnswer(new Answer("Aveiro", false));

        TrueFalseQuestion question3 = new TrueFalseQuestion("Hel is an island", false);

        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);

        try {
            quizFileHandler.saveQuestions(quiz.getQuestions());
            System.out.println("Udało się zapisać!");
        } catch (IOException e) {
            System.out.println("Błąd zapisu: " + e.getMessage());
        }

        quiz.play();


    }
}
