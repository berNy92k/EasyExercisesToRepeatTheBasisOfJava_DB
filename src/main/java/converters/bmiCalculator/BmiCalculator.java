package converters.bmiCalculator;

import java.util.Scanner;

// BMI = weight (kg) ÷ height2 (m2)

// BMI	BMI Category
//      Less than 15	        Very severely underweight
//      Between 15 and 16	    Severely underweight
//      Between 16 and 18.5 	Underweight
//      Between 18.5 and 25	    Normal (healthy weight)
//      Between 25 and 30	    Overweight
//      Between 30 and 35   	Moderately obese
//      Between 35 and 40	    Severely obese
//      Over 40	                Very severely obese

public class BmiCalculator {
    public static void main(String[] args) {
        System.out.println("BmiCalculator application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your weight(kg)");
        String weight = scanner.nextLine();
        System.out.println("Write your height(meters)");
        String height = scanner.nextLine();

        System.out.println("START\n");
        bmiCalculatorMethod(weight, height);
        System.out.println("\nSTOP");
    }

    private static void bmiCalculatorMethod(String weight, String height) {
        double weightDouble = Double.parseDouble(weight);
        double heightDouble = Double.parseDouble(height);
        double BMI = weightDouble / (heightDouble * heightDouble);

        if (BMI < 15) {
            System.out.println("Very severely underweight");
        } else if (BMI > 15 && BMI <= 16) {
            System.out.println("Severely underweight");
        } else if (BMI > 16 && BMI <= 18.5) {
            System.out.println("Underweight");
        } else if (BMI > 18.5 && BMI <= 25) {
            System.out.println("Normal (healthy weight)");
        } else if (BMI > 25 && BMI <= 30) {
            System.out.println("Overweight");
        } else if (BMI > 30 && BMI <= 35) {
            System.out.println("Moderately obese");
        } else if (BMI > 35 && BMI <= 40) {
            System.out.println("Severely obese");
        } else {
            System.out.println("Very severely obese");
        }
    }
}
