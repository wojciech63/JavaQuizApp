package org.example;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("MULTI")
public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(){
        super();
    };

    public MultipleChoiceQuestion(String text) {
        super(text);
    }
}
