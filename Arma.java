public class Arma {

    protected int peso,desventaja;
    protected float damage;
    protected String silueta;
    protected String nombre;

    public Arma(int peso, float damage, int desventaja,String nombre){
        this.peso = peso;
        this.damage = damage;
        this.desventaja = desventaja;
        this.nombre = nombre;
    }
    protected void setSilueta(String silueta){
        this.silueta = silueta;
    }
    protected String getSilueta(){
        return silueta;
    }
    protected int getPeso(){
        return peso;
    }
    protected float getDamage(){
        return damage;
    }
    protected int getDesventaja(){
        return desventaja;
    }
    protected String getNombre(){
        return nombre;
    }

}