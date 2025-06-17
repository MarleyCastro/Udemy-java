package Analize;

import java.util.Scanner;

public class AnalizadorValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=0, b= 0 , soma=0, media=0;
        for (int i=0; i<5; i++){
            System.out.println("Digite o num: ");
            a = sc.nextInt();
            soma +=a;
        }

        media = (a)/2;
        System.out.println("Meida de dos números é: " + media);
        if (a % 5 == 0){
            System.out.println(a + "é divisivel por 5");
        }
        if (a == 0){
            System.out.println("Valores nulos ");
        }
        if (a %2!=0){
            soma += a;
            System.out.println("soma dos numeros pares " + soma);
        }
    }
}
