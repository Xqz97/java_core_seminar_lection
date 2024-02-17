package seminar.seminar_5.hw.task_1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Backup {
    public static void main(String[] args) {
        backupFilesInDirectory("D:\\test");
    }

    public static void backupFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        File backupDirectory = new File(directory, "backup");

        if (!backupDirectory.exists()) {
            backupDirectory.mkdir();
        }

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            for (File file : files) {
                if (file.isFile()) {
                    File backupFile = new File(backupDirectory, file.getName());

                    try {
                        Files.copy(file.toPath(), backupFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Created backup for: " + file.getName());
                    } catch (IOException e) {
                        System.err.println("Error creating backup for: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.err.println("Directory does not exist or is not a directory.");
        }
    }
}
