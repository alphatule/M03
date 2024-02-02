public class Persona {
    protected String dni;
    protected String nom;

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public Persona(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }
}
