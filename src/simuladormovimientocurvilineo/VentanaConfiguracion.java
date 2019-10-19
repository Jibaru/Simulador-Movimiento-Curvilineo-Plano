
package simuladormovimientocurvilineo;

import javax.swing.JFrame;
/**
 *
 * @author Jibaru
 */
public class VentanaConfiguracion extends JFrame{
    public VentanaConfiguracion(int width,int height){
        this.setBounds(10, 10, width, height);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Configuración");
    }
}
