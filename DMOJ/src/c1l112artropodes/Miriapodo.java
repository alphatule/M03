package c1l112artropodes;

public class Miriapodo extends Artropodo{
    private int segmentos;
    private int patasSeg;

    public Miriapodo(int total, int patas, int segmentos, int patasSeg) {
        super(total, patas);
        this.segmentos = segmentos;
        this.patasSeg = patasSeg;
    }
}
