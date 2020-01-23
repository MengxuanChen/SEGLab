package com.example.certificatetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.certificatetestapp.SharedData;

public class ResultActivity extends AppCompatActivity {
    TextView result,mark;
    Button homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        final SharedData sharedData = SharedData.getInstance();

        String correct = getIntent().getStringExtra("correct");
        result = (TextView) findViewById(R.id.result);
        mark = (TextView) findViewById(R.id.mark);

        int percentMark = (int) Math.round(Integer.parseInt(correct) * 100.0/sharedData.getNumberOfQuestions());


        String correctString = "You got "+correct+"/"+String.valueOf(sharedData.getNumberOfQuestions())+
                " correct.";
        String markString = "";
        if(percentMark>=sharedData.getaPssingGrade() ){
            markString = "Your mark is  "+String.valueOf(percentMark)+"%."+"You passed.";
        }else{
            markString = "Your mark is  "+String.valueOf(percentMark)+"%."+"You failed.";

        }


        result.setText(correctString);
        mark.setText(markString);
        homeButton = (Button) findViewById(R.id.home);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
