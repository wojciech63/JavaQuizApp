package org.example;

import java.util.List;


public interface IQuestion {
    void addAnswer(Answer answer);
    List<Answer> getAnswers();
    String getText();
    boolean checkAnswer(int index);
}
