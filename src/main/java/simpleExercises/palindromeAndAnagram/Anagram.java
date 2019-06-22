package simpleExercises.palindromeAndAnagram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// Anagram --> kebab – babek, krasa, Arska, raska, sarka, askar, kasar, Raksa, sakra, Arkas, Araks, Karsa, rakas, Karas, Sakar, Skara, Askra

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Anagram application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first word: ");
        String firstText = scanner.nextLine();
        System.out.println("Write second word: ");
        String secondText = scanner.nextLine();

        System.out.println("START\n");
        anagramMethod(firstText, secondText);
        System.out.println("\nSTOP");
    }

    private static void anagramMethod(String firstText, String secondText) {
        if (firstText.length() != secondText.length()) {
            System.out.println("This two words are not anagrams");
            return;
        }
        char[] firstTextChar = firstText.toCharArray();
        char[] secondTextChar = secondText.toCharArray();

        bubbleLoop(firstTextChar);
        bubbleLoop(secondTextChar);

        if (Arrays.equals(firstTextChar, secondTextChar)) {
            System.out.println("This two words are anagrams");
        } else {
            System.out.println("This two words are not anagrams");
        }
    }

    private static void bubbleLoop(char[] text) {
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text.length; j++) {
                if (text[i] > text[j]) {
                    char temp = text[j];
                    text[j] = text[i];
                    text[i] = temp;
                }
            }
        }
    }
}
