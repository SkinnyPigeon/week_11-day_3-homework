package com.example.user.eightball;

import java.util.ArrayList;

/**
 * Created by user on 17/08/2016.
 */
public class AnswersFromSimpleEmoji extends Answers {

    public AnswersFromSimpleEmoji() {
        super();
    }

    public AnswersFromSimpleEmoji( ArrayList< String > answers ) {
        super( answers );
    }

    @Override
    public void setupAnswers() {
        String[] answers = {
                getEmijoByUnicode(0x1F64B), getEmijoByUnicode(0x1F6BD), getEmijoByUnicode(  0x26C4 ), getEmijoByUnicode(0x1F385), getEmijoByUnicode(0x1F63F)
        };
        for( String answer : answers ) {
            addAnswer( answer );
        }
    }

    public String getEmijoByUnicode(int unicode){
        return new String(Character.toChars(unicode));
    }
}
