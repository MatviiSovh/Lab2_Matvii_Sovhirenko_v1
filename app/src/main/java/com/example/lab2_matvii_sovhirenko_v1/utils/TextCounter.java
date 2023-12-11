package com.example.lab2_matvii_sovhirenko_v1.utils;


public class TextCounter {
    public static String getCharsCount(String input) {
        if (input == null || input.length()==0){
            return "Result: The input line is empty!";
        }
        else {
            return "The number of chars is: " + String.valueOf(input.length());
        }
    }

    public static String getWordsCount(String input) {
        if (input == null || input.trim().isEmpty()){
            return "Result: The input line is empty!";
        }
        else{
            String[] words = input.split("[\\s,\\.]");
            int actualWords = 0;
            for (String word : words) {
                if (!word.isEmpty()) {
                    actualWords++;
                }
            }
            return "The number of words is: " + String.valueOf(actualWords);
        }
    }
}
