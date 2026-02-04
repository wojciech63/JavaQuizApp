package org.example;

import java.util.ArrayList;
import java.util.List;

public class TrueFalseQuestion extends Question {

    private boolean correctAnswer;

    public TrueFalseQuestion() {
        super();
    }

    public TrueFalseQuestion(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public List<Answer> getAnswers(){
        List<Answer> trueFalse = new ArrayList<>();
        trueFalse.add(new Answer("True", correctAnswer));
        trueFalse.add(new Answer("False", !correctAnswer));
        return trueFalse;
    }

    @Override
    public boolean checkAnswer(int index){
        if (index == 0) return  correctAnswer;
        if (index == 1) return  !correctAnswer;
        return false;
    }

    @Override
    public void addAnswer(Answer answer){

    }
}
