public class Ordinador {
    protected String marca;
    protected String model;
    protected String versio;
    protected Component[] components;

    public Ordinador(String marca, String model, String versio) {
        this.marca = marca;
        this.model = model;
        this.versio = versio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getVersio() {
        return versio;
    }

    public Component[] getComponents() {
        return components;
    }

    public float calcularPreu(){
        float preu = 0;
        for (Component c: this.components){
            preu += c.getPreu();
        }

        return preu;
    }
}
