import java.util.Locale;
import java.util.Scanner;

class Alumno {
    private String nombre;
    private String apellido;
    private float nota;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    public float getNota() {
        return nota;
    }

    public Alumno(String nombre, String apellido, float nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;

    }
}

public class aprovaono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int cAlumnos = sc.nextInt();

        for (int i = 0; i < cAlumnos; i++) {
            Alumno a = new Alumno(sc.next(), sc.next(), sc.nextFloat());
            System.out.println(a.getNombreCompleto() + ": " + ((a.getNota() >= 5.0) ? "aprova" : "suspèn"));
        }

    }
}