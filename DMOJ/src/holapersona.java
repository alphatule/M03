import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.util.Locale;
import java.util.Scanner;

// Declara aqui la classe (sense cap modificador)
class Personados {
    String nom;

    void saludar() {
        System.out.println("Hola, em dic " + this.nom);
    }
}

public class holapersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Personados unaPersona = new Personados();
        unaPersona.nom = scanner.next();
        unaPersona.saludar();

        Personados unaAltraPersona = new Personados();
        unaAltraPersona.nom = scanner.next();
        unaAltraPersona.saludar();
    }
}
