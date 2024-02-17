package seminar.seminar_5.hw.task_3;

import java.io.File;

public class Prefix {

    public static void addPrefixToFiles(String[] filepaths, String prefix) {
        for (String filepath : filepaths) {
            File file = new File(filepath);

            if (!file.exists()) {
                System.err.println("File not found: " + filepath);
                continue;
            }

            String newPath = file.getParent() + File.separator + prefix + file.getName();
            File newFile = new File(newPath);

            boolean success = file.renameTo(newFile);

            if (success) {
                System.out.println("Added prefix to file: " + file.getName());
            } else {
                System.err.println("Error adding prefix to file: " + file.getName());
            }
        }
    }

    public static void main(String[] args) {
        String[] filepaths = {
                "D:\\Turusov.RA\\Work\\Учеба\\Geekbrains\\java_specialization\\java_core_seminar_lection\\src\\main\\java\\seminar\\seminar_5\\hw\\task_3\\file1.txt"};
        String prefix = "new_";

        addPrefixToFiles(filepaths, prefix);
    }
}


