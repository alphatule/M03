import java.util.Scanner;

class Examen {
    private float nota;

    public float getNota() {
        return nota;
    }

    public Examen(float nota) {
        this.nota = nota;
    }
}
public class c1l15notamitjana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Examen e1 = new Examen(sc.nextFloat());
        Examen e2 = new Examen(sc.nextFloat());
        Examen e3 = new Examen(sc.nextFloat());
        System.out.println( (e1.getNota() + e2.getNota() + e3.getNota()) / 3 );
    }
}
