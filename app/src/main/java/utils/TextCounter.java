package utils;

public class TextCounter {
    public static String getCharsCount(String input) {
        return String.valueOf(input.length());
    }

    public static String getWordsCount(String input) {
        String[] words = input.split("[\\s,\\.]");
        int actualWords = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                actualWords++;
            }
        }
        return String.valueOf(actualWords);
    }
}
