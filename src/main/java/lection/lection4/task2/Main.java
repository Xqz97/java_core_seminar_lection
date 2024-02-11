package lection.lection4.task2;

public class Main {
    private static class Orange{
        private Juice juice;
        public Orange() {
            this.juice = new Juice();
        }
        public void squeezeJuice(){
            System.out.println("Squeeze juice...");
            juice.flow();
        }

        private class Juice{
            public void flow(){
                System.out.println("Juice dripped...");
            }
        }
    }

    public static void main(String[] args) {
        Orange orange = new Orange();
        orange.squeezeJuice();
    }
}
