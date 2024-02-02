import java.util.Scanner;

class grados{
    private int cantidad;
    private int gpc; // grado por cantidad
}

public class c1l23rellotgedemanil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float horas = sc.nextInt();
        float minutos = sc.nextInt();
        float segundos = sc.nextInt();

        horas = horas * (((30.0f / 60) * minutos * 6) / 2);
        minutos = minutos * 6.0f;
        segundos = segundos * 6.0f;

        System.out.println(horas);
        System.out.println(minutos);
        System.out.println(segundos);
    }
}
