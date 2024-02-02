public class Portatil extends Ordinador {
    private int carrega;

    public Portatil(String marca, String model, String versio, int carrega) {
        super(marca, model, versio);
        this.carrega = carrega;
    }

    public int getCarrega() {
        return carrega;
    }

    public void setCarrega(int carrega) {
        this.carrega = carrega;
    }
}
