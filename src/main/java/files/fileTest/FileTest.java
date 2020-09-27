package files.fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {

    private static final String fileName = "TestFile";

    public static void main(String[] args) {
        File file = new File(fileName);

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
            printWriter.println("Test Text - 1");
            printWriter.println("123456789");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String testText = scanner.nextLine();
            String testNumber = scanner.nextLine();

            System.out.println(testText);
            System.out.println(testNumber);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
