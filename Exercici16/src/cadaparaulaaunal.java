import java.util.Scanner;

class Informacion2 {
    private String info;

    public String toString() {
        return info;
    }

    public Informacion2(String info) {
        this.info = info;
    }
}

public class cadaparaulaaunal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Informacion2 p1 = new Informacion2(sc.next());
        Informacion2 p2 = new Informacion2(sc.next());
        Informacion2 p3 = new Informacion2(sc.next());
        Informacion2 p4 = new Informacion2(sc.next());
        Informacion2 p5 = new Informacion2(sc.next());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
