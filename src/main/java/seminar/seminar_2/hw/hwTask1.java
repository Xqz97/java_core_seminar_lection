public class hwTask1 {
    public static void main(String[] args) {
        int[] array = {1,2,50};
        System.out.println(countOfEvenNumbersInArray(array));
    }

    private static String countOfEvenNumbersInArray(int[] array){
        int count = 0;
        if (array.length == 0){
            return "Массив не должен быть пустым!";
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count++;
            }
        }
        return "Количество четных элементов в массиве: " + count;
    }
}
