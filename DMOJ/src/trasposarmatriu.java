import java.util.Locale;
import java.util.Scanner;

public class trasposarmatriu {
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

        int[][] matrizNueva = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizNueva[j][i] = matriz[i][j];
//                System.out.print( j == columnas ? matrizNueva[j][i] : matrizNueva[j][i] + " ");
            }
//            System.out.println();
        }

        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print( j == filas-1 ? matrizNueva[i][j] : matrizNueva[i][j] + " ");
            }
            System.out.println();
        }


    }
}
