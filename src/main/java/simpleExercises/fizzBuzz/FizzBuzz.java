package simpleExercises.fizzBuzz;

// An example of a Fizz-Buzz question is the following:
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print "Fizz" instead of the number
// and for the multiples of five print "Buzz".
// For numbers which are multiples of both three and five print "FizzBuzz".

public class FizzBuzz {
    private static int loopFrom = 1;
    private static int loopTo = 100;

    private static String fizz = "Fizz";
    private static int multiplesForFizz = 3;
    private static String buzz = "Buzz";
    private static int multiplesForBuzz = 5;
    private static String fizzBuzz = "FizzBuzz";


    public static void main(String[] args) {
        System.out.println("FIZZ-BUZZ application");
        System.out.println("Loop from " + loopFrom + " to " + loopTo);
        System.out.println(fizz + " - multiple by " + multiplesForFizz);
        System.out.println(buzz + " - multiple by " + multiplesForBuzz);
        System.out.println(fizzBuzz + " - multiple by " + multiplesForFizz + " and " + multiplesForBuzz);
        System.out.println("START\n");
        fizzBuzzMethod();
        System.out.println("\nSTOP");
    }

    private static void fizzBuzzMethod() {
        for (int i = loopFrom; i <= loopTo; i++) {
            System.out.print(i + ") ");
            if (i % multiplesForFizz == 0
                    && i % multiplesForBuzz == 0) {
                System.out.println(fizzBuzz);
            } else {
                if (i % multiplesForFizz == 0) {
                    System.out.println(fizz);
                } else if (i % multiplesForBuzz == 0) {
                    System.out.println(buzz);
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
