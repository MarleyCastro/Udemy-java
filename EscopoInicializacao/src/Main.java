public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        double price = 400;
        double discont = 0;

        if(price < 200.0){
            discont = price * 0.1;
        }else {
            discont = 0;
        }

        System.out.println(discont);

    }
}