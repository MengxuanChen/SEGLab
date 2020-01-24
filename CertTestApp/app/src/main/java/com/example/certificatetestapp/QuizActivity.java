package com.example.certificatetestapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import com.example.certificatetestapp.SharedData;


public class QuizActivity extends AppCompatActivity {
    TextView currentQuestion;
    
    Button nextButton,previousButton, quitButton;
    
    RadioGroup radioGroup;
    RadioButton optionOne, optionTwo, optionThree, optionFour;

    TextView playerName;

    String questions[] = {

    };
    String answers[] = {};
    String options[] = {

    };



    LinkedList<Integer> results=new LinkedList<>();
    int questionNumber= 0;
    final int choices = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final SharedData sharedData = SharedData.getInstance();

        playerName = (TextView) findViewById(R.id.textView);
        playerName.setText(getIntent().getStringExtra("name"));

        nextButton = (Button) findViewById(R.id.nextButton);
        previousButton = (Button) findViewById(R.id.previousButton);
        quitButton = (Button) findViewById(R.id.quitButton);

        currentQuestion=(TextView) findViewById(R.id.currentQuestion);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        optionOne = (RadioButton) findViewById(R.id.optionOne);
        optionTwo = (RadioButton) findViewById(R.id.optionTwo);
        optionThree = (RadioButton) findViewById(R.id.optionThree);
        optionFour = (RadioButton) findViewById(R.id.optionFour);

        questions = Arrays.copyOfRange(questions,0,sharedData.getNumberOfQuestions());
        options = Arrays.copyOfRange(options,0,sharedData.getNumberOfQuestions()*choices);
        answers = Arrays.copyOfRange(answers,0,sharedData.getNumberOfQuestions());


        currentQuestion.setText(questions[questionNumber]);
        optionOne.setText(options[0]);
        optionTwo.setText(options[1]);
        optionThree.setText(options[2]);
        optionFour.setText(options[3]);

        previousButton.setEnabled(false);
        previousButton.setTextColor(Color.parseColor("#808080"));
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Select an answer", Toast.LENGTH_SHORT).show();
                    return;
                }
                previousButton.setEnabled(true);
                previousButton.setTextColor(Color.parseColor("#ffffff"));
                RadioButton selectedAnswer = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                String selectedAnswerString = selectedAnswer.getText().toString();
                if (selectedAnswerString.equals(answers[questionNumber])) {
                    results.add(1);
                } else {
                    results.add(0);
                }

                questionNumber++;

                if (questionNumber< questions.length) {
                    currentQuestion.setText(questions[questionNumber]);
                    optionOne.setText(options[questionNumber* choices]);
                    optionTwo.setText(options[questionNumber* choices + 1]);
                    optionThree.setText(options[questionNumber* choices + 2]);
                    optionFour.setText(options[questionNumber* choices + 3]);
                }else{
                    int correct = 0;
                    for (int temp : results) {
                        if(temp == 1) {
                            correct++;
                        }
                    }
                    Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("correct",String.valueOf(correct));
                    startActivity(intent);
                }
                radioGroup.clearCheck();
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(results.isEmpty()){
                    return;
                }
                results.remove();
                questionNumber--;
                if(questionNumber== 0){
                    previousButton.setEnabled(false);
                    previousButton.setTextColor(Color.parseColor("#808080"));
                }
                if (questionNumber< questions.length) {
                    currentQuestion.setText(questions[questionNumber]);
                    optionOne.setText(options[questionNumber* choices]);
                    optionTwo.setText(options[questionNumber* choices + 1]);
                    optionThree.setText(options[questionNumber* choices + 2]);
                    optionFour.setText(options[questionNumber* choices + 3]);
                }
                radioGroup.clearCheck();
            }
        });


        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
