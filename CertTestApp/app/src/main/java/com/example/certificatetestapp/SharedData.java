package com.example.certificatetestapp;
import android.app.Application;

public class SharedData {

    private static SharedData instance = new SharedData();

    // Getter-Setters
    public static SharedData getInstance() {
        return instance;
    }

    public static void setInstance(SharedData instance) {
        SharedData.instance = instance;
    }

    private int numberOfQuestions;
    private int passingGrade;



    private SharedData() {
        this.numberOfQuestions = 10;
        this.passingGrade = 60;
    }


    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }
    public int getaPssingGrade() {
        return passingGrade;
    }

    public int setNumberOfQuestions(int num) {
        return this.numberOfQuestions = num;
    }
    public int setaPssingGrade(int num) {
        return this.passingGrade=num;
    }

}