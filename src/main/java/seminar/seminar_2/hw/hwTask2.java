public class hwTask2 {

    public static void main(String[] args) {
        int[] array = {1,2,36,25,18};
        System.out.println(minMaxDiff(array));
    }

    private static String minMaxDiff(int[] array) {
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
        return "Разница между максимальным и минимальным элементами массива: "  + (max - min);
    }
}
