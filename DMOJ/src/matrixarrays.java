import java.util.Locale;
import java.util.Scanner;
public class matrixarrays {
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

        int numeroFilasMirar = sc.nextInt();
        int[][] coordsAMirar = new int[numeroFilasMirar][2];
        for (int i = 0; i < numeroFilasMirar; i++) {
            for (int j = 0; j < 2; j++) {
                coordsAMirar[i][j] = sc.nextInt();
            }
        }
        int numerosASumar = 0;

        for (int i = 0; i < numeroFilasMirar; i++) {
            if (coordsAMirar[i][0] < filas && coordsAMirar[i][1] < columnas) numerosASumar += matriz[coordsAMirar[i][0]][coordsAMirar[i][1]];
        }
        System.out.println(numerosASumar);
    }
}
