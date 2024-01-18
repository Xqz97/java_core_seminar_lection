package seminar.seminar_2.task3;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(array1)); // Output: true

        int[] array2 = {2, 1, 1, 2, 1};
        System.out.println(checkBalance(array2)); // Output: false

        int[] array3 = {10, 1, 2, 3, 4};
        System.out.println(checkBalance(array3)); // Output: true
    }

    public static boolean checkBalance(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }

        return false;
    }
}
