package simpleExercises.simpleDecryptionEncryption;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleDecryptionEncryption {
    public static void main(String[] args) {
        System.out.println("Simple Decryption Encryption application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write work to make decryption");
        String word = scanner.nextLine();

        System.out.println("START\n");
        System.out.println(simpleDecryptionEncryptionMethod(word));
        System.out.println("\nSTOP");
    }

    private static String simpleDecryptionEncryptionMethod(String word) {
        Map<Character, Character> map = mapOfCode();

        char[] newWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            char s = map.get(c);
            newWord[i] = s;
        }
        return String.valueOf(newWord);
    }

    private static Map<Character, Character> mapOfCode() {
        Map<Character, Character> mapOfCode = new HashMap<>();
        mapOfCode.put('a', 'z');
        mapOfCode.put('b', 'y');
        mapOfCode.put('c', 'x');
        mapOfCode.put('d', 'w');
        mapOfCode.put('e', 'v');
        mapOfCode.put('f', 'u');
        mapOfCode.put('g', 't');
        mapOfCode.put('h', 's');
        mapOfCode.put('i', 'r');
        mapOfCode.put('j', 'q');
        mapOfCode.put('k', 'p');
        mapOfCode.put('l', 'o');
        mapOfCode.put('m', 'n');
        mapOfCode.put('n', 'm');
        mapOfCode.put('o', 'l');
        mapOfCode.put('p', 'k');
        mapOfCode.put('q', 'j');
        mapOfCode.put('r', 'i');
        mapOfCode.put('s', 'h');
        mapOfCode.put('t', 'g');
        mapOfCode.put('u', 'f');
        mapOfCode.put('v', 'e');
        mapOfCode.put('w', 'd');
        mapOfCode.put('x', 'c');
        mapOfCode.put('y', 'b');
        mapOfCode.put('z', 'a');
        mapOfCode.put('A', 'Z');
        mapOfCode.put('B', 'Y');
        mapOfCode.put('C', 'X');
        mapOfCode.put('D', 'W');
        mapOfCode.put('E', 'V');
        mapOfCode.put('F', 'U');
        mapOfCode.put('G', 'T');
        mapOfCode.put('H', 'S');
        mapOfCode.put('I', 'R');
        mapOfCode.put('J', 'Q');
        mapOfCode.put('K', 'P');
        mapOfCode.put('L', 'O');
        mapOfCode.put('M', 'N');
        mapOfCode.put('N', 'M');
        mapOfCode.put('O', 'L');
        mapOfCode.put('P', 'K');
        mapOfCode.put('Q', 'J');
        mapOfCode.put('R', 'I');
        mapOfCode.put('S', 'H');
        mapOfCode.put('T', 'G');
        mapOfCode.put('U', 'F');
        mapOfCode.put('V', 'E');
        mapOfCode.put('W', 'D');
        mapOfCode.put('X', 'C');
        mapOfCode.put('Y', 'B');
        mapOfCode.put('Z', 'A');
        return mapOfCode;
    }
}
