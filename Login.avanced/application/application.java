package application;

import Product.User;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "Admin";
        String password = "jesusefiel";

        int attempts = 0;

        do {
            System.out.println("você ainda tem " + attempts + "º tentativas");
            System.out.print("Digite seu usuario: ");
            String loginuser = sc.next();

            System.out.print("Digite sua senha: ");
            String loginpassword = sc.next();

            if (user.equals(loginuser) && password.equals(loginpassword)) {
                System.out.println("Login confirmado !!");
            } else if (attempts == 3) {
                System.out.println("Você exedeu o número de tentativas !!");
                System.exit(0);
            } else {
                System.out.println("Algo deu errado :-(");
            }
            attempts++;
            User user1 = new User(user, password);
        } while (attempts < 4);

        print print = new print();
        print.welcome();

    }
}
