import java.util.Scanner;

class CoordCuadrado {
    private int x;
    private int Y;

    public int getX() {
        return x;
    }

    public int getY() {
        return Y;
    }

    public CoordCuadrado(int x, int y) {
        this.x = x;
        Y = y;
    }
}

public class c1l111perimetred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoordCuadrado p1 = new CoordCuadrado(sc.nextInt(), sc.nextInt());
        CoordCuadrado p2 = new CoordCuadrado(sc.nextInt(), sc.nextInt());
        System.out.println( ( (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) ) * 2 );

    }
}
