/*package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final QuestionRepository questionRepository;

    @Autowired
    public DataLoader(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // 1. Czyścimy bazę przy każdym starcie, żeby nie dublować pytań
        questionRepository.deleteAll();

        // --- PYTANIA WIELOKROTNEGO WYBORU (MULTI) ---

        // Pytanie 1: Podchwytliwe o stolicę
        MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("Co jest stolicą Australii?");
        q1.addAnswer(new Answer("Sydney", false));
        q1.addAnswer(new Answer("Melbourne", false));
        q1.addAnswer(new Answer("Canberra", true));

        // Pytanie 2: O rzeki
        MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("Przez jakie miasto przepływa rzeka Tamiza?");
        q2.addAnswer(new Answer("Paryż", false));
        q2.addAnswer(new Answer("Londyn", true));
        q2.addAnswer(new Answer("Madryt", false));

        // Pytanie 3: Największy ocean
        MultipleChoiceQuestion q3 = new MultipleChoiceQuestion("Który ocean jest największy na świecie?");
        q3.addAnswer(new Answer("Ocean Atlantycki", false));
        q3.addAnswer(new Answer("Ocean Spokojny (Pacyfik)", true));
        q3.addAnswer(new Answer("Ocean Indyjski", false));

        // Pytanie 4: Afryka
        MultipleChoiceQuestion q4 = new MultipleChoiceQuestion("Które państwo NIE leży w Afryce?");
        q4.addAnswer(new Answer("Egipt", false));
        q4.addAnswer(new Answer("Kenia", false));
        q4.addAnswer(new Answer("Boliwia", true)); // To Ameryka Płd.

        // Pytanie 5: Polska geografia
        MultipleChoiceQuestion q5 = new MultipleChoiceQuestion("Najgłębsze jezioro w Polsce to:");
        q5.addAnswer(new Answer("Śniardwy", false));
        q5.addAnswer(new Answer("Hańcza", true));
        q5.addAnswer(new Answer("Morskie Oko", false));


        // --- PYTANIA PRAWDA / FAŁSZ (TF) ---
        // Zakładam, że Twój konstruktor TrueFalseQuestion sam tworzy odpowiedzi "True"/"False"
        // na podstawie drugiego parametru (boolean isCorrect).

        // Pytanie 6
        TrueFalseQuestion q6 = new TrueFalseQuestion("Czy Mount Everest leży w Europie?", false);

        // Pytanie 7
        TrueFalseQuestion q7 = new TrueFalseQuestion("Czy Nil jest powszechnie uważany za najdłuższą rzekę świata (lub Amazonka)?", true);

        // Pytanie 8
        TrueFalseQuestion q8 = new TrueFalseQuestion("Czy Monako jest najmniejszym państwem świata po Watykanie?", true);

        // Pytanie 9
        TrueFalseQuestion q9 = new TrueFalseQuestion("Czy pingwiny żyją naturalnie na Biegunie Północnym?", false);
        // (Żyją na Południowym!)

        // Pytanie 10
        TrueFalseQuestion q10 = new TrueFalseQuestion("Czy Polska graniczy z siedmioma państwami?", true);


        // --- ZAPIS DO BAZY ---
        questionRepository.saveAll(List.of(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10));

        System.out.println("Załadowano 10 pytań geograficznych do bazy!");
    }
}

 */