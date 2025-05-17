import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R,result, pi = 3.14159;


        System.out.println("Digite o valor do Raio");
        R = sc.nextDouble();

        result = R*R*pi;

        System.out.printf("O Resultado do calculo do Pi em relação ao Raio é: %.4f ", result);

    }
}