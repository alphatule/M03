public class Pokemon {
    private String Nombre;
    private String Tipo;
    private int generacion;
    private boolean capturado;
    private int id;

    private Pokemon intercambio(int userId) { return null; }
    private Pokemon evolucion() { return null; }
    private Pokemon involucion() { return null; }

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getGeneracion() {
        return generacion;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public int getId() {
        return id;
    }

    public Pokemon(String nombre, String tipo, int generacion, boolean capturado, int id) {
        Nombre = nombre;
        Tipo = tipo;
        this.generacion = generacion;
        this.capturado = capturado;
        this.id = id;
    }
}
