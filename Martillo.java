public class Martillo extends Arma{

    public Martillo(int peso, float damage, int desventaja,String nombre) {
        super(peso, damage, desventaja,nombre);
    }

    public void setSilueta(){
        silueta = " _____\n"+"|     |____\n"+"|_____|---- \t\t3-Martillo \tPeso:"+getPeso()+"\tAtaque:"+getDamage()+"\tDesventaja:"+getDesventaja();
        super.silueta = silueta;
    }
    
}