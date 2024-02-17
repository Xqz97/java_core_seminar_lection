package seminar.seminar_5.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileToConsole {
    public static void main(String[] args) {
        String fileName = "D:\\Turusov.RA\\Work\\Учеба\\Geekbrains\\java_specialization\\java_core_seminar_lection\\taskOne_1.txt"; // Укажите путь к вашему файлу

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}