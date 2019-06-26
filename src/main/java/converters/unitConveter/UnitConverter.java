package converters.unitConveter;

import java.util.Scanner;

public class UnitConverter {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("UnitConverter application");

        System.out.println("START\n");
        unitConverterMethod();
        System.out.println("\nSTOP");
    }

    private static void unitConverterMethod() {
        System.out.println("Choose unit to convert (the only one working for now is 'Lenght': ");
        System.out.println("1) Length ");
        System.out.println("2) Time ");
        System.out.println("3) Pressures");
        System.out.println("4) Energy");
        System.out.println("5) Quantities");
        System.out.println("6) Weight");
        System.out.println("7) Power");
        System.out.println("8) Volume");
        System.out.println("9) Data Capacity");
        System.out.println("10) Surface");
        System.out.println("11) Speeds");
        System.out.println("12) Temperatures");

        switch (scanner.nextLine()) {
            case "1":
                lengthConverter();
                break;
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "11":
            case "12":
            default:
                System.out.println("Only length converter is working right now. ");
        }
    }

    private static void lengthConverter() {
        System.out.println("1) mm to cm");
        System.out.println("2) mm to m");
        System.out.println("3) cm to m");
        System.out.println("4) cm to mm");
        System.out.println("5) m to cm");
        System.out.println("6) m to mm");
        switch (scanner.nextLine()) {
            case "1":
                System.out.println("Write number in mm to convert for cm");
                double mmc = Integer.parseInt(scanner.nextLine());
                System.out.println(mmc + " mm --> " + (mmc / 10) + " cm");
                break;
            case "2":
                System.out.println("Write number in mm to convert for m");
                double mmm = Integer.parseInt(scanner.nextLine());
                System.out.println(mmm + " mm --> " + (mmm / 1000) + " m");
                break;
            case "3":
                System.out.println("Write number in cm to convert for m");
                double cmm = Integer.parseInt(scanner.nextLine());
                System.out.println(cmm + " cm --> " + (cmm / 100) + " m");
                break;
            case "4":
                System.out.println("Write number in cm to convert for mm");
                double cmmm = Integer.parseInt(scanner.nextLine());
                System.out.println(cmmm + " cm --> " + (cmmm * 10) + " mm");
                break;
            case "5":
                System.out.println("Write number in m to convert for cm");
                double mcm = Integer.parseInt(scanner.nextLine());
                System.out.println(mcm + " m --> " + (mcm * 100) + " cm");
                break;
            case "6":
                System.out.println("Write number in m to convert for mm");
                double mmm2 = Integer.parseInt(scanner.nextLine());
                System.out.println(mmm2 + " m --> " + (mmm2 * 1000) + " mm");
                break;
            default:
                System.out.println("Only length converter is working. ");
        }

    }
}
