package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Question question1 = new Question("What is the capital of Poland?");
        Question question2 = new Question("What is the capital of Portugal?");
        Question question3 = new Question("What is the capital of Germany?");

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

        Answer answer7 = new Answer("Tokio", false);
        Answer answer8 = new Answer("Hamburg", false);
        Answer answer9 = new Answer("Berlin", true);

        question3.addAnswer(answer7);
        question3.addAnswer(answer8);
        question3.addAnswer(answer9);

        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        Scanner scanner = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println(q.getText());

            for (int i = 0; i < q.getAnswers().size(); i++) {
                System.out.println((i + 1) + "." + q.getAnswers().get(i));
            }

            int userChoice = scanner.nextInt();
            q.checkAnswer(userChoice - 1);
            System.out.println(q.checkAnswer(userChoice - 1));
        }

    }
}
