import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

class Calculadora {
    private float a = 0.0f;

    public Calculadora() {
    }

    public float suma(float p1) {
        return a = a + p1;
    }

    public float resta(float p1) {
        return a = a - p1;
    }

    public float multiplicacio(float p1) {
        return a = a * p1;
    }

    public float divisio(float p1) {
        return a = a / p1;
    }

}

public class calculadoraacumula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String operacion = sc.next();

        if (Objects.equals(operacion, "END")) {
            System.out.println(0.0);
        } else {
            Calculadora c = new Calculadora();
            while (!Objects.equals(operacion, "END")) {
                float operante = sc.nextFloat();
                if (Objects.equals(operacion, "+")) {
                    System.out.println(c.suma(operante));
                } else if (Objects.equals(operacion, "-")) {
                    System.out.println(c.resta(operante));
                } else if (Objects.equals(operacion, "*")) {
                    System.out.println(c.multiplicacio(operante));
                } else if (Objects.equals(operacion, "/")) {
                    System.out.println(c.divisio(operante));
                }
                operacion = sc.next();
            }
        }
    }
}
