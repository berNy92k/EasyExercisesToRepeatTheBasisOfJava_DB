package simpleExercises.factorialMath;

import java.util.Scanner;

// 3! = 1*2*3;
// 5! = 1*2*3*4*5;

public class factorialMath {
    public static void main(String[] args) {
        System.out.println("Factorial Math application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number to calculate factorial");
        String number = scanner.nextLine();

        System.out.println("START\n");
        factorialMathMethod(number);
        System.out.println("\nSTOP");
    }

    private static void factorialMathMethod(String numberString) {
        int number = Integer.valueOf(numberString);

        long sum = 1;
        for (long i = 1; i <= number; i++) {
            sum = sum * i;
        }

        System.out.println("Value: " + sum);
    }
}
