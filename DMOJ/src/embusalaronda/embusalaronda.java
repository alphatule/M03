package embusalaronda;

import java.util.Locale;
import java.util.Scanner;

class Ronda {
    private int coches;
    private int minutos;

    public Ronda(int coches, int minutos) {
        this.coches = coches;
        this.minutos = minutos;
    }

    public float totalCochesMin(){
        float cochesM = (float) coches / minutos;
        return cochesM;
    }
}

public class embusalaronda {
    private static void tipusEmbus(float totalC){
        if (totalC > 625) {
            System.out.println("Embús extrem.");
        } else if (totalC > 575) {
            System.out.println("Embús alt.");
        } else if (totalC > 425 ) {
            System.out.println("Embús moderat.");
        } else if (totalC > 375) {
            System.out.println("Embús baix.");
        } else if (totalC <= 375) {
            System.out.println("No hi ha embús.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int c = sc.nextInt();
        int t = sc.nextInt();

        Ronda r = new Ronda(c,t);
        float totalC = r.totalCochesMin();
        tipusEmbus(totalC);
    }

}
