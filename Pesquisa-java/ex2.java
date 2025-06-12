import caracterstica.People;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        People peoples = new People();

        String A = "s";
        int Feminino = 0, Masculino = 0;
        int preto = 0,castanho = 0,loiro = 0,ruivo = 0; //Masculino
        int Fpreto = 0,Fcastanho = 0,Floiro = 0,Fruivo = 0; // Feminino


        while ( A.equalsIgnoreCase("s")){
            System.out.println("Qual Sexo: " );
            peoples.sexo = sc.next();

            if (peoples.sexo.equalsIgnoreCase("M")){
                Masculino++;
            }else {
                Feminino++;
            }
            System.out.println("Qual a Idade: ");
            peoples.idade = sc.nextInt();

            System.out.println("Qual a cor do cabelo");
            System.out.println("[1] Preto");
            System.out.println("[2] Castanho");
            System.out.println("[3] Loiro");
            System.out.println("[4] Ruivo");
            peoples.Corcabelo = sc.nextInt();

            if (peoples.sexo.equalsIgnoreCase("M")){
                if (peoples.Corcabelo == 1){
                    preto++;
                }if (peoples.Corcabelo == 2){
                    castanho++;
                }if (peoples.Corcabelo == 3){
                    loiro++;
                }if (peoples.Corcabelo == 4){
                    ruivo++;
                }
            }else {
                if (peoples.Corcabelo == 1){
                    Fpreto++;
                }if (peoples.Corcabelo == 2){
                    Fcastanho++;
                }if (peoples.Corcabelo == 3){
                    Floiro++;
                }if (peoples.Corcabelo == 4){
                    Fruivo++;
                }
            }

            System.out.println("Deseja continuar? ");
            A = sc.next();
        }
        if (peoples.idade >= 18){
            System.out.println("Com mais de 18 anos");
        }else {
            System.out.println("menor de 18 anos: " + peoples.idade);
        }
        System.out.println("Total de homens: "
                + Masculino
                + " Cabelos preto "
                +  preto
                + " Castanho: "
                + castanho
                + " Loiro: "
                + loiro
                + " Ruivo: "
                + ruivo);
        System.out.println("Total de Mulheres: "
                + Feminino
                + " abelos preto "
                +  preto
                + " Castanho: "
                + castanho
                + " Loiro: "
                + loiro
                + " Ruivo: "
                + ruivo);

    }
}
