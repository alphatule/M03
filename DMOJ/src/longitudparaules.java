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
        int posPMAX = 0;
        int posPMIN = 0;
        int posPLONG = -1;
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
            if (palabra.length == maxLongitud){
                posPLONG = i;
            }
        }
        System.out.println("La paraula més llarga és: " + palabras[posPMAX] + " (" + palabras[posPMAX].length() + " lletres).");
        System.out.println("La paraula més curta és: " + palabras[posPMIN] + " (" + palabras[posPMIN].length() + " lletres).");
        System.out.println(
            ((posPLONG > -1) ?
            "La paraula de longitud " + maxLongitud + " que s'ha trobat és: " + palabras[posPLONG] :
            "No s'ha trobat cap paraula de longitud " + maxLongitud + ".")
        );
    }
}
