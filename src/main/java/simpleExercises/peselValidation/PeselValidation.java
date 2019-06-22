package simpleExercises.peselValidation;

//        9×a + 7×b + 3×c + 1×d + 9×e + 7×f + 3×g + 1×h + 9×i + 7×j
//
//        PESEL 44051401358:
//        9×4 + 7×4 + 3×0 + 1×5 + 9×1 + 7×4 + 3×0 + 1×1 + 9×3 + 7×5 = 169
//
//        169:10 = 16/ modulo = 9
//
//        9 != 8 --> NOT CORRECT PESEL

import java.util.Scanner;

public class PeselValidation {
    private static final int[] weight = new int[]{1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

    public static void main(String[] args) {
        System.out.println("PESEL Vaildation application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your PESEL to check if it is confirm");
        String peselNumber = scanner.nextLine();

        System.out.println("START\n");
        peselValidationMethod(peselNumber);
        System.out.println("\nSTOP");
    }

    private static void peselValidationMethod(String peselNumber) {
        if (peselNumber.length() != 11) {
            System.out.println("Wrong PESEL. It doesn't have 11 digits");
            return;
        } else {
            int controlNumber = (Integer.parseInt(String.valueOf(peselNumber.charAt(10))));
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + ((Integer.parseInt(String.valueOf(peselNumber.charAt(i)))) * weight[i]);
            }
            sum = sum % 10;
            sum = 10 - sum;
            if (sum == controlNumber) {
                System.out.println("PESEL is correct");
            } else {
                System.out.println("Pesel is not correct");
            }
        }
    }
}
