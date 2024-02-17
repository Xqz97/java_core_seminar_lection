package seminar.seminar_5.task1;

import java.io.*;
import java.util.Arrays;

public class Main {
//    public static void main(String[] args) throws IOException {
//        int[] intArray = new int[]{1,2,3,4,5,6,7,8};
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("taskOne.txt"))) {
//            writer.write(Arrays.toString(intArray));
//    } catch (FileNotFoundException e) {
//        throw new RuntimeException(e);
//    } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//}

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        String fileName = "numbers.dat";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (int num : numbers) {
                fos.write(num & 0xFF);
                fos.write((num >> 8) & 0xFF);
                fos.write((num >> 16) & 0xFF);
                fos.write((num >> 24) & 0xFF);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

