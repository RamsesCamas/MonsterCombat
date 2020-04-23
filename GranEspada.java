public class GranEspada extends Arma{

    public GranEspada(int peso, float damage, int desventaja,String nombre) {
        super(peso, damage, desventaja,nombre);
    }
    @Override
    protected void setSilueta(String silueta) {
        char c = (char)92;
        silueta = "_________________\n" +c+"          _____/\t1-Gran Espada \tPeso:"+getPeso()+"\tAtaque:"+getDamage()+"\tDesventaja:"+getDesventaja()  + "\n "+c+"________/";
        super.silueta = silueta;
    }    
}