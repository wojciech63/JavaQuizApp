package org.example;
import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceQuestion implements IQuestion {
    String text;

    ArrayList<Answer> answers;

    public MultipleChoiceQuestion(String text) {
        this.text = text;
        this.answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    public List<Answer> getAnswers(){
        return answers;
    }

    public String getText() {
        return text;
    }

    public boolean checkAnswer(int index){
        if (index <0 || index >= answers.size()){
            return false;
        }
        return answers.get(index).isCorrect();
    }
}
