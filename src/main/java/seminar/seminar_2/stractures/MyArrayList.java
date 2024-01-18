package seminar.seminar_2.stractures;

import java.util.Arrays;
import java.util.function.Function;

public class MyArrayList<T> {
    private int index;
    private T[] arr;

    public MyArrayList(int capacity, Function<Integer, T[]> createArray) {
        arr = createArray.apply(capacity);
    }
    public int size() {
        return index;
    }

    public void add(T value) {
        if (index >= arr.length) {
            arr = Arrays.copyOf(arr, (int) (arr.length * 1.5));
        }
        arr[index] = value;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(index * 2);
        for (int i = 0; i < index; i++) {
            sb.append(arr[i]);
            if(i != index - 1)
                sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>(2, Integer[]::new);
        for (int i = 0; i < 99; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
