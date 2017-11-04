package com.example.a500052961.quiz;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity {


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main3);
        super.onCreate(savedInstanceState);
        //Activity1 ob= new Activity1();
        int score = getIntent().getIntExtra("score", -1);
        TextView textview2;
        textview2= (TextView) findViewById(R.id.textView2);
        Button button3;
        button3=(Button) findViewById(R.id.button3);
        textview2.setText(String.valueOf(score)+"/"+10);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View paramView)
            {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
                if (getIntent().getBooleanExtra("EXIT", false)) {
                    finish();
                }
            }
        });

    }
}
