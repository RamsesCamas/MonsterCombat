public class Katana extends Arma {

    public Katana(int peso, float damage, int desventaja,String nombre) {
        super(peso, damage, desventaja,nombre);
    }

    @Override
    protected void setSilueta(String silueta) {
        char c = (char)92;
        silueta = "_______________\n" +c+ "_________/--- \t\t2-Katana\tPeso:"+getPeso()+"\tAtaque:"+getDamage()+"\tDesventaja:"+getDesventaja();
        super.silueta = silueta;
    }
}