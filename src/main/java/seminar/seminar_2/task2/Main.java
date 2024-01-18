package seminar.seminar_2.task2;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        printArray(fillDiagonal(array));
    }

    private static int[][] fillDiagonal(int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        return array;
    }

    private static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
