import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c); //crinado função personalizada


        showResult(higher); //tipo void

    }

    public static int max(int x, int y, int z){  //vão casar no final não precisa ser o mesmo nom de váriavel
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }

}