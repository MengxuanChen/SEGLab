package com.example.certificatetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText playerName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Welcome Page action
        final Button start=(Button)findViewById(R.id.button);
        start.setEnabled(false);
        start.setTextColor(Color.parseColor("#808080"));

        Button setting=(Button)findViewById(R.id.button2);
        playerName = (EditText)findViewById(R.id.enterName);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizIntent=new Intent(getApplicationContext(),QuizActivity.class);
                quizIntent.putExtra("name","Hi "+playerName.getText().toString()+",");
                startActivity(quizIntent);
            }
        });
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SettingActivity.class);
                startActivity(intent);
            }
        });

        playerName.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if(playerName.length() == 0 ){
                    start.setEnabled(false);
                    start.setTextColor(Color.parseColor("#808080"));
                }else{
                    start.setTextColor(Color.parseColor("#FFFFFF"));
                    start.setEnabled(true);

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
