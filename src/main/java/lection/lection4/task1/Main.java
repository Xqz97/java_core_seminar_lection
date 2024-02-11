package lection.lection4.task1;

public class Main {
    enum Color{
        RED("#FF0000"), BLUE("#0000FF"),GREEN("#00FF00");
        private String code;
        Color(String code){
            this.code = code;
        }
        public String getCode(){
            return code;
        }
    }
    public static void main(String[] args) {
        for (Color i: Color.values()){
            System.out.printf("%s(%s) ", i, i.getCode());
        }

    }
}
