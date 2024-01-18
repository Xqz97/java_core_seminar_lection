public class hwTask3 {
    public static void main(String[] args) {
        int[] array = {1,0,1,0,1,1};
        System.out.println(checkElement(array));
    }

    public static boolean checkElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i+1] != 0) {
                return true;
            }
        }
        return false;
    }
}

