package seminar.seminar_5.hw.task_2;

import java.io.*;

public class OutputInFile {
    public static void main(String[] args) {
        byte[] field = {1, 2, 0, 3, 0, 1, 2, 0, 3};

        try (FileOutputStream fos = new FileOutputStream("task1Hw.txt")) {
            fos.write(field);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}