import java.util.Locale;
import java.util.Scanner;

public class buscarlletres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        char letra = sc.nextLine().charAt(0);
        String palabra = sc.nextLine();
        char[] letras = palabra.toCharArray();

        int conteo = 0;
        for (int i = 0; i < letras.length; i++) {
            char x = letras[i];
            if (letra == x) {
                conteo++;
            }
        }

        System.out.println(conteo);
    }
}
