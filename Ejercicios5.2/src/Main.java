
// EJ bookclass4
class Book {
    public String title;
    public int yearOfPublishing;
    public boolean isAvailable;
}
// EJ definirlaclasseco
class CompteCorrent {
    public float saldo;
    public String nomPropietari;
    public boolean bloquejada;

}
// EJ innerbox
class Box {
    public float length;
    public float height;
    public float width;
    public Box innerBox;
}

public class Main {
    public static void main(String[] args) {
        // EJ bookclass4
        Book book = new Book();

        book.title = "Through the looking glass";
        book.yearOfPublishing = 1871;
        book.isAvailable = true;

        System.out.println(book.title);
        System.out.println(book.yearOfPublishing);
        System.out.println(book.isAvailable);

        // EJ definirlaclasseco
        CompteCorrent cc = new CompteCorrent();

        cc.saldo = 999.9f;
        cc.nomPropietari = "Jeff Bezos";
        cc.bloquejada = false;

        System.out.println(cc.saldo);
        System.out.println(cc.nomPropietari);
        System.out.println(cc.bloquejada);

        // EJ innerbox
        Box box = new Box();

        box.length = 10000.5f;
        box.height = 3000.5f;
        box.width = 4000.75f;

        box.innerBox = new Box();

        box.innerBox.length = 1000.5f;
        box.innerBox.height = 300.5f;
        box.innerBox.width = 400.75f;

        box.innerBox.innerBox = new Box();

        box.innerBox.innerBox.length = 100.5f;
        box.innerBox.innerBox.height = 30.5f;
        box.innerBox.innerBox.width = 40.75f;

        box.innerBox.innerBox.innerBox = new Box();

        box.innerBox.innerBox.innerBox.length = 10.5f;
        box.innerBox.innerBox.innerBox.height = 3.5f;
        box.innerBox.innerBox.innerBox.width = 4.75f;

        System.out.println(box.innerBox.innerBox.innerBox.width);
    }
}