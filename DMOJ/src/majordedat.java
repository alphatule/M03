import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

class PersonaEdad {
    private String nombre;
    private int anos;

    public int getAnos() {
        return anos;
    }

    public PersonaEdad(int anos) {
        this.anos = anos;
    }
}

public class majordedat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaEdad pe1 = new PersonaEdad(sc.nextInt());
        if (pe1.getAnos() >= 18)  {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
