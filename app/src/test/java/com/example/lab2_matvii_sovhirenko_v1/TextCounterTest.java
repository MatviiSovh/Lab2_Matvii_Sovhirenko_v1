package com.example.lab2_matvii_sovhirenko_v1;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.lab2_matvii_sovhirenko_v1.utils.TextCounter;

public class TextCounterTest {
    @Test
    public void testCountCharactersEmptyInput(){
        final String inputText = "";
        final String expectedResult = "Result: The input line is empty!";

        final String actualResult = TextCounter.getCharsCount(inputText);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsEmptyInput() {
        final String inputText = "";
        final String expectedResult = "Result: The input line is empty!";
        final String actualResult = TextCounter.getWordsCount(inputText);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCountCharactersValidInput() {
        final String inputText = "Hello, world!";
        final String expectedResult = "The number of chars is: 13";
        final String actualResult = TextCounter.getCharsCount(inputText);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsValidInput() {
        final String inputText = "Hello, world!";
        final String expectedResult = "The number of words is: 2";
        final String actualResult = TextCounter.getWordsCount(inputText);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testCountCharactersWordsWithSpacesInput() {
        final String inputText = "Hello,        world!";
        final String expectedResult = "The number of chars is: 20";
        final String actualResult = TextCounter.getCharsCount(inputText);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsWordsWithSpacesInput() {
        final String inputText = "Hello,        world!";
        final String expectedResult = "The number of words is: 2";
        final String actualResult = TextCounter.getWordsCount(inputText);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountCharactersSpacesInput() {
        final String inputText = "   ";
        final String expectedResult = "The number of chars is: 3";
        final String actualResult = TextCounter.getCharsCount(inputText);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsSpacesInput() {
        final String inputText = "   ";
        final String expectedResult = "Result: The input line is empty!";
        final String actualResult = TextCounter.getWordsCount(inputText);
        assertEquals(expectedResult, actualResult);
    }
}