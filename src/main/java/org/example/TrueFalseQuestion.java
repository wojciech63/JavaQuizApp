package org.example;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("TRUE_FALSE")
public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion() {
        super();
    }

    public TrueFalseQuestion(String text, boolean correctAnswer) {
        super(text);
        Answer trueAns = new Answer("True", correctAnswer);
        Answer falseAns = new Answer("False", !correctAnswer);

        this.addAnswer(trueAns);
        this.addAnswer(falseAns);
    }
}
