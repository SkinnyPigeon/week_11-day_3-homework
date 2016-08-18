package com.example.user.eightball;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 17/08/2016.
 */
public class AnswersFromSimpleStringsTest {

    Answers answers;

    @Before
    public void before() {
        answers = new AnswersFromSimpleStrings();
    }


    @Test
    public void getAnswersTest() {
        assertNotNull( answers.getAnswers() );
    }

    @Test
    public void getLengthTest() {
        assertEquals(5, answers.getLength());
    }

    @Test
    public void canAddAnswerTest() {
        answers.addAnswer( "Hiya" );
        assertEquals( 6, answers.getLength() );
    }

//    @Test
//    public void getAnswerTest() {
//        assertEquals( "Yah", answers.getAnswer() );
//    }

    @Test
    public void getAnswerAtIndexTest() {
        assertEquals( "Why not?", answers.getAnswerAtIndex(0) );
    }

}
