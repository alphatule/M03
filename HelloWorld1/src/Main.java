import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Estimat alumne,\n" +
                "\n" +
                "Programar és com anar en bicicleta, cal intentar-ho 1 cop, 2 cops, 3 cops...\n" +
                "Cauràs a terra i et faràs mal. Cal insistir-hi!\n" +
                "Tonaràs a caure, i hauràs d'insistir de nou!\n" +
                "Mica en mica, sense que te'n adonis, cada cop mantindràs més temps l'equilibri, fins que un dia de sobte, EUREKA! Hauràs après a programar i sabràs explicar a ningú com ho has aconseguit, només tindràs clar que cal caure moltes vegades de la bicicleta per aprendre. \n" +
                "\n" +
                "Per sort, caure d'aquesta bicicleta no fa mal, però pot frustrar. Recorda que tens els professors i els teus companys per donar-te suport. \n" +
                "\n" +
                "Ànims!");
    }
}