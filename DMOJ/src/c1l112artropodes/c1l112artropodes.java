package c1l112artropodes;

import java.util.Scanner;

public class c1l112artropodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Artropodo insectos = new Artropodo(sc.nextInt(), 6);
        Artropodo aracnidos = new Artropodo(sc.nextInt(), 8);
        Artropodo crustacios = new Artropodo(sc.nextInt(), 10);
        //Miriapodo Miriapodos = new Miriapodo(sc.nextInt(), 2, 2, 2);

        int i = sc.nextInt();
        int a = sc.nextInt();
        int c = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        int total;

        m1 = m1 * s1 * 2;
        m2 = m2 * s2 * 4;

        total = ((i * 6) + (a * 8) + (c * 10) + m1 + m2);

        System.out.println(total);

    }
}