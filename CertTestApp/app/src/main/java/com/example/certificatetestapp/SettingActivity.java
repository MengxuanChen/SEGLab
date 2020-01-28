package com.example.certificatetestapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.certificatetestapp.SharedData;
public class SettingActivity extends AppCompatActivity {
    private int num = 10;
    private int grade = 60;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        final SharedData sharedData = SharedData.getInstance();

        Log.d("Share",String.valueOf(sharedData.getaPssingGrade()));
        Log.d("Share",String.valueOf(sharedData.getNumberOfQuestions()));

        final Button apply= findViewById(R.id.button3);
        Button back= findViewById(R.id.button4);
        final EditText numQuestion = findViewById(R.id.enterNum);
        final EditText passGrade = findViewById(R.id.enterGrade);
        numQuestion.setFilters(new InputFilter[]{ new InputFilters(1,100)});
        passGrade.setFilters(new InputFilter[]{new InputFilters(1,100)});
        numQuestion.setText(String.valueOf(sharedData.getNumberOfQuestions()));
        passGrade.setText(String.valueOf(sharedData.getaPssingGrade()));
        RadioGroup radioGroup = findViewById(R.id.radioCategory);
        if(sharedData.getCert().equals("Math")){
            radioGroup.check(R.id.radioButton1);
        }else{
            radioGroup.check(R.id.radioButton2);
        }


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb = group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    Toast.makeText(SettingActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();
                }

            }
        });

        numQuestion.setOnClickListener(new View.OnClickListener() {
             @Override
              public void onClick(View v){
                 numQuestion.setHint("");
             }
        });

        passGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                passGrade.setHint("");
            }
        });

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
                sharedData.setCert(rb.getText().toString());

            }
        });
        numQuestion.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if(passGrade.length() == 0 || numQuestion.length()==0){
                apply.setEnabled(false);
                apply.setTextColor(Color.parseColor("#808080"));
            }else{
                apply.setTextColor(Color.parseColor("#FFFFFF"));
                    apply.setEnabled(true);
            }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {

            }
        });

        passGrade.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if(passGrade.length() == 0 || numQuestion.length()==0){
                    apply.setEnabled(false);
                    apply.setTextColor(Color.parseColor("#808080"));
                }else{
                    apply.setTextColor(Color.parseColor("#FFFFFF"));
                    apply.setEnabled(true);

                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {

            }
        });
    }

}
