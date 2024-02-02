public class Tecnico extends Persona{
    private Color armilla;

    public Color getArmilla() {
        return armilla;
    }

    public Tecnico(String dni, String nom, Color armilla) {
        super(dni, nom);
        this.armilla = armilla;
    }
}
