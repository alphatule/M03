import java.util.Locale;
import java.util.Scanner;

public class c4l42maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cLineas = sc.nextInt();
        char[][] matrizLaberinto = new char[cLineas][];

        sc.nextLine();
        for (int i = 0; i < cLineas; i++) {
            matrizLaberinto[i] = sc.nextLine().toCharArray();
        }

        int[] coordInicial = new int[2];
        for (int i = 0; i < matrizLaberinto.length; i++) {
            for (int j = 0; j < matrizLaberinto[i].length; j++) {
                if (matrizLaberinto[i][j] == '^'){
                    coordInicial = new int[]{i, j};
                    // Aqui se hace la llamada recursiva
                    buscarSalida(i,j,matrizLaberinto);

                    // Mostrar la matriz
                    printMatriz(matrizLaberinto);
                }
            }
        }
        // printMatriz(matrizLaberinto);
    }

    private static boolean buscarSalida(int i, int j, char[][] mapa){
        // Casos base
        if (i<0 || i >=mapa.length || j<0 || j >=mapa[i].length){
            return false;
        } else if (mapa[i][j] == 'o' || mapa[i][j] == '#' ){
            return false;
        } else if (mapa[i][j] == '_'){
            mapa[i][j] = 'o';
            return true;
        } else {
            // Casos recursivos
            mapa[i][j] = 'o';
            boolean right = buscarSalida(i,j+1,mapa);
            boolean down = buscarSalida(i+1,j,mapa);
            boolean up = buscarSalida(i-1,j,mapa);
            boolean left = buscarSalida(i,j-1,mapa);

            boolean caminoEncontrado = (down||right||up||left);
            if (!caminoEncontrado) mapa[i][j] = ' ';
            return caminoEncontrado;
        }
    }

    private static void printMatriz(char[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(String.valueOf(matriz[i]));
        }
    }
}
