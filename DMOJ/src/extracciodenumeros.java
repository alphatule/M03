import java.util.Locale;
import java.util.Scanner;
public class extracciodenumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String palabra = sc.nextLine();

        int[] numeros = new int[4];
        int count = 0;

        for (int i = 1; i < palabra.length(); i=i+2) {
            numeros[count] = Character.getNumericValue(palabra.charAt(i));;
            count++;
        }
        int calculo = 0;
        for (int i = 0; i < numeros.length; i++) {
            calculo = calculo + numeros[i];
        }
        System.out.println(calculo);
    }
}
