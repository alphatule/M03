class Paquiderms {
    private String especie;
    private int cantidad;
    private boolean forana; // En caso de false es autoctona, si es true es forana
    private boolean hidratado;
    private int velocidadMxKm; // Entero de KM/H


    public Paquiderms(String especie, int cantidad, boolean forana, int velocidadMxKm) {
        this.especie = especie;
        this.cantidad = cantidad;
        this.forana = forana;
        this.velocidadMxKm = velocidadMxKm;
    }

    // Getters
    public String getEspecie() {
        return especie;
    }
    public int getCantidad() {
        return cantidad;
    }
    public boolean isForana() {
        return forana;
    }
    public boolean isHidratado() {
        return hidratado;
    }
    public int getVelocidadMx() {
        return velocidadMxKm;
    }

    // Setters
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Funciones requeridas
    public void beberAgua(){
        this.hidratado = true;
    }

    public boolean correr(int vDebeLlegar){
        if (vDebeLlegar < velocidadMxKm) return false;  // No llega a la velocidad indicada
        else return true; // Llega a la velocidad indicada
    }
}
public class examen {
    public static void main(String[] args) {
        Paquiderms rinocerontes = new Paquiderms("Rinoceronte", 20, true, 30);
        Paquiderms elefantes = new Paquiderms("Elefante", 20, true, 20);
        Paquiderms hipopotamos = new Paquiderms("Hipopotamos", 20, true, 15);

    }
}