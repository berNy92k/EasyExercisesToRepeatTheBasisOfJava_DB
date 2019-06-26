package converters.textConverterForTheMorsaCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeConverter {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Character, String> mapOfTextMorseCode = new HashMap<>();
    private static Map<String, Character> mapOfMorseCodeText = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("MorseCodeConverter application");

        System.out.println("START\n");
        chooseMethod();
        System.out.println("\nSTOP");
    }

    private static void chooseMethod() {
        System.out.println("Choose option:");
        System.out.println("1 - Latin text to Morse Code");
        System.out.println("2 - Morse Code to Latin text");

        String text = "";
        switch (scanner.nextLine()) {
            case "1":
                initMapOfText_MorseCode();
                System.out.println("Write text to convert it for morse code");
                text = scanner.nextLine();
                textToMorseMethod(text);
                break;
            case "2":
                initMapOfMorseCode_Text();
                System.out.println("Write morse code to convert it for text");
                text = scanner.nextLine();
                morseToTextMethod(text);
                break;
            default:
                System.out.println("Wrong choose. Try again.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                chooseMethod();
        }
    }

    private static void morseToTextMethod(String text) {
        String[] wordSplit = text.split(" {7}");
        System.out.println(wordSplit.length);
        StringBuilder latinText = new StringBuilder();
        for (int i = 0; i < wordSplit.length; i++) {
            String[] letterSplit = wordSplit[i].split(" {2}");
            System.out.println(letterSplit.length);
            for (int j = 0; j < letterSplit.length; j++) {
                if (mapOfMorseCodeText.containsKey(letterSplit[j])) {
                    char s = mapOfMorseCodeText.get(letterSplit[j]);
                    latinText.append(s);
                }
            }
            latinText.append(" ");
        }
        System.out.println(latinText);
    }

    private static void textToMorseMethod(String text) {
        int length = text.length();
        String textLower = text.toLowerCase();
        StringBuilder morseCode = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = textLower.charAt(i);
            String s = mapOfTextMorseCode.get(c);
            morseCode.append(s).append("  ");
        }
        System.out.println(morseCode);
    }

    private static void initMapOfMorseCode_Text() {
        mapOfMorseCodeText.put("   ", ' ');

        mapOfMorseCodeText.put("• —", 'a');
        mapOfMorseCodeText.put("— • • •", 'b');
        mapOfMorseCodeText.put("— • — •", 'c');
        mapOfMorseCodeText.put("— • •", 'd');
        mapOfMorseCodeText.put("•", 'e');
        mapOfMorseCodeText.put("• • — •", 'f');
        mapOfMorseCodeText.put("— — •", 'g');
        mapOfMorseCodeText.put("• • • •", 'h');
        mapOfMorseCodeText.put("• •", 'i');
        mapOfMorseCodeText.put("• — — —", 'j');
        mapOfMorseCodeText.put("— • —", 'k');
        mapOfMorseCodeText.put("• — • •", 'l');
        mapOfMorseCodeText.put("— —", 'm');
        mapOfMorseCodeText.put("— •", 'n');
        mapOfMorseCodeText.put("— — —", 'o');
        mapOfMorseCodeText.put("• — — •", 'p');
        mapOfMorseCodeText.put("— — • —", 'q');
        mapOfMorseCodeText.put("• — •", 'r');
        mapOfMorseCodeText.put("• • •", 's');
        mapOfMorseCodeText.put("—", 't');
        mapOfMorseCodeText.put("• • —", 'u');
        mapOfMorseCodeText.put("• • • —", 'v');
        mapOfMorseCodeText.put("• — —", 'w');
        mapOfMorseCodeText.put("— • • —", 'x');
        mapOfMorseCodeText.put("— • — —", 'y');
        mapOfMorseCodeText.put("— — • •", 'z');
        mapOfMorseCodeText.put("• — • —", 'ą');
        mapOfMorseCodeText.put("— • — • •", 'ć');
        mapOfMorseCodeText.put("• • — • •", 'ę');
        mapOfMorseCodeText.put("• • — • •", 'é');
        mapOfMorseCodeText.put("• — • • —", 'ł');
        mapOfMorseCodeText.put("— — • — —", 'ń');
        mapOfMorseCodeText.put("— — — •", 'ó');
        mapOfMorseCodeText.put("• • • — • • •", 'ś');
        mapOfMorseCodeText.put("— — • • — •", 'ż');
        mapOfMorseCodeText.put("— — • • —", 'ź');

        mapOfMorseCodeText.put("• — — — —", '1');
        mapOfMorseCodeText.put("• • — — —", '2');
        mapOfMorseCodeText.put("• • • — —", '3');
        mapOfMorseCodeText.put("• • • • —", '4');
        mapOfMorseCodeText.put("• • • • •", '5');
        mapOfMorseCodeText.put("— • • • •", '6');
        mapOfMorseCodeText.put("— — • • •", '7');
        mapOfMorseCodeText.put("— — — • •", '8');
        mapOfMorseCodeText.put("— — — — •", '9');
        mapOfMorseCodeText.put("— — — — —", '0');

        mapOfMorseCodeText.put("• — • — • —", '.');
        mapOfMorseCodeText.put("— — • • — —", ',');
        mapOfMorseCodeText.put("• — — — — •", '\'');
        mapOfMorseCodeText.put("• — • • — •", '\"');
        mapOfMorseCodeText.put("• • — — • —", '_');
        mapOfMorseCodeText.put("— — — • • •", ':');
        mapOfMorseCodeText.put("— • — • — •", ';');
        mapOfMorseCodeText.put("• • — — • •", '?');
        mapOfMorseCodeText.put("— • — • — —", '!');
        mapOfMorseCodeText.put("— • • • • —", '-');
        mapOfMorseCodeText.put("• — • — •", '+');
        mapOfMorseCodeText.put("— • • — •", '/');
        mapOfMorseCodeText.put("— • — — •", '(');
        mapOfMorseCodeText.put("— • — — • —", ')');
        mapOfMorseCodeText.put("— • • • —", '=');
        mapOfMorseCodeText.put("• — — • — •", '@');
    }

    private static void initMapOfText_MorseCode() {
        mapOfTextMorseCode.put(' ', "   ");

        mapOfTextMorseCode.put('a', "• —");
        mapOfTextMorseCode.put('b', "— • • •");
        mapOfTextMorseCode.put('c', "— • — •");
        mapOfTextMorseCode.put('d', "— • •");
        mapOfTextMorseCode.put('e', "•");
        mapOfTextMorseCode.put('f', "• • — •");
        mapOfTextMorseCode.put('g', "— — •");
        mapOfTextMorseCode.put('h', "• • • •");
        mapOfTextMorseCode.put('i', "• •");
        mapOfTextMorseCode.put('j', "• — — —");
        mapOfTextMorseCode.put('k', "— • —");
        mapOfTextMorseCode.put('l', "• — • •");
        mapOfTextMorseCode.put('m', "— —");
        mapOfTextMorseCode.put('n', "— •");
        mapOfTextMorseCode.put('o', "— — —");
        mapOfTextMorseCode.put('p', "• — — •");
        mapOfTextMorseCode.put('q', "— — • —");
        mapOfTextMorseCode.put('r', "• — •");
        mapOfTextMorseCode.put('s', "• • •");
        mapOfTextMorseCode.put('t', "—");
        mapOfTextMorseCode.put('u', "• • —");
        mapOfTextMorseCode.put('v', "• • • —");
        mapOfTextMorseCode.put('w', "• — —");
        mapOfTextMorseCode.put('x', "— • • —");
        mapOfTextMorseCode.put('y', "— • — —");
        mapOfTextMorseCode.put('z', "— — • •");

        mapOfTextMorseCode.put('ą', "• — • —");
        mapOfTextMorseCode.put('ć', "— • — • •");
        mapOfTextMorseCode.put('ę', "• • — • •");
        mapOfTextMorseCode.put('é', "• • — • •");
        mapOfTextMorseCode.put('ł', "• — • • —");
        mapOfTextMorseCode.put('ń', "— — • — —");
        mapOfTextMorseCode.put('ó', "— — — •");
        mapOfTextMorseCode.put('ś', "• • • — • • •");
        mapOfTextMorseCode.put('ż', "— — • • — •");
        mapOfTextMorseCode.put('ź', "— — • • —");

        mapOfTextMorseCode.put('1', "• — — — —");
        mapOfTextMorseCode.put('2', "• • — — —");
        mapOfTextMorseCode.put('3', "• • • — —");
        mapOfTextMorseCode.put('4', "• • • • —");
        mapOfTextMorseCode.put('5', "• • • • •");
        mapOfTextMorseCode.put('6', "— • • • •");
        mapOfTextMorseCode.put('7', "— — • • •");
        mapOfTextMorseCode.put('8', "— — — • •");
        mapOfTextMorseCode.put('9', "— — — — •");
        mapOfTextMorseCode.put('0', "— — — — —");

        mapOfTextMorseCode.put('.', "• — • — • —");
        mapOfTextMorseCode.put(',', "— — • • — —");
        mapOfTextMorseCode.put('\'', "• — — — — •");
        mapOfTextMorseCode.put('\"', "• — • • — •");
        mapOfTextMorseCode.put('_', "• • — — • —");
        mapOfTextMorseCode.put(':', "— — — • • •");
        mapOfTextMorseCode.put(';', "— • — • — •");
        mapOfTextMorseCode.put('?', "• • — — • •");
        mapOfTextMorseCode.put('!', "— • — • — —");
        mapOfTextMorseCode.put('-', "— • • • • —");
        mapOfTextMorseCode.put('+', "• — • — •");
        mapOfTextMorseCode.put('/', "— • • — •");
        mapOfTextMorseCode.put('(', "— • — — •");
        mapOfTextMorseCode.put(')', "— • — — • —");
        mapOfTextMorseCode.put('=', "— • • • —");
        mapOfTextMorseCode.put('@', "• — — • — •");
    }
}
