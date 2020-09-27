package files.readCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    private static final String fileName = "csvExample.csv";
    private static final String COMMA_SEPARATOR = ",";

    private static List<TestObject> testObjects = null;

    public static void main(String[] args) {
        createEmptyList();

        readDataFromCSVFile();

        printObjects();
    }

    private static void printObjects() {
        if (testObjects == null || testObjects.size() == 0) {
            System.out.println("List is empty");
        }

        for (TestObject testObject : testObjects) {
            System.out.println(testObject);
        }
    }

    private static void readDataFromCSVFile() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            int counter = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (counter != 0) {
                    addObjectToList(line);
                }
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeReaders(fileReader, bufferedReader);
        }
    }

    private static void createEmptyList() {
        if (testObjects == null) {
            testObjects = new ArrayList<>();
        }
    }

    private static void addObjectToList(String line) {
        String[] split = line.split(COMMA_SEPARATOR);

        TestObject testObject = new TestObject.Builder()
                .setTable(split[0])
                .setBreakdown(split[1])
                .setSecondaryBreakdown(split[2])
                .setYear(split[3])
                .setValue(split[4])
                .setUnit(split[5])
                .build();

        testObjects.add(testObject);
    }

    private static void closeReaders(FileReader fileReader,
                                     BufferedReader bufferedReader) {
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
