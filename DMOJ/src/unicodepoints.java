import java.util.Scanner;

public class unicodepoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(String.valueOf(Character.toChars(sc.nextInt())) + String.valueOf(Character.toChars(sc.nextInt())) + String.valueOf(Character.toChars(sc.nextInt())) + String.valueOf(Character.toChars(sc.nextInt())) + String.valueOf(Character.toChars(sc.nextInt())) + String.valueOf(Character.toChars(sc.nextInt())));
    }
}
