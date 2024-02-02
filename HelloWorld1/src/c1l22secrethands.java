import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class c1l22secrethands {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        String uno = "fer l'ullet";
        String diez = "doble parpalleig";
        String cien = "tancar el ulls";
        String mil = "saltar";


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        String s = br.readLine();
        System.out.print("Enter Integer:");
        int i = 0;
        try {
            i = Integer.parseInt(br.readLine());
            if (i == 1 || i == 10 || i == 100 || i == 1000) {
              if (i == 1) {
                  System.out.println("El numero es un 1");
              }
            }

        } catch(NumberFormatException nfe) {
            System.err.println("No es un numero valido!");
        }

        System.out.println("El string q me pasaste es este: " + s + "\nY el numero que me pasaste es: " + i);
    }
}
