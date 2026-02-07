package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "question_type")
public abstract class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String text;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    private List<Answer> answers = new ArrayList<>();
    public Question(){

    }

    public Question(String text){
        this.text = text;
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
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

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setText(String text) {
        this.text = text;
    }
}
