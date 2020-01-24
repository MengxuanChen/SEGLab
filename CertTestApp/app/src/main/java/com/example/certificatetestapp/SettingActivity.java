package com.example.certificatetestapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SettingActivity extends AppCompatActivity {
    private int num = 10;
    private int grade = 60;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Button apply= findViewById(R.id.button3);
        Button back= findViewById(R.id.button4);
        final EditText numQuestion = findViewById(R.id.enterNum);
        final EditText passGrade = findViewById(R.id.enterGrade);
        numQuestion.setFilters(new InputFilter[]{ new InputFilters(1,100)});
        passGrade.setFilters(new InputFilter[]{new InputFilters(0,100)});

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(numQuestion.toString());
                grade = Integer.parseInt(passGrade.toString());
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
