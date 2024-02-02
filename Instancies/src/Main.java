public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient();
        p1.nombre = "Nacho";
        p1.apellidos = "Herrero";
        p1.DNI = "56842937B";
        p1.peso = 56.2f;

        Pacient p2 = new Pacient();
        p2.nombre = "Davide";
        p2.apellidos = "Carrion";
        p2.DNI = "84532795D";
        p2.peso = 76.2f;

        Pacient p3 = p1;
        p3.nombre = "Alex";
        p3.apellidos = "Martin";
        p3.DNI = "53832435A";
        p3.peso = 82.2f;

        System.out.println("Información del paciente 1:\n" +
                "Nombre: " + p1.nombre +
                "\nApellidos: " + p1.apellidos +
                "\nDNI: " + p1.DNI +
                "\nPeso: " + p1.peso);

        System.out.println("Información del paciente 2:\n" +
                "Nombre: " + p2.nombre +
                "\nApellidos: " + p2.apellidos +
                "\nDNI: " + p2.DNI +
                "\nPeso: " + p2.peso);

        System.out.println("Información del paciente 3:\n" +
                "Nombre: " + p3.nombre +
                "\nApellidos: " + p3.apellidos +
                "\nDNI: " + p3.DNI +
                "\nPeso: " + p3.peso);
        // La diferencia que nos encontramos es que estamos sobre escribiendo los valores de p1 en la variable de p3 debido a que tenemos un puntero.

        // FRUITERIA LAS MAS RICAS DE LAS FRUTAS
        Fruiteria f1 = new Fruiteria();
        f1.precio = 23;
        f1.dinerototal = 62.23f;
        f1.cantidad = 13;

        Fruiteria f2 = new Fruiteria();
        f2.precio = 54;
        f2.dinerototal = 134.86f;
        f2.cantidad = 44;

        Fruiteria f3 = f1;
        f3.precio = 54;
        f3.dinerototal = 134.86f;
        f3.cantidad = 44;

        System.out.println("Información de fruiteria 1:\n" +
                "Precio: " + f1.precio +
                "\nDinero Total: " + f1.dinerototal +
                "\nCantidad: " + f1.cantidad);

        System.out.println("Información de fruiteria 3:\n" +
                "Precio: " + f2.precio +
                "\nDinero Total: " + f2.dinerototal +
                "\nCantidad: " + f2.cantidad);

        System.out.println("Información de fruiteria 2:\n" +
                "Precio: " + f3.precio +
                "\nDinero Total: " + f3.dinerototal +
                "\nCantidad: " + f3.cantidad);

        // CARTITAS DE LAS CARTASZ DE CARTOTAS LAS MAS RICAS DE LAS DEL WOW
        Carta c1 = new Carta();
        c1.Nombre = "El diablo alocado";
        c1.dorada = false;
        c1.Mana = 23;
        c1.tipo = 1566;
        c1.img = "./img/" + c1.Nombre + ".png";
        c1.Ataque = 10;
        c1.Vida = 523.3f;

        Carta c2 = new Carta();
        c2.Nombre = "El pepe";
        c2.dorada = true;
        c2.Mana = 54;
        c2.tipo = 1232;
        c2.img = "./img/" + c2.Nombre + ".png";
        c2.Ataque = 5;
        c2.Vida = 341.8f;

        Carta c3 = c1;
        c3.Nombre = "EsteBAN eado";
        c3.dorada = true;
        c3.Mana = 13;
        c3.tipo = 1800;
        c3.img = "./img/" + c3.Nombre + ".png";
        c3.Ataque = 25;
        c3.Vida = 196.3f;

        System.out.println("Información de la carta 1:\n" +
                "Nombre: " + c1.Nombre +
                "\nEs dorada?: " + c1.dorada +
                "\nMana: " + c1.Mana +
                "\nTipo: " + c1.tipo +
                "\nImagen: " + c1.img +
                "\nAtaque: " + c1.Ataque +
                "\nVida: " + c1.Vida);

        System.out.println("Información de la carta 2:\n" +
                "Nombre: " + c2.Nombre +
                "\nEs dorada?: " + c2.dorada +
                "\nMana: " + c2.Mana +
                "\nTipo: " + c2.tipo +
                "\nImagen: " + c2.img +
                "\nAtaque: " + c2.Ataque +
                "\nVida: " + c2.Vida);

        System.out.println("Información de la carta 3:\n" +
                "Nombre: " + c3.Nombre +
                "\nEs dorada?: " + c3.dorada +
                "\nMana: " + c3.Mana +
                "\nTipo: " + c3.tipo +
                "\nImagen: " + c3.img +
                "\nAtaque: " + c3.Ataque +
                "\nVida: " + c3.Vida);

    }
}