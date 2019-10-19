
package simuladormovimientocurvilineo;

import javax.swing.JFrame;

/**
 *
 * @author Jibaru
 */
public class VentanaPrincipal extends JFrame{
    
    
    public VentanaPrincipal(int width,int height){
        this.setBounds(0, 0, width, height);
        this.setTitle("Simulador Movimiento Curvilíneo Plano");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal principal = new VentanaPrincipal(800, 600);
        System.out.print("cambio prueba");
    }
    
}

