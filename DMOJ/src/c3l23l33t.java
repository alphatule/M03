import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class c3l23l33t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String letras = "ABEGILMOSTUVWZ";
        String letras2 = "abegilmostuvwz";
        String[] letrasSus = new String[]{
            "4", // A
            "8", // B
            "3", // E
            "6", // G
            "!", // I
            "1", // L
            "/\\/\\", // M
            "0", // O
            "5", // S
            "7", // T
            "|_|", // U
            "\\\\//", // V
            "\\/\\/", // W
            "2" // Z
        };

        String texto = "";
        boolean revisando = true;
        while (revisando){
            String linea = sc.nextLine();
            if (Objects.equals(linea, "END")){
                revisando = false;
            } else {
                texto += (texto == "" ? linea : "\n" + linea);
            }
        }

        boolean tocaMayu = false;
        String textoModificado = "";
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            char caracter = caracteres[i];
            int posicion = letras.indexOf(caracter);
            int posicion2 = letras2.indexOf(caracter);
            if (posicion != -1){
                textoModificado += letrasSus[posicion];
            } else if (posicion2 != -1) {
                textoModificado += letrasSus[posicion2];
            } else {
                if (caracter != '.' && caracter != ','){
                    if (tocaMayu){
                        if (Character.isUpperCase(caracter)){
                            textoModificado += caracter;
                        } else {
                            textoModificado += Character.toUpperCase(caracter);
                        }
                    } else {
                        if (Character.isLowerCase(caracter)){
                            textoModificado += caracter;
                        } else {
                            textoModificado += Character.toLowerCase(caracter);
                        }
                    }
                    if (caracter != '\n' && caracter != ' '){
                        tocaMayu = !tocaMayu;
                    }
                }
            }
        }

        // System.out.println(letras.indexOf('A'));
        // System.out.println(letrasSus[letras.indexOf('A')]);
        // System.out.println("------------------------------");
        // System.out.println(texto);
        // System.out.println("------------------------------");
        System.out.println(textoModificado);
    }
}
