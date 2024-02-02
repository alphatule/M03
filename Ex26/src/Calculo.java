import java.util.Locale;
import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        int n2 = sc.nextInt();

        if (n1 + n2 > 10){
            System.out.println("Valor màxim excedit");
        } else {
            System.out.println(n1 + n2);
        }

        sc.close();
    }
}