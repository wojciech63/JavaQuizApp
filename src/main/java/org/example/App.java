package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What is the capital of Poland?");
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What is the capital of Portugal?");
        TrueFalseQuestion question3 = new TrueFalseQuestion("Hel is an island", false);

        Answer answer1 = new Answer("Warsaw", true);
        Answer answer2 = new Answer("Poznan", false);
        Answer answer3 = new Answer("Bialystok", false);

        question1.addAnswer(answer1);
        question1.addAnswer(answer2);
        question1.addAnswer(answer3);

        Answer answer4 = new Answer("Porto", false);
        Answer answer5 = new Answer("Lisbon", true);
        Answer answer6 = new Answer("Aveiro", false);

        question2.addAnswer(answer4);
        question2.addAnswer(answer5);
        question2.addAnswer(answer6);

        List<IQuestion> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        Scanner scanner = new Scanner(System.in);

        Quiz quiz = new Quiz();
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);
        quiz.play();

    }
}
