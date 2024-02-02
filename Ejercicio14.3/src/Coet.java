public class Coet {
    private int id;
    private String nombre;
    private float alcada;
    private float pes;
    private Persona[] treballadors;
    private Peces[] peces;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getAlcada() {
        return alcada;
    }

    public float getPes() {
        return pes;
    }

    public Persona[] getTreballadors() {
        return treballadors;
    }

    public Peces[] getPeces() {
        return peces;
    }

    public Coet(int id, String nombre, float alcada, float pes) {
        this.id = id;
        this.nombre = nombre;
        this.alcada = alcada;
        this.pes = pes;
    }
}
