import java.util.Scanner;

public class c3l02interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = "";
        for (int i = a; i < b; i++) {
            c = c + i;
        }
        System.out.println(c);
    }
}
