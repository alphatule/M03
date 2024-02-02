import java.util.Scanner;

class FinAno {
    private int hora;
    private int minuto;

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public FinAno(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
}
public class c1l110comptantel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinAno p1 = new FinAno(sc.nextInt(), sc.nextInt());
        // Minutos de horas
        int minHora = (23 - p1.getHora()) * 60;
        int minMin = (60 - p1.getMinuto());
        System.out.println( minHora + minMin );
    }
}
