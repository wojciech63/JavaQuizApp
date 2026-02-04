package org.example;
import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion extends Question{

    ArrayList<Answer> answers;

    public MultipleChoiceQuestion(){
        super();
        this.answers = new ArrayList<>();
    };

    public MultipleChoiceQuestion(String text) {
        super(text);
        this.answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    public List<Answer> getAnswers(){
        return answers;
    }

    public boolean checkAnswer(int index){
        if (index <0 || index >= answers.size()){
            return false;
        }
        return answers.get(index).isCorrect();
    }
}
