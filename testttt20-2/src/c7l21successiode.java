import java.util.Locale;
import java.util.Scanner;

public class c7l21successiode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        int n = sc.nextInt();
        if (n < 2) System.out.println(n);
        else {
            System.out.println(fib(n, 2, 0, 1));
        }
    }

    // n es
    // i es
    // a es el numero penultimo de la secuencia en la que estamos
    // b es el numero ultimo de la secuencia en la que estamos
    private static int fib(int n, int i, int a, int b){
        if (n == i) return a+b;
        else return fib(n, i+1, b, a+b);
    }
}
