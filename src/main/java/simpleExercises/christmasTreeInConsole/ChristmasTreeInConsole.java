package simpleExercises.christmasTreeInConsole;

import java.util.Scanner;

public class ChristmasTreeInConsole {
    public static void main(String[] args) {
        System.out.println("Christmas Tree In Console application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big must be the tree ?? (height)");
        String number = scanner.nextLine();

        System.out.println("START\n");
        christmasTreeInConsoleMethod(number);
        System.out.println("\nSTOP");
    }

    private static void christmasTreeInConsoleMethod(String number) {
        int height = Integer.parseInt(number);
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if (i != 1) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
