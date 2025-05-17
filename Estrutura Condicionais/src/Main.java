import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Horas;

        System.out.println("Quantas Horas ?");
        Horas = sc.nextInt();


        if (Horas < 12) { //Estrutura Condicional
            System.out.println("Bom dia");
        } else if (Horas < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa Noite");
        }
    }
}
