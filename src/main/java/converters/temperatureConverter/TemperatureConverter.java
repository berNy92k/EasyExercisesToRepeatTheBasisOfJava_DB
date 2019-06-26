package converters.temperatureConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

// 1°C --> Kelwiny to 274,15 K

public class TemperatureConverter {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        System.out.println("TemperatureConverter application");

        System.out.println("START\n");
        temperatureConverterMethod();
        System.out.println("\nSTOP");
    }

    private static void temperatureConverterMethod() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose converter: ");
        System.out.println("1) From °C to K");
        System.out.println("2) From K to °C");
        String number = scanner.nextLine();

        switch (number) {
            case "1":
                System.out.println("Write number: .... °C");
                double c = Double.valueOf(scanner.nextLine());
                c = c + 273.15;
                System.out.println(df2.format(c));
                break;
            case "2":
                System.out.println("Write number: .... K");
                double k = Double.valueOf(scanner.nextLine());
                k = k - 273.15;
                System.out.println(df2.format(k));
                break;
            default:
                temperatureConverterMethod();
        }
    }
}
