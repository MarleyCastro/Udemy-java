import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num1,num2,result;


        System.out.println("Qual é sua nota? ");
        num1 = sc.nextDouble();

        System.out.println("Qual sua segunda Nota? ");
        num2 = sc.nextDouble();

        result = (num1 + num2)/2;


        if (result < 6.0){
            System.out.println("Está Reprovado" + result);
        } else if (result < 9.0) {
            System.out.println("Está Aprovado " + result);
        }else{
            System.out.println("Está Mais Que aprovado " + result);
        }
    }
}