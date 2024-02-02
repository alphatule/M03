public class Beguda extends Producte {
    private float sucre;

    public Beguda(String nom, float sucre) {
        super(nom);
        this.sucre = sucre;
    }

    public float getSucre() {
        return sucre;
    }
}
