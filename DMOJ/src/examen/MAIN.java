package examen;

import java.util.Locale;
import java.util.Scanner;

class Persona{
    private String nom;

    public Persona(String nom) {
        this.nom = nom;
    }


    public String presentarse(){
        return presentarse("Hola, em dic");
    }
    public String presentarse(String introduccio){
        return introduccio + " " + this.nom;
    }
}

//class Alumne extends Persona{
  //  public String presentarse(int edat){
    //    return super.presentarse() + ", i tinc " + edat + "anys.";
    //}
//}
class Calculadora{
    private boolean overflow;
    public float suma(float num1, float num2){
        float resultat = num1 + num2;
        return resultat;
    }
    public float resta(float num1, float num2){
        float resultat = num1 - num2;
        return resultat;
    }
}
class Item{
    public int valor;
}
class Modificador {
    public void incrementar(Item i){
        i.valor++;
    }
    public void decrementar(Item i){
        i.valor--;
    }
}
public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //Persona p = new Persona("Fer");
        //System.out.println(p.presentarse());
        // Calculadora a = new Calculadora();
        // System.out.println(a.resta(20, 11));

        float a = 12.5f;
        float b = 3.23f;

        Calculadora c = new Calculadora();
        //System.out.println(a + " + " + b + " = " + c.suma(a,b));
        //stem.out.println(a + " - " + b + " = " + c.resta(a,b));

        Modificador m = new Modificador();
        Item i = new Item();
        i.valor = 10;

        m.incrementar(i);
        m.incrementar(i);
        m.decrementar(i);
        System.out.println(i.valor);

    }
}
