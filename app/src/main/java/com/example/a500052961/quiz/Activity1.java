package com.example.a500052961.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class Activity1 extends Activity {
    RadioButton Answer1, Answer2, Answer3, Answer4;
    TextView NUMBER, QUESTION;
    private QUESTIONS Ques = new QUESTIONS();
    private String C_Answer;
    public int score = 0;
    private int qno = 1;
    int gen=0;
    //private int questionlength = Ques.Ques.length;
   // Random r;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main2);
      //can use randomization of questions for later use
       // r = new Random();

        Answer1 = (RadioButton) findViewById(R.id.Answer1);
        Answer2 = (RadioButton) findViewById(R.id.Answer2);
        Answer3 = (RadioButton) findViewById(R.id.Answer3);
        Answer4 = (RadioButton) findViewById(R.id.Answer4);
        NUMBER = (TextView) findViewById(R.id.NUMBER);
        QUESTION = (TextView) findViewById(R.id.QUESTION);
        updatequestion(gen);
            Button button2 = (Button) findViewById(R.id.button2);
            button2.setVisibility(View.INVISIBLE);
            Answer1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Answer1.getText() == C_Answer) {
                        score++;
                        //SCORE.setText("Score: " + score);
                        //updatequestion(r.nextInt(questionlength));
                    }
                    gen++;
                    updatequestion(gen);

                }
            });
            Answer2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (Answer2.getText() == C_Answer) {
                        score++;
                        //SCORE.setText("Score: " + score);
                        //updatequestion(r.nextInt(questionlength));
                    }
                    gen++;
                    updatequestion(gen);
                }
            });
            Answer3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (Answer3.getText() == C_Answer) {
                        score++;
                        //SCORE.setText("Score: " + score);
                        //updatequestion(r.nextInt(questionlength));
                    }
                    gen++;
                    updatequestion(gen);
                }
            });
            Answer4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (Answer4.getText() == C_Answer) {
                        score++;
                        //SCORE.setText("Score: " + score);
                        //updatequestion(r.nextInt(questionlength));
                    }
                    gen++;
                    updatequestion(gen);
                }
            });


    }
    private void updatequestion(int num) {
        if(qno<=10) {
            RadioGroup rgButton = (RadioGroup) findViewById(R.id.radiogroup);
            rgButton.clearCheck();
            QUESTION.setText(Ques.getQuestion(num));
            NUMBER.setText("QUESTION : " + String.valueOf(qno));
            qno++;
            Answer1.setText(Ques.getOption1(num));
            Answer2.setText(Ques.getOption2(num));
            Answer3.setText(Ques.getOption3(num));
            Answer4.setText(Ques.getOption4(num));

            C_Answer = Ques.correctans(num);
        }
        else {
            Button button2 = (Button) findViewById(R.id.button2);
            button2.setVisibility(View.VISIBLE);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(Activity1.this,
                            Activity2.class);
                    myIntent.putExtra("score",score);
                    startActivity(myIntent);
                }
            });
        }
    }
}

