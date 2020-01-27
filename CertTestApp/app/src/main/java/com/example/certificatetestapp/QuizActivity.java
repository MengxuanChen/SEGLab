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

    //https://codingcompiler.com/core-java-multiple-choice-questions-answers/ Quiz Questions
    String questions_coding[] = {
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?",
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?",
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?",
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?",
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?",
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?",
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?",
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?",
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?",
            "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as",
            "What is the most popular programming language?",
            "What is the most efficient programming language?",
            "What is the sign for bitwise AND?",
            "What is the sign for bitwise OR?",
            "What is the signature for main in Java?",
            "When was C created?",
            "When was Java created?",
            "Which one of these is the closest to hardware?",
            "Which of the following programming languages uses Pandas?"

    };
    String options_coding[] = {
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R",
            "Encapsulation","Polymorphism","Abstraction","Inheritance",
            "C","Java","Python","JavaScript",
            "Assembly","JavaScript","Python","Java",
            "|","&","^","#",
            "|","&","^","#",
            "static","void","main","args",
            "1869","1970","1971","1972",
            "1996","1997","1998","1999",
            "C","C++","Java","Assembly",
            "Java","Python","C#","R"
    };
    String answers_coding[] = {
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
            "Abstraction",
            "C",
            "Assembly",
            "&",
            "|",
            "void",
            "1972",
            "1996",
            "Assembly",
            "Python",
    };

    String questions[] = {};
    String options[] = {};
    String answers[] ={};




    LinkedList<Integer> results=new LinkedList<>();
    int questionNumber= 0;
    final int choices = 4;

    String questions_math[] = {
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?",
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?",
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?",
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?",
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?",
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?",
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?",
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?",
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?",
            "What is 5x5 ?",
            "What is 10x10 ?",
            "What is 2x5 ?",
            "What is 2x2 ?",
            "What is 20x3 ?",
            "What is 90/3 ?",
            "What is 22x3 ?",
            "What is 100-7 ?",
            "What is 50+2 ?",
            "What is 20/4 ?"
    };
    String options_math[] ={
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8",
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8",
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8",
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8",
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8",
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8",
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8",
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8",
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8",
            "25","30","35","40",
            "1000","24","33","100",
            "10","12","13","15",
            "3","4","2","5",
            "6","66","16","60",
            "30","31","33","12",
            "55","66","77","88",
            "12","98","97","99",
            "51","52","25","14",
            "5","6","4","8"
    };
    String answers_math[] ={
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
            "25",
            "100",
            "10",
            "4",
            "60",
            "30",
            "66",
            "97",
            "52",
            "5",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final SharedData sharedData = SharedData.getInstance();

        if(sharedData.getCert().equals("Coding")){
            questions = questions_coding;
            options = options_coding;
            answers = options_coding;
        }else {
            questions = questions_math;
            options = options_math;
            answers = answers_math;
        }

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
