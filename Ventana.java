import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    private String nombreMonstruo;
    private Jugador cazador;
    public Ventana(String nombreMonstruo, Jugador cazador){
        this.nombreMonstruo = nombreMonstruo;
        this.cazador = cazador;
        setSize(720,350);
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        ImageIcon imagen =new ImageIcon(nombreMonstruo);
        ImageIcon imagen2=null;
        if (cazador.getArma() instanceof GranEspada) {
            imagen2 =new ImageIcon("GS.png");
        }else if (cazador.getArma() instanceof Katana) {
            imagen2 =new ImageIcon("LS.png");
        }
        else if (cazador.getArma() instanceof Martillo) {
            imagen2 =new ImageIcon("HM.jpeg");
        }
        else if (cazador.getArma() instanceof Arco) {
            imagen2 =new ImageIcon("ARCO.jpg");
        }
        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel();
        etiqueta.setBounds(10,80,300,300);
        etiqueta2.setBounds(10,80,300,300);
        etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_SMOOTH)));
        etiqueta2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(etiqueta.getWidth(), etiqueta.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta);
        panel.add(etiqueta2);
    }
}