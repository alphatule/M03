import java.util.Locale;
import java.util.Scanner;

public class sumarcolumnes {
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

        for (int i = 0; i < columnas; i++) {
            int suma = 0;
            for (int j = 0; j < filas; j++) {
                suma += matriz[j][i];
            }
            System.out.print(i == columnas-1 ? suma : suma + " ");
        }



    }
}
