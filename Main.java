import java.util.Scanner;
import retangle.Retangle;
;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangle RetangleA = new Retangle();
        RetangleA.Height = sc.nextDouble();
        RetangleA.Width = sc.nextDouble();

        System.out.println("AREA = " + RetangleA.Area());
        System.out.println("PERIMETER = " + RetangleA.Perimeter());
        System.out.println("DIAGONAL = " + RetangleA.Diagonal());

    }
}