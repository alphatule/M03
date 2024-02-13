import java.util.Locale;
import java.util.Scanner;

public class longitudparaules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cPalabras = Integer.parseInt(sc.nextLine());
        String[] palabras = sc.nextLine().split(" ");
        int maxLongitud = Integer.parseInt(sc.nextLine());

        int cantidadPMAXrev = 0;
        int cantidadPMINrev = 100;
        int posPMAX;
        int posPMIN;
        for (int i = 0; i < cPalabras; i++) {
            char[] palabra = palabras[i].toCharArray();
            if (palabra.length > cantidadPMAXrev) {
                cantidadPMAXrev = palabra.length;
                posPMAX = i;
            }
            if (palabra.length < cantidadPMINrev){
                cantidadPMINrev = palabra.length;
                posPMIN = i;
            }
        }
    }
}
