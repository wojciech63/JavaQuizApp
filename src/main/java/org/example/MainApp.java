package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label question = new Label();
        Label score = new Label();
        VBox answersContainer = new VBox();
        answersContainer.setSpacing(10);
        answersContainer.setAlignment(Pos.CENTER);

        VBox root = new VBox();
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(question,score, answersContainer);

        QuizController quizController = new QuizController(question, answersContainer, score);
        quizController.startGame();

        Scene scene = new Scene(root, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Quiz");
        primaryStage.show();
    }
}
