package practica5;

public class Alumne extends Persona {
    private String curs;

    public String getCurs() {
        return curs;
    }

    public Alumne(String nom, String dni, String adreca, String curs) {
        super(nom, dni, adreca);
        this.curs = curs;
    }
}
