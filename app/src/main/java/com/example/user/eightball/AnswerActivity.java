package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 16/08/2016.
 */
public class AnswerActivity extends AppCompatActivity {

    TextView mAnswerText;
    TextView mEmoji;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Log.d("Eightball: ", "AnswerActivity.onCreate called");

        mAnswerText = ( TextView )findViewById( R.id.answer_text );
        mEmoji = ( TextView )findViewById( R.id.emoji );

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");
        String uniAnswer = extras.getString("unianswer");

        mAnswerText.setText( answer );
        mEmoji.setText( uniAnswer );

    }

    public String getEmijoByUnicode(int unicode){
        return new String(Character.toChars(unicode));
    }

}
