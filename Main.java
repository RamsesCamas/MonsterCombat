import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arco arco = new Arco(3, 30, 1,"Arco");
        ArmaMonstruo garras = new ArmaMonstruo(3, 10, 3,"Garras");
        ArmaMonstruo fauces = new ArmaMonstruo(6, 20, 5,"Fauces");
        ArmaMonstruo alientoFuego = new ArmaMonstruo(9, 50, 8,"Aliento Infernal");
        ArrayList<Arma> listaArmas = new ArrayList<>();
        ArrayList<Monstruo> listaMonstruos = new ArrayList<>();
        Dado dado = new Dado(20);
        ArrayList<Enfrentamiento> victorias = new ArrayList<>();
        GranEspada espada = new GranEspada(8, 70, 5,"Gran Espada");
        Jugador cazador = new Jugador();
        Katana katana = new Katana(5, 50, 2,"Katana");     
        Martillo martillo = new Martillo(9, 80, 6,"Martillo");
        Monstruo oso = new Monstruo(garras,"Oso Cara Corta");
        Monstruo tRex = new Monstruo(fauces,"Rexy");
        Monstruo dragon = new Monstruo(alientoFuego,"Kaiser Otachi");
        String silueta="";
        listaMonstruos.add(oso);
        listaMonstruos.add(tRex);
        listaMonstruos.add(dragon);
        Scanner teclado = new Scanner(System.in);
        espada.setSilueta(silueta);
        katana.setSilueta(silueta);
        martillo.setSilueta();
        arco.setSilueta(silueta);

        listaArmas.add(espada);
        listaArmas.add(katana);
        listaArmas.add(martillo);
        listaArmas.add(arco);
        int menu;
        do {
            System.out.println("Bienvenido a Monster Combat");
            System.out.println("1- Iniciar juego \t 2-Salir del juego");
            menu = teclado.nextInt();
            teclado.nextLine();
            switch (menu) {
                case 1:
                    int arma;
                    do {
                        boolean victoria=false;
                        System.out.println("Armeria");
                        System.out.println(espada.getSilueta());
                        System.out.println(katana.getSilueta());
                        System.out.println(martillo.getSilueta());
                        System.out.println(arco.getSilueta());
                        System.out.println("5-Ver victorias");
                        System.out.println("6-Salir");
                        System.out.println("Escoge tu arma, Cazador o una de las opciones: ");
                        arma = teclado.nextInt();
                        if (arma>0&&arma<5) {
                            cazador.setArma(listaArmas.get(arma-1));
                            int monster=0;
                            listaMonstruos.get(0).setVida(200.00f);
                            listaMonstruos.get(1).setVida(300.00f);
                            listaMonstruos.get(2).setVida(500.00f);
                            cazador.setVida(100.00f);
                            System.out.println("Escoge la caceria:");
                            System.out.println("1-Oso\t 2-T.Rex \t 3-Dragon");
                            monster = teclado.nextInt();
                            if (monster>0&&monster<4) {
                                Enfrentamiento caceria=null;
                                switch (monster) {
                                    case 1:
                                        caceria= new Enfrentamiento(cazador, listaMonstruos.get(0), dado,"oso.png");
                                        break;
                                    case 2:
                                        caceria = new Enfrentamiento(cazador,listaMonstruos.get(1), dado, "trex.png");
                                        break;
                                    case 3:
                                        caceria = new Enfrentamiento(cazador, listaMonstruos.get(2), dado, "dragon2.jpg");
                                    default:
                                        break;
                                }
                                victoria= caceria.iniciarEnfrentamiento(teclado);
                                if(victoria)
                                    victorias.add(caceria);
                            }
                        }else if (arma==5) {
                            int j;
                            System.out.println("Tus victorias aplastantes");
                            System.out.println("Total de victorias: "+ victorias.size());
                            for (int i = 0; i < victorias.size(); i++) {
                                j=i+1;
                                System.out.println("Victoria "+j+": Enemigo: "+victorias.get(i).getMonstruo().getNombre() +"\tArma Usada: "+victorias.get(i).getArma().getNombre());
                            }
                        }
                        else if (arma==6) {
                            System.out.println("Hasta luego cazador");
                            menu=2;
                        }
                        else {
                            System.out.println("Opcion invalida");
                            menu=1;
                        }
                    } while (arma>0 && arma<6);
                    break;
                case 2:
                    System.out.println("Hasta luego Cazador");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (menu!=2);
        teclado.close();
    }
}