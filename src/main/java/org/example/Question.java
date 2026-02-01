package org.example;
import java.util.ArrayList;
import java.util.List;

public class Question {
    String text;

    ArrayList<Answer> answers;

    public Question(String text) {
        this.text = text;
        this.answers = new ArrayList<>();
    }

    void addAnswer(Answer answer) {
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
