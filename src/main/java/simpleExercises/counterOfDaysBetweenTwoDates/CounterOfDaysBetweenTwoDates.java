package simpleExercises.counterOfDaysBetweenTwoDates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CounterOfDaysBetweenTwoDates {


    public static void main(String[] args) {
        System.out.println("Counter Of Days Between Two Dates application");

        System.out.println("START\n");
        counterOfDaysBetweenTwoDatesMethod();
        System.out.println("\nSTOP");
    }

    private static void counterOfDaysBetweenTwoDatesMethod() {
        LocalDate d1 = LocalDate.of(2012, Month.JANUARY, 12);
        LocalDate d2 = LocalDate.of(1992, Month.JANUARY, 16);

        String between = String.valueOf(ChronoUnit.DAYS.between(d1, d2));
        System.out.println((between.startsWith("-") ? between.replace("-", "") : between) + " days");
    }
}
