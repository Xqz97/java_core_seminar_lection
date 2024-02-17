package seminar.seminar_5.task4;

import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        File directory = new File(".");
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files found in the current directory.");
        }
    }
}