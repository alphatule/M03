import java.util.Locale;
import java.util.Scanner;

public class c7l32evaluateexp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String cadena = sc.nextLine();

        System.out.println(evaluate2(cadena));
    }



    // 123*456+789*12
    // 56.088 + 9468

    // 65.556  <---- RESULTADO
    private static int evaluate2(String expresion){
        int posicionUltimaSuma = expresion.lastIndexOf("+");
        int posicionUltimaMulti = expresion.lastIndexOf("*");
        if (posicionUltimaSuma == -1 && posicionUltimaMulti == -1){
            // Caso BASE
            return Integer.parseInt(expresion);
        } else {
            // CASO RECURSIVO
            if (posicionUltimaSuma == -1) {
                // AQUI ENTRAMOS SI SOLAMENTE HAY MULTIPLICACIONES
                int resultat = 1;
                // en caso de que no haya sumas, pero si multiplicaciones
                String[] multiplicaciones = expresion.split("\\*"); // ["123", "456"] // ["789", "12"]
                for (String s : multiplicaciones) {
                    resultat *= Integer.parseInt(s);
                }
                return resultat;
            } else if (posicionUltimaMulti == -1){
                // AQUI ENTRAMOS SI SOLAMENTE HAY SUMAS
                int resultat = 0;
                // en caso de que no haya sumas, pero si multiplicaciones
                String[] sumas = expresion.split("\\+"); // ["56.088", "9468"]
                for (String s : sumas) {
                    resultat += Integer.parseInt(s);
                }
                return resultat;
            } else {
                String[] sumas = expresion.split("\\+"); // ["123*456", "789*12"]
                for (int i = 0; i < sumas.length; i++) {
                    int posicionUltimaMultiDelSplit = sumas[i].lastIndexOf("*");
                    if (posicionUltimaMultiDelSplit == -1){
                        // En caso de que sea un numero sin operaciones
                    } else {
                        // Aqui tenemos varios numeros con diferentes multiplicaciones "123*456"
                        String[] multiplicaciones = sumas[i].split("\\*"); // ["123", "456"] // ["789", "12"]
                        int resultado = 1;
                        for (String multiplicacione : multiplicaciones) {
                            resultado *= Integer.parseInt(multiplicacione);
                        }
                        sumas[i] = Integer.toString(resultado);
                    }
                }
//                int parar = 0;
                // sumas = ["56.088", "9468"]
                int resultadoFinal = 0;
                for (String suma : sumas) {
                    resultadoFinal += Integer.parseInt(suma);
                }
                return resultadoFinal;
            }
        }
    }


    // n es el numero de veces que tiene que revisar (length)
    // i es el numero de veces que se ha repetido
    // label la linea recibida
    // a es el numero actual que estamos sacando
    // b es el calculo (total de lo que vamos calculando)
    // c es el operador


    // FUNCIONES IMPORTANTES
    // Character.isDigit - Comprobar si es un numero
}
