import java.util.Scanner;
// Inicio del programa y declaración de variables:
public class stigidsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numeroEntrada = sc.nextInt();
        int digitoCentenas = numeroEntrada / 100;
        int digitoDecenas = (numeroEntrada / 10) % 10;
        int digitoUnidades = numeroEntrada % 10;
        int numeroInvrtit = digitoUnidades*100 + digitoDecenas*10 + digitoCentenas;

        System.out.println(numeroInvrtit);

    }
}