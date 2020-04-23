public class Jugador extends Personaje{
    private boolean dodge=false;
    public void esquivar(Dado dado,Arma arma){
        int numDado = lanzarDado(dado);
        if(numDado==20){
            dodge = true;
            System.out.println("Ataque esquivado");
        }
        else if(numDado<=19 && numDado>=2){
            numDado = numDado - arma.getDesventaja();
            if(numDado<=19 && numDado >=15){
                dodge = false;
                setVida(super.vida+20);
            }
            else if(numDado<=14 && numDado>=8){
                dodge = false;
                setVida(super.vida+10);
            }
            else if(numDado <=7 && numDado >=2){
                dodge = false;
                setVida(super.vida+5);
            }
        }

    }
    public void setEsquive(boolean dodge){
        this.dodge = dodge;
    }
    public boolean getEsquive(){
        return dodge;
    }
    
}