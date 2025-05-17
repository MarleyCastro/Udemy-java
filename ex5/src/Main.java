import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double SalarioMinimo;
        double SeuSalario;
        double Total;


        System.out.println("Digite seu sálario");
        SeuSalario = sc.nextDouble();

        System.out.println("Digite o sálario Mínimo");
        SalarioMinimo = sc.nextDouble();

        Total = SeuSalario / SalarioMinimo;

        if (SeuSalario > SalarioMinimo){
            System.out.println((int) Total + "SM=R$"+ (SeuSalario-SalarioMinimo));
        }else {
            System.out.println("Faltam R$"+ ((SeuSalario-SalarioMinimo) * - 1)+ " reias para você alcançar o sálario mínimo");
        }
    }
}