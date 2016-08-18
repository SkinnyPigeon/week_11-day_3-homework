package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by user on 16/08/2016.
 */
public class Eightball extends AppCompatActivity {

    EditText mQuestionEditText;
    Button mShakButton;

    Answers mAnswers;
    Answers mEmoji;
    Answers mApi;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText = ( EditText )findViewById( R.id.question_text );
        mShakButton = ( Button )findViewById( R.id.shak_button );
        mAnswers = new AnswersFromSimpleStrings();
        mEmoji = new AnswersFromSimpleEmoji();
        mApi = new AnswersFromApi();


        mShakButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick( View view ) {
                Log.d( "Eightball: ", "Me Shakked it" );
                String question = mQuestionEditText.getText().toString();
                Log.d("Eightball: ", "Question was '" + question + "'");

                String answer = mAnswers.getAnswer();
                String uniText = mEmoji.getAnswer();

                Intent intent = new Intent( Eightball.this, AnswerActivity.class );
                intent.putExtra( "answer", answer);
                intent.putExtra( "unianswer", uniText);
                Log.d("Eightball: ", "passing through '" + answer + "'");
                startActivity( intent );
            }
        });

    }

    public String getEmijoByUnicode(int unicode){
        return new String(Character.toChars(unicode));
    }

}
