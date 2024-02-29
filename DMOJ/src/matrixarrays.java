import java.util.Locale;
import java.util.Scanner;
public class matrixarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] == 0) {
                    count0++;
                } else if (matriz[i][j] == 1) {
                    count1++;
                }
            }
        }
        System.out.println(count0 + " " + count1);

    }
}
