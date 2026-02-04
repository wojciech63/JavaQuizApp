package org.example;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public abstract class Question implements IQuestion {
    protected String text;

    public Question(){

    }

    public Question(String text){
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
