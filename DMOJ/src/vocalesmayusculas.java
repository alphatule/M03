import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class vocalesmayusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String texto = "";
        boolean revisando = true;
        while (revisando){
            String linea = sc.nextLine();
            if (Objects.equals(linea, "END")){
                revisando = false;
            } else {
                texto += "\n" + linea;
            }
        }
        //System.out.println("TEXTO SIN MODIFICAR");
        //System.out.println(texto);
        // tenemos ya el texto guardado falta cambiar las MIN a MAY
        // a,e,i,o,u
        String vMin = "aeiou";
        String vMay = "AEIOU";
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            char caracter = caracteres[i];
            int posicion = vMin.indexOf(caracter);
            if (posicion != -1){
                caracteres[i] = vMay.charAt(posicion);
            }
        }

        // Pasamos la cadena de caracteres cambiada a string y la asignamos a la variable texto
        texto = new String(caracteres);
        // System.out.println("TEXTO MODIFICADO");
        System.out.println(texto);

    }
}
