import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //Quantidade de números que vou ler
        int in = 0 ,out = 0;

        for (int i = 0; i<N; i++){
            int x = sc.nextInt(); //ste valor será a quantidade de valores inteiros X que serão lidos em seguida.
            if (x >=10 && x <= 20){ //X estão dentro do intervalo [10,20]
                in+=1;
            }else {
                out+=1;
            }
        }
        System.out.println(in + " in"); //se a palavra "in" para dentro do intervalo
        System.out.println(out + " out"); //"out" para fora do intervalo
    }
}