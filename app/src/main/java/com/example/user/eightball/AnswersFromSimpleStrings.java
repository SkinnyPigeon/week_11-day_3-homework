package com.example.user.eightball;

import java.util.ArrayList;

/**
 * Created by user on 17/08/2016.
 */
public class AnswersFromSimpleStrings extends Answers {

    public AnswersFromSimpleStrings() {
        super();
    }

    public AnswersFromSimpleStrings( ArrayList< String > answers ) {
        super( answers );
    }

    @Override
    public void setupAnswers() {
        String[] answers = {
                "Why not?", "Can I answer that with another question?", "Have you tried waving", "Whenever you like", "If you build it they will come"
        };
        for( String answer : answers ) {
            addAnswer( answer );
        }
    }
}
