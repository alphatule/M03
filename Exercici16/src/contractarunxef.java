import java.util.Scanner;

class Informacion {
    private String info;

    public String getInfo() {
        return info;
    }

    public Informacion(String info) {
        this.info = info;
    }
}

public class contractarunxef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Informacion p1 = new Informacion(sc.nextLine());
        Informacion p2 = new Informacion(sc.nextLine());
        Informacion p3 = new Informacion(sc.nextLine());
        Informacion p4 = new Informacion(sc.nextLine());
        Informacion p5 = new Informacion(sc.nextLine());
        System.out.println("El formulari de " + p1.getInfo() + " s'ha completat. Et contactarem si necessitem un xef de cuina " + p5.getInfo() + ".");
    }
}
