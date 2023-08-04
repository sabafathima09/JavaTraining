package com.shristi.objbasics;

import java.util.Scanner;

public class MaxOccurrenceOfLetterInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next().toLowerCase();

        int[] letterCount = new int[26];
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount[ch - 'a']++;
            }
        }

        char maxLetter = 'a';
        int maxOccurrence = 0;
        for (int i = 0; i < 26; i++) {
            if (letterCount[i] > maxOccurrence) {
                maxOccurrence = letterCount[i];
                maxLetter = (char) ('a' + i);
            }
        }

        System.out.println("The letter '" + maxLetter + "' occurs the most in the word, " +
                "with a count of " + maxOccurrence + " times.");
    }
}
