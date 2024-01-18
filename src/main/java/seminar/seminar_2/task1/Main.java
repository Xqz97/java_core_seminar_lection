package seminar.seminar_2.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {100, 2, 3, 1, 11, 23, 43};
//        System.out.println(minMaxOne(array));
//        int min = Arrays.stream(array).min().getAsInt();
//        int max = Arrays.stream(array).max().getAsInt();
//        Arrays.sort(array);
//        min = array[0];
//        max = array[array.length - 1];
//        System.out.println("Максимальное значение по второму методу:" + max);
//        System.out.println("Минимальное значение по второму методу:" + min);
        PriorityQueue<Integer> minQueue = new PriorityQueue<>(); // для минимума
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder()); // для максимума

// Добавление всех элементов в обе очереди
        for (int value : array) {
            minQueue.add(value);
            maxQueue.add(value);
        }

        Integer minElement = minQueue.poll();
        System.out.println("Минимальный элемент: " + minElement);

        Integer maxElement = maxQueue.poll();
        System.out.println("Максимальный элемент: " + maxElement);
    }

    private static String minMaxOne(int[] array) {
        if (array.length == 0){
            return "Массив пустой!";
        }
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return "Максимальный элемент массива:" + " " + min + "\n" + "Минимальный элемент массива:"
                + " " + max;
    }

    private static int findMinRecursive(int min, int index, int [] array){
        if (index < array.length){
            if (array[index] < min){
                return findMinRecursive(array[index], index + 1, array);
            }
        }
        return min;
    }
}
