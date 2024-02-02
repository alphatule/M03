import java.util.Scanner;
import myUtils.Calculadora;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Com et dius?");
        String nom = sc.nextLine();

        System.out.println("Encantat, " + nom);
        Calculadora calcul = new Calculadora();
        System.out.println(
                calcul.sumar(12.3f, 32.5f) + "\n" +
                calcul.restar(12, 4) + "\n" +
                calcul.multiplicar(6, 6) + "\n" +
                calcul.dividir(12, 2)
        );

    }
}