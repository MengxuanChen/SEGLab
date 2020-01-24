package com.example.certificatetestapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.certificatetestapp.SharedData;
public class SettingActivity extends AppCompatActivity {
    private int num = 10;
    private int grade = 60;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        final SharedData sharedData = SharedData.getInstance();

        Log.d("Share",String.valueOf(sharedData.getaPssingGrade()));
        Log.d("Share",String.valueOf(sharedData.getNumberOfQuestions()));

        Button apply= findViewById(R.id.button3);
        Button back= findViewById(R.id.button4);
        final EditText numQuestion = findViewById(R.id.enterNum);
        final EditText passGrade = findViewById(R.id.enterGrade);
        numQuestion.setFilters(new InputFilter[]{ new InputFilters(1,100)});
        passGrade.setFilters(new InputFilter[]{new InputFilters(0,100)});
        numQuestion.setText(String.valueOf(sharedData.getNumberOfQuestions()));
        passGrade.setText(String.valueOf(sharedData.getaPssingGrade()));

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
                num = Integer.parseInt(((EditText)numQuestion).getText().toString());
                grade = Integer.parseInt(((EditText)passGrade).getText().toString());
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

                sharedData.setNumberOfQuestions(num);
                sharedData.setaPssingGrade(grade);
            }
        });
    }

}
