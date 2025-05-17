import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int k = 20;
        double x = 10.3568;
        String nome = "Marley";
        double altura = 1.90;
        int idade = 10;
        Locale.setDefault(Locale.US);
        System.out.printf("Nome: %s%n Altura: %.2f%n Idade: %d", nome,altura,idade);
    }
}