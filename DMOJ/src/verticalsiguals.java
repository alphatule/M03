import java.util.Locale;
import java.util.Scanner;

public class verticalsiguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int numColumna = -1;
        for (int i = 0; i < columnas; i++) {
            boolean sonIguals = false;
            for (int j = 0; j < filas-1; j++) {
                int actual = matriz[j][i];
                int proximo = matriz[j+1][i];
//                System.out.println("Numero actual: "+ actual);
//                System.out.println("Numero proximo: "+ proximo);
                if (actual == proximo){
                    sonIguals = true;
                } else {
                    sonIguals = false;
                    break;
                }
            }
//            System.out.println("-------------------------------\n- Cambio de numero" + (filas-1));
            if (sonIguals){
                numColumna = i;
                break;
            } else if (filas-1 == 0) {
                numColumna = i;
                break;
            }
        }
        if (numColumna > -1){
            System.out.println("La columna " + numColumna + " té tots els números iguals.");
        } else {
            System.out.println("No hi ha cap columna amb els números iguals.");
        }

    }
}
