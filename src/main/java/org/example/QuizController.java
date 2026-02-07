package org.example;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.List;

public class QuizController {

    private QuizService quizService;
    private Label score;
    private List<Question> questions;
    private int scoreCounter = 0;
    private int currentIndex;

    private Label question;
    private VBox answersContainer;

    public QuizController(Label question, VBox answersContainer, Label score, QuizService quizService) {
        this.question = question;
        this.answersContainer = answersContainer;
        this.score = score;
        this.quizService = quizService;
    }

    private void handleAnswer(Answer answer){
        if (answer.isCorrect()){
            scoreCounter++;
            score.setText("Score: " + scoreCounter);
        }
        currentIndex++;
        if (currentIndex >= questions.size()){
            answersContainer.getChildren().clear();
            question.setText("Game Finished. Your score: " + scoreCounter);
        }else{
            updateView();
        }
    }

    private void updateView(){
        answersContainer.getChildren().clear();
        Question currentQuestion = questions.get(currentIndex);
        String text = currentQuestion.getText();
        question.setText(text);

        for (Answer answer : currentQuestion.getAnswers()) {
            Button answerButton = new Button(answer.getText());
            answerButton.setOnAction(event -> {
                handleAnswer(answer);
            });
            answersContainer.getChildren().add(answerButton);
        }
    }

    public void startGame(){
        this.questions = quizService.getQuestions();
        currentIndex = 0;
        updateView();
    }


}
