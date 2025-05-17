import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble(); //10.0 21.1 5.1
        double c = sc.nextDouble();

        double delta = b*b - 4.0*a*c;

        if (a == 0 || delta < 0.0){
            System.out.println("Impossivel Calcular");
        }else {
            double r1 = (- b + Math.sqrt(delta)) / (2 * a);
            double r2 = (- b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R1 = %.5f\n",r2);
        }
    }
}