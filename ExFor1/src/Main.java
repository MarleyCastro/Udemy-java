import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 3, y = 0;

       for (int i = 0; i<x; i++){
           System.out.printf(i + ",");
           y+=5;
           System.out.println(y);
       }

    }
}