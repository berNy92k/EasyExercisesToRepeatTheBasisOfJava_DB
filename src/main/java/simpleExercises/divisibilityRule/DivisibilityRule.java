package simpleExercises.divisibilityRule;

import java.time.LocalDate;
import java.util.Scanner;

public class DivisibilityRule {
    public static void main(String[] args) {
        System.out.println("Divisibility Rule application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number to check DivisibilityRule");
        String number = scanner.nextLine();

        System.out.println("START\n");
        divisibilityRuleMethod(number);
        System.out.println("\nSTOP");
    }

    private static void divisibilityRuleMethod(String number) {
        long integer = Long.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Number: ").append(integer).append("\n");
        for (long i = 1; i <= (integer / 2); i++) {
            if (integer % i == 0) {
                if (i == integer) {
                    stringBuilder.append(i);
                } else {
                    stringBuilder.append(i).append(",");
                }
            }
        }
        stringBuilder.append(integer);
        System.out.println(stringBuilder);
    }
}
