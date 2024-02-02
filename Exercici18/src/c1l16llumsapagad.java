import java.util.Scanner;

class Luz {
    private boolean on;

    public boolean isOn() {
        return on;
    }

    public Luz(boolean on) {
        this.on = on;
    }
}
public class c1l16llumsapagad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Luz l1 = new Luz(sc.nextBoolean());
        Luz l2 = new Luz(sc.nextBoolean());
        Luz l3 = new Luz(sc.nextBoolean());
        Luz l4 = new Luz(sc.nextBoolean());
        if (l1.isOn() || l2.isOn() || l3.isOn() || l4.isOn()) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
