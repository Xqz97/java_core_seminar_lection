package seminar.seminar_5.task3;
import java.io.*;

public class ReplaceWordInFile {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        String wordToReplace = "apple";
        String replacementWord = "banana";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(wordToReplace, replacementWord);
                writer.write(line + System.lineSeparator());
            }

            System.out.println("File processed successfully. Replaced '" + wordToReplace + "' with '" + replacementWord + "'.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}