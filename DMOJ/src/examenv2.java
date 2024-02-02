import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Felinos {
    private String especie;
    private int cantidad;
    private boolean diurno;

    public Felinos(String especie, int cantidad, boolean diurno) {
        this.especie = especie;
        this.cantidad = cantidad;
        this.diurno = diurno;
    }

    public String getEspecie() {
        return especie;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isDiurno() {
        return diurno;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
public class examenv2 {
    public static void main(String[] args) {
        Felinos hola = new Felinos("si", 12, false);
        System.out.println(hola.getEspecie() + hola.getCantidad() + hola.getClass());
    }
}
