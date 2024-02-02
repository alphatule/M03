package practica5;

public class Persona {
    protected String nom;
    protected String dni;
    protected String adreca;

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public String getAdreca() {
        return adreca;
    }

    public Persona(String nom, String dni, String adreca) {
        this.nom = nom;
        this.dni = dni;
        this.adreca = adreca;
    }
}
