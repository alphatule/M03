package examen;

import java.util.Locale;
import java.util.Scanner;


public class nomesundecimalparell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n1 = (int)sc.nextFloat() % 2;
        int n2 = (int)sc.nextFloat() % 2;
        int n3 = (int)sc.nextFloat() % 2;
        boolean resultado = ((n1 + n2 + n3) == 0) || ((n1 + n2 + n3) == 3);
        System.out.println(resultado);
    }
}
