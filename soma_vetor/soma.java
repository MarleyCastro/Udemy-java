package soma_vetor;
import java.util.Scanner;
import java.util.Locale;

public class soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double [] vect = new double[n];

        for (int i=0; i< vect.length; i++){
            System.out.printf("Digite um valor: ");
            vect[i] = sc.nextDouble();
        }

        double soma =0;
        for(int i=0; i< vect.length; i++){
            soma += vect[i];
        }

        double avg = soma / n;

        System.out.printf("Valores: ");
        for (int i=0; i<n; i++){
            System.out.print(vect[i] + "  ");
        }


        System.out.println(" ");
        System.out.printf("Soma dos numeros é %.2f \n" , soma);
        System.out.printf("Média dos numeros é %.2f" , avg);

    }
}
