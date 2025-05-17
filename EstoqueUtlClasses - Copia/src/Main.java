import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Product ProdutoA = new Product();
        System.out.format("name: ");
        ProdutoA.name = sc.nextLine();
        System.out.format("Price: ");
        ProdutoA.Price = sc.nextDouble();
        System.out.format("Quantity in stock: ");
        ProdutoA.Quantity = sc.nextInt();


        System.out.println(ProdutoA);

    }
}