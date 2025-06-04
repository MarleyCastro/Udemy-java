import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("---- DIGITE O SEU VEÍCULO  ---");
        System.out.println("------------------------------");

        System.out.print("Quantos Veículos você tem ?  ");
        int n = sc.nextInt();
        Car car = new Car();
        for (int i = 0; i<n; i++){
            System.out.print("Marca = ");
            car.Marca = sc.next();
            System.out.print("Modelo = ");
            car.Modelo = sc.next();
            System.out.print("Ano = ");
            car.Ano = sc.nextInt();
            System.out.println("------------------------------");
        }
        for (int i=0; i<n; i++){
            car.ValoraMostrar();
            System.out.println("------------------------------");
        }
    }
}