public class Arco extends Arma {
    public Arco(int peso, float damage, int desventaja,String nombre) {
        super(peso, damage, desventaja,nombre);
    }
    @Override
    protected void setSilueta(String silueta) {
        char c = (char)92;
        silueta = "______\n" +c+ "____/" +"\t<---<\t\t4-Arco\t\tPeso:"+getPeso()+"\tAtaque:"+getDamage()+"\tDesventaja:"+getDesventaja();
        super.silueta = silueta;
    }    
}