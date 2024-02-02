import java.util.Scanner;

class Persona {
    private String nom;

    public String getNom() {
        return nom;
    }

    public Persona(String nom) {
        this.nom = nom;
    }
}

public class ahelloyou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona nom = new Persona(sc.nextLine());
        System.out.println("Hola " + nom.getNom() + "!");
    }
}
