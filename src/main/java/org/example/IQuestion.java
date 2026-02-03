package org.example;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;


@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)

@JsonSubTypes({
        @JsonSubTypes.Type(value = MultipleChoiceQuestion.class, name = "multi"),
        @JsonSubTypes.Type(value = TrueFalseQuestion.class, name = "truefalse"),
})
public interface IQuestion {
    void addAnswer(Answer answer);
    List<Answer> getAnswers();
    String getText();
    boolean checkAnswer(int index);
}
