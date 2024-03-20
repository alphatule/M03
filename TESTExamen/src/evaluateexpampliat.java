import java.util.Locale;
import java.util.Scanner;

public class evaluateexpampliat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String expresion = sc.nextLine();
        System.out.println(calculaExp(expresion));
    }

    private static float calculaExp(String expresion) {
        int hayRestas = expresion.lastIndexOf('-');
        int haySumas = expresion.lastIndexOf('+');
        int hayDivi = expresion.lastIndexOf('/');
        int hayMulti = expresion.lastIndexOf('*');
        if (hayRestas == -1 && haySumas  == -1 && hayDivi == -1 && hayMulti == -1) {
            return Float.parseFloat(expresion);
        } else {
            if (haySumas != -1) { // caso suma
                String parteDerecha = expresion.substring(0, haySumas);
                String parteIzquierda = expresion.substring(haySumas + 1);
                return calculaExp(parteDerecha) + calculaExp(parteIzquierda);
            } else if (hayRestas != -1) { // caso resta
                String parteDerecha = expresion.substring(0, hayRestas);
                String parteIzquierda = expresion.substring(hayRestas + 1);
                return calculaExp(parteDerecha) - calculaExp(parteIzquierda);
            } else if (hayMulti != -1) { // caso multi
                String parteDerecha = expresion.substring(0, hayMulti);
                String parteIzquierda = expresion.substring(hayMulti + 1);
                return calculaExp(parteDerecha) * calculaExp(parteIzquierda);
            } else { // Caso de divi
                String parteDerecha = expresion.substring(0, hayDivi);
                String parteIzquierda = expresion.substring(hayDivi + 1);
                return calculaExp(parteDerecha) / calculaExp(parteIzquierda);
            }
        }
    }
}
