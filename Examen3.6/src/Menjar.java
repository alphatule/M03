public class Menjar extends Producte {
    private boolean vegetaria;

    private Beguda[] combina;

    public boolean isVegetaria() {
        return vegetaria;
    }

    public Menjar(String nom, boolean vegetaria) {
        super(nom);
        this.vegetaria = vegetaria;
    }
}
