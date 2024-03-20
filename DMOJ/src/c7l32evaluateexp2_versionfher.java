import java.util.Locale;
import java.util.Scanner;

public class c7l32evaluateexp2_versionfher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String exp = sc.nextLine();
        System.out.println(calculate(exp));
    }

    private static int calculate(String exp){
        int indexOfSuma = exp.lastIndexOf('+');
        int indexOfMulti = exp.lastIndexOf('*');
        if (indexOfSuma == -1 && indexOfMulti == -1){
            return Integer.parseInt(exp); // Caso BASE
        } else {
          if (indexOfSuma != -1){
              String left = exp.substring(0, indexOfSuma);
              String right = exp.substring(indexOfSuma+1);
              return calculate(left) + calculate(right);
          } else if (indexOfMulti != -1){
              String left = exp.substring(0, indexOfMulti);
              String right = exp.substring(indexOfMulti+1);
              return calculate(left) * calculate(right);
          }
        }
        return -1;
    }
}
