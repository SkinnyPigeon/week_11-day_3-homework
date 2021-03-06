package com.example.user.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 17/08/2016.
 */
public abstract class Answers implements Answerable {

    protected ArrayList< String > mAnswers;

    public Answers() {
        mAnswers = new ArrayList< String >();
        setupAnswers();
    }

    public Answers( ArrayList< String > answers) {
        mAnswers = answers;
    }

    public ArrayList< String > getAnswers() {
        return new ArrayList<>( mAnswers );
    }

    public int getLength() {
        return mAnswers.size();
    }

    protected void addAnswer(String answer){
        mAnswers.add(answer);
    }

    public String getAnswerAtIndex( int index ) {
        return mAnswers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt( listSize );
        String answer = getAnswerAtIndex( index );
        return answer;
    }

    abstract public void setupAnswers();
}
