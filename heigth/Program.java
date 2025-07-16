package heigth;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("how many peoples will be typed?  ");
        int n = sc.nextInt();

        //three vectored
        String[] names = new String[n]; //vector names
        int[] ages = new int[n];
        double[] height = new double[n];


        for (int i=0; i<n ; i++){
            System.out.println("Data of " + (i+1) + " the people");
            System.out.print("Name: ");
            names[i] = sc.next();

            System.out.print("Age: ");
            ages[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        //for of sum
        double sum=0;
        for (int i=0; i<n; i++){
            sum += height[i];
        }
        //division of the sum for average
        double average = sum /n;
        System.out.println("Average Heigt : " + average);

        //for of tell
        int tell =0;
        for (int i=0; i<n; i++){
            if (ages[i] < 16){ //peoples minors of 16 ages, tell more
                tell++;
            }
        }

        double percent = tell * 100.0 / n;

        System.out.printf("people under 16 years of age: %.1f %%%n", percent);

        for (int i=0; i<n; i++){
            if (ages[i] < 16){
                System.out.println(names[i]);
            }
        }
    }
}
