package com.example.certificatetestapp;

import android.text.InputFilter;
import android.text.Spanned;

public class InputFilters implements InputFilter {
    private int max;
    private int min;
    public InputFilters(int min, int max){
        this.min = min;
        this.max = max;
    }
    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        try {
            int input = Integer.parseInt(dest.subSequence(0, dstart).toString() + source + dest.subSequence(dend, dest.length()));
            if (isInRange(min, max, input))
                return null;
        }
        catch (NumberFormatException nfe) {
        }
        return "";
     }
    private boolean isInRange(int a, int b, int c) {
        return b > a ? c >= a && c <= b : c >= b && c <= a;
    }
}

