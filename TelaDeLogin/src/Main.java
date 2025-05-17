import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String USUARIO_CORRETO = "admin";
        String SENHA_CORRETA = "1234";

        String Usuario ;
        String Senha;

        int tentativas = 0;
        boolean acessoPermitido = false;


        while (tentativas < 3) {
            System.out.println("Qual o nome do Usuário");
            Usuario = sc.next();

            System.out.println("Qual o nome do Senha");
            Senha = sc.next();

            if (Usuario.equals(USUARIO_CORRETO) && Senha.equals(SENHA_CORRETA)) {
                acessoPermitido = true;
                System.out.println("Seja Bem-vindo");
                break;
            } else {
                System.out.println("Tente novamente número de tentativas " + tentativas + "/3");
                tentativas++;
            }

            if (acessoPermitido) {
                System.out.println("Seja bem-vindo");
            } else if (tentativas == 3) {
                System.out.println("Você ecedeu o número de tentativa. Acesso bloqueado");
            }
        }
    }
}