package simpleExercises.wordsCounterFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wordsCounterFromFile {

    private static int counterOfWords = 0;
    private static String path = "src\\main\\java\\simpleExercises\\wordsCounterFromFile\\";
    private static String fileName = "wordsCounterFile";
    private static String formatOfFile = ".txt";


    public static void main(String[] args) {
        System.out.println("Words Counter From File application");

        System.out.println("START\n");
        wordsCounterFromFileMethod();
        System.out.println("\nSTOP");
    }

    private static void wordsCounterFromFileMethod() {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(path + fileName + formatOfFile);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] s = line.split(" ");
                counterOfWords = counterOfWords + s.length;
            }
            System.out.println(counterOfWords + " : words");
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();

                if (fileReader != null)
                    fileReader.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }

    }
}
