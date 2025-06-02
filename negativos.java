import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");

        for (int i = 0; i<n ; i++){
            if (vect[i] < 0){
                System.out.printf("%.2f\n", vect[i]);
            }
        }
    }
}
