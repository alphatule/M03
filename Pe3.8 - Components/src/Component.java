public class Component {
    private String tipus;

    private float preu;

    public Component(String tipus, float preu) {
        this.tipus = tipus;
        this.preu = preu;
    }

    public String getTipus() {
        return tipus;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }
}
