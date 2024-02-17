package seminar.seminar_5.task3;

import java.io.*;

public class ReplaceCharInFile {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        char charToReplace = 'a';
        char replacementChar = ' ';

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            int c;
            while ((c = reader.read()) != -1) {
                if ((char) c == charToReplace) {
                    writer.write(replacementChar);
                } else {
                    writer.write(c);
                }
            }

            System.out.println("File processed successfully. Replaced '" + charToReplace + "' with space.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}