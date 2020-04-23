public class Personaje {
    protected float vida;
    protected Arma arma;
    public String atacar(Personaje enemy,Dado dado){
        int numDado = lanzarDado(dado);
        float damage=0;
        String mensaje= "Ataque fallido";
        if(numDado==20){
            damage = arma.getDamage() * 1.25f;
            mensaje = "Ataque critico";
        }
        else if(numDado<=19 && numDado>=2){
            numDado = numDado - arma.getDesventaja();
            if(numDado<=19 && numDado >=15){
                arma.getDesventaja();
                damage = arma.getDamage();
                mensaje = "Ataque fuerte";
            }
            else if(numDado<=14 && numDado>=8){
                damage = arma.getDamage() * 0.7f;
                mensaje = "Ataque normal";
            }
            else if(numDado <=7 && numDado >=2){
                damage = arma.getDamage() * 0.5f;
                mensaje = "Ataque debil";
            }
        }

        if(enemy instanceof Jugador  && ((Jugador)enemy).getEsquive() && numDado !=20){
            enemy.setVida(enemy.getVida());
        }else{
            enemy.setVida(enemy.getVida()-damage);
        }
        if(enemy instanceof Jugador)
            ((Jugador)enemy).setEsquive(false);
        return mensaje;
    }

    protected void setVida(Float vida){
        this.vida = vida;
    }

    protected float getVida(){
        return vida;
    }
    protected void setArma(Arma arma){
        this.arma = arma;
    }

    protected Arma getArma(){
        return arma;
    }
    protected int lanzarDado(Dado dado){
        System.out.println("Lanzando dado");
        return dado.getNumero();
    }
}