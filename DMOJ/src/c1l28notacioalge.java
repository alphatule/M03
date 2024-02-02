import java.util.Scanner;

public class c1l28notacioalge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt() - 1;
        int p2 = sc.nextInt() - 1;
        char[] fila = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] columna = new char[]{'1', '2', '3', '4', '5', '6', '7', '8'};
        System.out.println(String.valueOf(fila[p1]) + String.valueOf(columna[p2]));
    }
}
