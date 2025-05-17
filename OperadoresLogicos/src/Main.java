public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c  = 10;
            //v   ou  f = v
        if (c>=b || a>b){ //uma veradeira para ser verdadeira
            System.out.println("verdadeiro");
        }else {
            System.out.println("Falso");
        }
            //v e  v = v
        if (c>b && c>a){ //duas verdadeiras para ser verdadeira
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }

    }
}