import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,result;

        System.out.println("Digite o número");
        num1 = sc.nextInt();

        System.out.println("Digite o número");
        num2 = sc.nextInt();

        result = num1 + num2;

        System.out.println("Resultado da soma é " + result);

    }
}