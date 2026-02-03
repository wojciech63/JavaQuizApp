package org.example;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class QuizFileHandler {
    public void saveQuestions(List<IQuestion> questions) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("src/main/java/org/example/resources/Quiz.JSON"), questions);
    }

    public List<IQuestion> loadQuestions() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File("src/main/java/org/example/resources/Quiz.JSON"), new TypeReference<List<IQuestion>>(){});
    }

    public void printQuestions(List<IQuestion> questions) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String asString = mapper.writeValueAsString(questions);
        System.out.println(asString);
    }
}
