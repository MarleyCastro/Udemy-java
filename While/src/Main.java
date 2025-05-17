
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int x = sc.nextInt();
        int soma = 0;

        while (x != 0 ){ //enquando o valor for diferente de 0 ficar em loop
            soma += x; //soma = soma + x  "soma dos números digitados"
            x = sc.nextInt(); //armazenamendo da memória
        }*/

        int a  = 0;
        int y  = 4;

        while (a < 3){
            a= a + 2;
            y= y + 1;
            System.out.println(a + " - " + y);
        }

        sc.close();
    }
}