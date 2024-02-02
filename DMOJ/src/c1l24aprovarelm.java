import java.util.Scanner;

class UF {
    private int totalPrac;
    private int entregadesPrac;
    private int notaExamen;

    public UF(int totalPrac, int entregadesPrac, int notaExamen) {
        this.totalPrac = totalPrac;
        this.entregadesPrac = entregadesPrac;
        this.notaExamen = notaExamen;
    }

    public boolean calcularPorcentajePracticas(int porcentaje) {
        boolean entregadoMinimo;
        entregadoMinimo = (this.entregadesPrac >= ((this.totalPrac * porcentaje) / 100));
        return entregadoMinimo;
    }

    public int getTotalPrac() {
        return totalPrac;
    }

    public int getEntregadesPrac() {
        return entregadesPrac;
    }

    public int getNotaExamen() {
        return notaExamen;
    }
}

public class c1l24aprovarelm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UF uf1 = new UF(sc.nextInt(), sc.nextInt(), sc.nextInt());
        UF uf2 = new UF(sc.nextInt(), sc.nextInt(), sc.nextInt());
        UF uf3 = new UF(sc.nextInt(), sc.nextInt(), sc.nextInt());
        boolean uf1final = (uf1.calcularPorcentajePracticas(75) && uf1.getNotaExamen() >= 4) || (uf1.calcularPorcentajePracticas(50) && uf1.getNotaExamen() >= 5) || (uf1.getNotaExamen() > 7);
        boolean uf2final = (uf2.calcularPorcentajePracticas(75) && uf2.getNotaExamen() >= 4) || (uf2.calcularPorcentajePracticas(100)) || (uf2.calcularPorcentajePracticas(50) && uf2.getNotaExamen() >= 5);
        boolean uf3final = (uf3.calcularPorcentajePracticas(100) && uf3.getNotaExamen() >= 5);

        System.out.println(uf1final && uf2final && uf3final);

        // UF1
        //      Opcion 1
        //          Minimo 75% practicas y sacar un 4 en examen
        //      Opcion 2
        //          Minimo 50% practicas y sacar un 5 en examen
        //      Opcion 3
        //          Aprueba sacando un 7 independientemente de las entregas
        // UF 2
        //      Opcion 1
        //          Minimo 75% practicas y sacar un 4 en examen
        //      Opcion 2
        //          Todas las practicas
        //      Opcion 3
        //          Minimo 50% y saca un 5
        // UF 3
        //      Opcion 1
        //          Todas las practicas y sacar un 5 en examen
        // Si UF1,UF2 y UF3 aprovadas TRUE y si suspende alguna FALSE
    }
}
