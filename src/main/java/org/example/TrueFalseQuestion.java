package org.example;

import java.util.ArrayList;
import java.util.List;

public class TrueFalseQuestion implements IQuestion {
    private String text;
    private boolean correctAnswer;

    public TrueFalseQuestion(String text, boolean correctAnswer) {
        this.text = text;
        this.correctAnswer = correctAnswer;
    }

    public List<Answer> getAnswers(){
        List<Answer> trueFalse = new ArrayList<>();
        trueFalse.add(new Answer("True", correctAnswer));
        trueFalse.add(new Answer("False", !correctAnswer));
        return trueFalse;
    }

    public String getText() {
        return text;
    }

    public boolean checkAnswer(int index){
        if (index == 0) return  correctAnswer;
        if (index == 1) return  !correctAnswer;
        return false;
    }

    public void addAnswer(Answer answer){

    }
}
