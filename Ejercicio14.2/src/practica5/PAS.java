package practica5;

public class PAS extends Persona{
    private String carrec;

    public String getCarrec() {
        return carrec;
    }

    public PAS(String nom, String dni, String adreca, String carrec) {
        super(nom, dni, adreca);
        this.carrec = carrec;
    }
}
