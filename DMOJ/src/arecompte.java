import java.util.Scanner;

class EmpresaBus {
    private int busDisponibles;

    public int getBusDisponibles() {
        return busDisponibles;
    }

    public EmpresaBus(int busDisponibles) {
        this.busDisponibles = busDisponibles;
    }
}
public class arecompte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpresaBus e1 = new EmpresaBus(sc.nextInt());
        EmpresaBus e2 = new EmpresaBus(sc.nextInt());
        System.out.println( (e1.getBusDisponibles() + e2.getBusDisponibles()) * sc.nextInt() );
    }
}
