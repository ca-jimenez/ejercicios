package com.example.demo.Services;

import java.util.HashMap;

public class MorseService {
    // store the all the alphabet in an array
    private static final char[] letters = {
            'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0'};
    // Morse code by indexing
    private static final String[] codes = {
            ".-", "-...", "-.-.", "-..", ".",
            "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---",
            ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--",
            "--..", ".----", "..---", "...--", "....-",
            ".....", "-....", "--...", "---..", "----.", "-----"};

    private static final HashMap<String, Character> morseTable = new HashMap<>();

    static {

        for (int i = 0; i < letters.length; i++) {

            morseTable.put(codes[i], letters[i]);
        }
    }

    private static String[] splitIntoWords(String morseMessage) {
        return morseMessage.split("   ");
    }

    public static String translate(String morseMessage) {

        String result = "";
        String[] wordsMorse = splitIntoWords(morseMessage);

        for (String word : wordsMorse) {
            result += translateMorseWord(word) + " ";
        }
        return result.substring(0, result.length() - 1);
    }

    private static String translateMorseWord(String morseCode) {

        String result = "";
        String[] array = morseCode.split(" ");

        // Morse code to English
        for (String s : array) {

            result += morseTable.get(s);
        }
        return result;
    }
}

