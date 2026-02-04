package org.example;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

@JsonTypeInfo(use= JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="type") // Include Java class simple-name as JSON property "type"
@JsonSubTypes({@JsonSubTypes.Type(MultipleChoiceQuestion.class), @JsonSubTypes.Type(TrueFalseQuestion.class)})

public interface IQuestion {
    void addAnswer(Answer answer);
    List<Answer> getAnswers();
    String getText();
    boolean checkAnswer(int index);
}
