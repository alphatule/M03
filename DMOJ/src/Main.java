class Persona {
    private int id;
    public String nom;
    public boolean majorEdat;
}
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.majorEdat = true;
        System.out.println(p.majorEdat);
    }
}