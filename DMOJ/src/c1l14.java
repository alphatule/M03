import java.util.Scanner;

public class c1l14 {
    public static void main(String[] args) {
        // Calcular el numero de libros que caben en la estantrias
        // y saber si caben los libros de miquel
        Scanner sc = new Scanner(System.in);
        int cEstanterias = sc.nextInt();
        int cEstanteria = sc.nextInt();
        int cLibros = sc.nextInt();
        int tLibros = sc.nextInt();

        boolean cabenLibros = ((cEstanterias * cEstanteria) * cLibros) >= tLibros;
        System.out.println(cabenLibros);
    }
}
