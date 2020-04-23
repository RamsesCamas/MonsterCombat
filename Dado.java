import java.util.Random;

public class Dado {
    private int numCaras;
    Random random = new Random(System.currentTimeMillis());
    public Dado(int numCaras){
        this.numCaras = numCaras;
    }
    public int getNumero(){
        int caraActual = random.nextInt((numCaras)+1);
        return caraActual;
    }
}