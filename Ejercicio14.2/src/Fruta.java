public abstract class Fruta {
    protected float preuCompra;
    protected float preuVenda;

    public float getPreuCompra() {
        return preuCompra;
    }

    public float getPreuVenta() {
        return preuVenda;
    }

    public float margenBeneficio(float cantidad){
        return (preuCompra - preuVenda) * cantidad;
    }

    public Fruta(float preuCompra, float preuVenta) {
        this.preuCompra = preuCompra;
        this.preuVenda = preuVenta;
    }
}
