import java.util.Locale;
import java.util.Scanner;
class Caracol {
    private int pujats;
    private int relliscats;

    public Caracol(int pujats, int relliscats) {
        this.pujats = pujats;
        this.relliscats = relliscats;
    }
    public int pujatEnXdies(int dies){

        return ((this.pujats - this.relliscats) * dies) + this.pujats;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcadaPal = sc.nextInt();
        int pujats = sc.nextInt();
        int relliscats = sc.nextInt();
        Caracol c = new Caracol(pujats, relliscats);

        if (c.pujatEnXdies(1) >= alcadaPal){
            System.out.println(1);
        } else if (c.pujatEnXdies(2) >= alcadaPal){
            System.out.println(2);
        } else if (c.pujatEnXdies(3) >= alcadaPal){
            System.out.println(3);
        } else if (c.pujatEnXdies(4) >= alcadaPal){
            System.out.println(4);
        } else if (c.pujatEnXdies(5) >= alcadaPal){
            System.out.println(5);
        } else if (c.pujatEnXdies(6) >= alcadaPal){
            System.out.println(6);
        } else if (c.pujatEnXdies(7) >= alcadaPal){
            System.out.println(7);
        }

    }
}