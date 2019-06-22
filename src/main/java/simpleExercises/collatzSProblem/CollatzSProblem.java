package simpleExercises.collatzSProblem;

import java.util.Scanner;

public class CollatzSProblem {
    private static String number = null;

    public static void main(String[] args) {

        System.out.println("Collatz's Problem application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number to check if application is working acc. to the Collatz's problem");
        number = scanner.nextLine();

        System.out.println("START\n");
        collatzSProblemMethod(number);
        System.out.println();
        System.out.println("Recursive version");
        System.out.println(collatzSProblemRecursiveMethod(number));
        System.out.println("\nSTOP");
    }


    private static int counterRecursive = 0;
    private static int maxNumberRecursive = Integer.MIN_VALUE;

    private static String collatzSProblemRecursiveMethod(String number) {


        int numberRecursive = Integer.parseInt(number);

        if (maxNumberRecursive < numberRecursive) {
            maxNumberRecursive = numberRecursive;
        }

        if (numberRecursive == 1) {
            return counterRecursive + " iterations were needed\n"
                    + maxNumberRecursive + " - it was the biggest number during iterations";

        } else if (numberRecursive % 2 == 0) {
            numberRecursive = numberRecursive / 2;
            counterRecursive++;
            return collatzSProblemRecursiveMethod(String.valueOf(numberRecursive));
        } else {
            numberRecursive = numberRecursive * 3 + 1;
            counterRecursive++;
            return collatzSProblemRecursiveMethod(String.valueOf(numberRecursive));
        }
    }

    private static void collatzSProblemMethod(String numberAsString) {
        System.out.println("Normal loop");
        int number = Integer.parseInt(numberAsString);
        int counter = 0;
        int maxNumber = Integer.MIN_VALUE;

        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
            counter++;

            if (maxNumber < number) {
                maxNumber = number;
            }
        }

        System.out.println(counter + " iterations were needed");
        System.out.println(maxNumber + " - it was the biggest number during iterations");
    }
}
