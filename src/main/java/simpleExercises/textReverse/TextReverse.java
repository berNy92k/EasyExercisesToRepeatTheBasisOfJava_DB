package simpleExercises.textReverse;

// Reversing a text string (Pociąg -> gąicoP)

import java.util.Arrays;
import java.util.Scanner;

public class TextReverse {
    public static void main(String[] args) {
        System.out.println("Text Reverse application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write word to reverse");
        String text = scanner.nextLine();

        System.out.println("START\n");
        textReverseMethod(text);
        System.out.println("\nSTOP");
    }

    private static void textReverseMethod(String text) {
        String[] textByte = text.split("");
        System.out.println(Arrays.toString(textByte));

        if (textByte.length != text.length()) {
            return;
        }

        String[] textByteReversed = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            textByteReversed[i] = textByte[text.length() - i - 1];
        }

        System.out.println(Arrays.toString(textByteReversed));
    }
}
