import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Archivo {
    private String ext;
    private String archivo;

    public String getExt() {
        return ext;
    }

    public String getArchivo() {
        return archivo;
    }

    public Archivo(String ext, String archivo) {
        this.ext = ext;
        this.archivo = archivo;
    }
    public String toString() {
        return (this.getArchivo() + " " + this.getExt());
    }
}

public class arxiusdecodifont {
    public static void main(String[] args) throws FileNotFoundException {
        // FileReader f = new FileReader("media/asd.txt");
        // Scanner sc = new Scanner(f);
        Scanner sc = new Scanner(System.in);

        Archivo p1 = new Archivo(sc.next(), sc.nextLine());
        Archivo p2 = new Archivo(sc.next(), sc.nextLine());
        Archivo p3 = new Archivo(sc.next(), sc.nextLine());
        Archivo p4 = new Archivo(sc.next(), sc.nextLine());

        System.out.println(p4);
        System.out.println(p3);
        System.out.println(p2);
        System.out.println(p1);

    }
}
