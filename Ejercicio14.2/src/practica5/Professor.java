package practica5;

public class Professor extends Persona {
    private float sou;

    public float getSou() {
        return sou;
    }

    public Professor(String nom, String dni, String adreca, float sou) {
        super(nom, dni, adreca);
        this.sou = sou;
    }
}
