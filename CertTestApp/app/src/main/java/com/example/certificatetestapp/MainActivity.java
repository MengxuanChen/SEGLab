package com.example.certificatetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getActionBar().hide();
        setContentView(R.layout.activity_main);
        Button start=(Button)findViewById(R.id.button);
        Button setting=(Button)findViewById(R.id.button2);
    }
}
