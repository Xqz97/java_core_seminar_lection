package lection.lection1;

public class Overflow {

    private static int sum(int a, int b) {
        return a + b;
    }

    private static float sum(float a, float b) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 2));
        System.out.println(sum(2.0f, 2.0f));
    }
}
