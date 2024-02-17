package seminar.seminar_5.task2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[8]; // Создаем массив для хранения целых чисел

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("numbers.dat"))) { // Открываем файл для чтения
            int index = 0;
            while (dataInputStream.available() > 0 && index < intArray.length) { // Читаем данные из файла, пока файл не закончится или не заполнится весь массив
                byte[] intBytes = new byte[4]; // Создаем байтовый массив для хранения 4 байт (32 бит) данных
                dataInputStream.read(intBytes); // Читаем 4 байта данных из файла
                intArray[index] = ByteBuffer.wrap(intBytes).order(ByteOrder.LITTLE_ENDIAN).getInt(); // Преобразуем байты в целое число, учитывая порядок байтов (little-endian)
                index++; // Увеличиваем индекс массива для следующего числа
            }
        } catch (IOException e) { // Обрабатываем исключения ввода-вывода
            e.printStackTrace(); // Выводим информацию об ошибке на консоль
        }

        System.out.println("Массив целых чисел из файла:"); // Выводим заголовок массива
        for (int num : intArray) { // Итерируем по массиву целых чисел
            System.out.println(num); // Выводим каждое целое число на консоль
        }
    }
}