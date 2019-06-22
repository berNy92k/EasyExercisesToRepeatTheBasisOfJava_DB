package simpleExercises.stonePaperShears;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {
    private static Map<String, String> mapOfPower = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int counterPlayer = 0;
    private static int counterComputer = 0;

    public static void main(String[] args) {
        System.out.println("StonePaperScissors application");

        mapOfPower.put("Stone", "Scissors");
        mapOfPower.put("Paper", "Stone");
        mapOfPower.put("Scissors", "Paper");

        System.out.println("START\n");
        stonePaperScissorsMethod();

        if (counterComputer == 3) {
            System.out.println("Computer win ! " + counterComputer + ":" + counterPlayer);
        } else {
            System.out.println("Player win ! " + counterPlayer + ":" + counterComputer);
        }

        System.out.println("\nSTOP");
    }

    private static String powerMethod() {
        System.out.println("Choose your power: ");
        System.out.println("1) Stone");
        System.out.println("2) Paper");
        System.out.println("3) Scissors");
        return scanner.nextLine();
    }

    private static void stonePaperScissorsMethod() {
        while (true) {

            String playerPower = powerSwitch(powerMethod());

            Random random = new Random();
            int i = random.nextInt(3) + 1;
            String computerPower = powerSwitch(String.valueOf(i));

            System.out.println(playerPower);
            System.out.println(computerPower);


            String ply = mapOfPower.get(playerPower);
            String com = mapOfPower.get(computerPower);

            if (ply.equals(computerPower)) {
                counterPlayer++;
            } else if (com.equals(playerPower)) {
                counterComputer++;
            } else {
                stonePaperScissorsMethod();
            }

            if (counterPlayer == 3
                    || counterComputer == 3) {
                break;
            }
        }
    }

    private static String powerSwitch(String number) {
        String power = "";
        switch (number) {
            case "1":
                power = "Stone";
                break;
            case "2":
                power = "Paper";
                break;
            case "3":
                power = "Scissors";
                break;
            default:
                stonePaperScissorsMethod();
        }
        return power;
    }
}
