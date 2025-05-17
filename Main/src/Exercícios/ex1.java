package Exercícios;
import java.util.Locale;

public class ex1 {
    public static void main(String[] args) {
        String Product1 = "Computer";
        String Product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 21000.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s, which price is $ %f\n", Product1,price1);
        System.out.printf("%s, ehich price is $ %f\n", Product2,price2);
        System.out.printf("\nRecord: %d Years old, code %d and gender: %s\n", age, code,gender);
        System.out.printf("Mensure decimal with eigth decimal places: %f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f \n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);


    }
}
