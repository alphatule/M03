import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int[] linea1 = new int[0];
        int[] linea2 = new int[0];
        int posicionNumero = 0;
        for (int x = 0; x < 3; x++) {
            if (x < 2) {
                char[] lineaString = sc.nextLine().replaceAll(" ", "").toCharArray();
                int[] lineaEnteros = new int[lineaString.length];
                for (int i = 0; i < lineaString.length; i++) {

                    lineaEnteros[i] = Integer.parseInt(String.valueOf(lineaString[i]));
                }
                if (x == 0) {
                    linea1 = lineaEnteros;
                } else if (x == 1) {
                    linea2 = lineaEnteros;
                }
            } else {
                // Aqui va el ultimo read del Scanner (lee el ultimo entero)
                posicionNumero = sc.nextInt();
            }
        }
        if ( ((linea1[posicionNumero] + linea2[posicionNumero]) % 2) == 0) {
            System.out.println("La suma dels números en la posició " + posicionNumero + " retorna un nombre parell.");
        } else {
            System.out.println("La suma dels números en la posició " + posicionNumero + " retorna un nombre senar.");
        }
        boolean arraysIguales = true;
        for (int i = 0; i < linea1.length; i++) {
            if (linea1[i] != linea2[i]) {
                arraysIguales = false;
            }
        }

        System.out.println( ((arraysIguales) ? "Tots el números són els mateixos." : "Els números no són els mateixos.") );

    }

}