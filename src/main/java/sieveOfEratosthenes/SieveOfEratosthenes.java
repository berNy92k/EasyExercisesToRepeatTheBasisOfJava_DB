package sieveOfEratosthenes;

import java.util.LinkedList;
import java.util.List;

public class SieveOfEratosthenes {
    private final int beginNumber = 2;
    private int n = 120;
    private List<Integer> primeNumbersList = null;

    public static void main(String[] args) {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        sieveOfEratosthenes.initMethod();
    }

    public void initMethod() {
        getIntegersList();
        sieveOfEratosthenesMethod();
        printPrimeNumbers();
    }

    private void sieveOfEratosthenesMethod() {
        for (int i = 0; i < primeNumbersList.size(); i++) {
            int primeNumber = primeNumbersList.get(i);
            for (int j = 1; j <= n / 2; j++) {
                int multipleOfTheNumber = primeNumber * j;
                if (multipleOfTheNumber != primeNumber) {
                    primeNumbersList.remove((Integer) multipleOfTheNumber);
                }
                if (primeNumbersList.get(primeNumbersList.size() - 1) <= multipleOfTheNumber) {
                    break;
                }
            }
        }
    }

    private void getIntegersList() {
        if (primeNumbersList == null) {
            primeNumbersList = new LinkedList<>();
        }

        for (int i = beginNumber; i <= n; i++) {
            primeNumbersList.add(i);
        }
    }

    private void printPrimeNumbers() {
        int i = 1;
        System.out.println("----- Prime Numbers -----");
        System.out.println("'Number': 'primeNumber'");
        for (Integer integer : primeNumbersList) {
            System.out.println(i++ + ": " + integer);
        }
        System.out.println("----- END -----");
        System.out.println(--i + " prime numbers in first " + n + " numbers.");

    }
}
