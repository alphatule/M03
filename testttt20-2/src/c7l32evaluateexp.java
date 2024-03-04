import java.util.Locale;
import java.util.Scanner;

public class c7l32evaluateexp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String cadena = sc.nextLine();
//        System.out.println("RESULTADO DE LA FUNCION: \n"+evaluate(cadena.length(), 0, cadena, "", null, ' '));
        System.out.println(evaluate(cadena.length(), 0, cadena, "", null, ' '));

    }


    // n es el numero de veces que tiene que revisar (length)
    // i es el numero de veces que se ha repetido
    // label la linea recibida
    // a es el numero actual que estamos sacando
    // b es el calculo (total de lo que vamos calculando)
    // c es el operador

    private static int evaluate(int n, int i, String label, String a, Integer b, char c){
        if(n == i){
//            System.out.println("n: "+n+
//                                "\ni: "+i+
//                                "\nlabel: "+label+
//                                "\na: "+a+
//                                "\nb: "+b+
//                                "\nc: "+c
//            );
            if (b == null) return Integer.parseInt(a);
            else {
                switch (c){
                    case '+':
                        b += Integer.parseInt(a);
                        break;
                    case '*':
                        b *= Integer.parseInt(a);
                        break;
                }
                return b;
            }
        } else {
            // c es caracter actual
            char caracter = label.charAt(i);
            if (Character.isDigit(caracter)){
                // Es un numero, pero antes comprobamos si tenemos que hacer una operacion
                if (c != ' '){
                    // En caso de que tengamos un operador de antes reseteamos a
                    a = "";
                }

                a += caracter;
            } else {
                // Es un operador, por lo que hay que hacer el calculo
                if (b != null){
                    // En caso de que tengamos un calculo anterior
                    switch (c){
                        case '+':
                            b += Integer.parseInt(a);
                            break;
                        case '*':
                            b *= Integer.parseInt(a);
                            break;
                    }
                    a = "";
                    c = caracter;
                } else {
                    // No hemos calculado nada (b == 0) por lo que
                    b = Integer.parseInt(a);
                    c = caracter;
                }
            }

            return evaluate(n,i+1, label, a, b, c);
        }

//        return 0;
    }

    // FUNCIONES IMPORTANTES
    // Character.isDigit - Comprobar si es un numero
    private static int fib(int n, int i, int a, int b){
        if (n == i) return a+b;
        else return fib(n, i+1, b, a+b);
    }
}
