package com.example.lab2_matvii_sovhirenko_v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainActivityUnitTest {

    @Test
    public void testCountCharactersEmptyInput() {
        String inputText = "";
        String expectedResult = "Result: The input line is empty!";
        String actualResult = MainActivity.countCharacters(inputText);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountCharactersValidInput() {
        String inputText = "Hello, world!";
        String expectedResult = "The number of chars is: 13";
        String actualResult = MainActivity.countCharacters(inputText);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsEmptyInput() {
        String inputText = "";
        String expectedResult = "Result: The input line is empty!";
        String actualResult = MainActivity.countWords(inputText);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCountWordsValidInput() {
        String inputText = "Hello, world!";
        String expectedResult = "The number of words is: 2";
        String actualResult = MainActivity.countWords(inputText);
        assertEquals(expectedResult, actualResult);
    }
}
