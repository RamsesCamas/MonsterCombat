import java.util.Scanner;

public class Enfrentamiento {
    private Jugador player; 
    private Monstruo enemy;
    private Arma arma;
    private Dado dado;
    private String nombreMonstruo;
    private Ventana ventana;
    private boolean victoria= false;
    public Enfrentamiento(Jugador player, Monstruo enemy, Dado dado, String nombreMonstruo){
        this.player = player;
        this.enemy = enemy;
        this.dado = dado;
        this.nombreMonstruo = nombreMonstruo;
        setArma(player.getArma());
        this.ventana= new Ventana(this.nombreMonstruo,player);
    }

    public boolean iniciarEnfrentamiento(Scanner teclado){ 
        System.out.println("Iniciando enfrentamiento");
        ventana.setVisible(true);
        do{
            int accion,turno=0;
            System.out.println("Vida: \t\t Vida Monstruo:");
            System.out.println(player.getVida() +"\t\t"+enemy.getVida());
            do {
                System.out.println("Tu turno");
                System.out.println("1- Atacar \t 2-Esquivar");
                accion = teclado.nextInt();
                switch (accion) {
                    case 1:
                        System.out.println(player.atacar(enemy, dado));
                        turno++;
                        break;
                    case 2:
                        player.esquivar(dado, player.getArma());
                        turno++;
                        break;
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

            } while (turno<2);
            System.out.println("Tu oponente ataca:");
            System.out.println(enemy.atacar(player, dado));
            if (enemy.getVida()<=0) {
                enemy.setVida(0.0f);
                System.out.println("Caceria Completada");
                victoria= true;
            }else if (player.getVida()<=0) {
                player.setVida(0.0f);
                System.out.println("Caceria Fallida\nVolviendo a la armeria\n");
                victoria=false;
            }
        }while(player.getVida()!=0 && enemy.getVida()!=0);
        ventana.setVisible(false);
        return victoria;
    }

    public Monstruo getMonstruo(){
        return enemy;
    }
    public Jugador getCazador(){
        return player;
    }
    public void setArma(Arma arma){
        this.arma = arma;
    }
    public Arma getArma(){
        return arma;
    }
}