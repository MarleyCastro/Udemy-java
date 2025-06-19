package peoples;

import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //quantidade de pessoas digitadas
        System.out.println("Quantas pessoas digitadas: ");
        int n = sc.nextInt();
        alturas[] vect = new alturas[n];

        //dados das pessoas nome,idade,altura
        for (int i=0; i<n; i++){        //soma
            System.out.println("Dados " + (i+1) +"a pessoa");
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Idade: ");
            int idade  = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new alturas(nome,idade,altura);
        }

        //soma das alturas
        double sum = 0;
        for (int i=0; i<n; i++){
            sum += vect[i].getAltura();
        }
        double avg = sum/n; //media das alturas
        System.out.println("Altura média = " + avg);

        // % de pessoas com menos de 16 anos

        System.out.print("Pessoas com menos de 16 anos: ");
        for (int i=0; i<n; i++){
            sum += vect[i].getIdade();
        }

        double menores = 0;
        for (int i=0; i<n; i++){
            if (vect[i].getIdade() < 16){
                menores++;
            }
        }

        double porcentagem = (menores/ n) * 100;
        System.out.print(" " + porcentagem + "% ");

        for (int i=0; i<n; i++){
           if (vect[i].getIdade() < 16){
               System.out.println("");
               System.out.println(vect[i].getNome());
           }
        }
    }
}
