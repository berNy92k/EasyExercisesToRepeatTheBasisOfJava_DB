package simpleExercises.palindromeAndAnagram;

import java.util.Arrays;
import java.util.Scanner;

// Palindrom --> Kobyła ma mały bok --> brzmi tak samo czytane od przodu jak i od tylu


public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Palindrome application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write text to check if it is a palindrome");
        String text = scanner.nextLine();

        System.out.println("START\n");
        palindromMethod(text);
        System.out.println("\nSTOP");
    }

    private static void palindromMethod(String text) {
        text = text.replace(" ", "").toLowerCase();
        int size = text.length();
        char[] palindrome = text.toCharArray();
        char[] isPalindrome = new char[size];
        for (int i = 0; i < size; i++) {
            isPalindrome[i] = palindrome[size - 1 - i];
        }
        System.out.println(Arrays.equals(isPalindrome, palindrome) ? text + " -> it is a palindrome" : text + " -> it is not a palindrome");
    }
}
