import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double area;
        double Preco;
        double Largura;
        double Comprimento;
        double MetroQuadrado;


        System.out.println("Qual o Valor do Comprimento: ");
        Comprimento = sc.nextDouble();

        System.out.println("Qual o Valor do Largura: ");
        Largura = sc.nextDouble();

        System.out.println("Qual o Valor do Metro Quadrado: ");
        MetroQuadrado = sc.nextDouble();


        area = Largura *Comprimento;
        Preco = area*MetroQuadrado;


        System.out.printf("Area  %.3f \n", area);
        System.out.printf("Preço %.3f \n ", Preco);

    }
}