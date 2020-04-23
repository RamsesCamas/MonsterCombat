public class Monstruo extends Personaje{

    private String nombre;
    public Monstruo(ArmaMonstruo arma,String nombre){
        this.arma = arma;
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
}