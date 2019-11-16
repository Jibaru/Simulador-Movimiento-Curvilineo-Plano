/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormovimientocurvilineo;

import ecuaciones.Monomio;
import ecuaciones.Polinomio;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Jibaru
 */
public class PlanoCartesiano extends javax.swing.JPanel implements Runnable{
    
    int x=getWidth()/2;
    private int xPos = 0;
    private int yPos = 0;
    private Dimension sizeObject;
    private Image background;
    protected Thread hilo = new Thread(this);
    private boolean isRunning = false;
    private int escala;
    private int delay;
    private double tiempoMax;
    private Polinomio polinomio;
    /**
     * Creates new form PlanoCartesiano
     */
    public PlanoCartesiano() {
        initComponents();
        sizeObject = new Dimension(10,10);
        background = new ImageIcon("src/assets/img/fondo1.jpg").getImage();
        escala = 45;
        delay = 30;
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(background, 0, 0, null);
        g.setColor(Color.red);
        g.fillOval(xPos, yPos,sizeObject.width,sizeObject.height);
    }
    
    @Override
    public void run() {
        isRunning = true;
        Polinomio vel = polinomio.getDerivada();
        Polinomio acel = vel.getDerivada();
        
        List<List<Double>> velocidadtiempo = new ArrayList<>();
        List<List<Double>> aceleraciontiempo = new ArrayList<>();
        List<List<Double>> xy = new ArrayList<>();
        
        VentanaPrincipal.datosReportes.clear();
        
        try{
            /*while(true){
                while(x<getWidth()-30){
                Thread.sleep(50);
                x+=10;
                repaint();
                }
                while(x>10){
                    Thread.sleep(50);
                    x-=10;
                    repaint();
                }
            }*/
            for( double tiempo = 0; tiempo <= tiempoMax && isRunning; tiempo +=0.01 ){
                double porcentaje = tiempo*100/tiempoMax;
                
                VentanaPrincipal.progressBarSimulacion.setValue((int)porcentaje);
                Thread.sleep(delay);
                
                //Monomio[] binomios = new Monomio[2];
                //binomios[0] = new Monomio(3,1);
                //binomios[1] = new Monomio(-2,2);
                
                double _x = tiempo*Math.cos(Math.PI/6)*22;
                //double _y = binomios[0].getValor(_x) + binomios[1].getValor(_x);
                double _y = polinomio.getY(_x);
                double _velocidad = vel.getY(_x);
                double _aceleracion = acel.getY(_x);
                
                List<Double> datosVT = new ArrayList<>();
                datosVT.add(_velocidad);
                datosVT.add(tiempo);
                velocidadtiempo.add(datosVT);
                
                List<Double> datosAT = new ArrayList<>();
                datosAT.add(_aceleracion);
                datosAT.add(tiempo);
                aceleraciontiempo.add(datosAT);
                
                List<Double> datosxy = new ArrayList<>();
                datosxy.add(_x);
                datosxy.add(_y);
                xy.add(datosxy);
                //System.out.print(_x);
                //System.out.print(",");
                //System.out.println(_y);
                
                setObjectPosition(_x,_y);
                
                VentanaPrincipal.txtfTiempo.setText(Double.toString(tiempo));
                VentanaPrincipal.txtfPosX.setText(Double.toString(_x));
                VentanaPrincipal.txtfPosY.setText(Double.toString(_y));
                VentanaPrincipal.txtfVel.setText(Double.toString(_velocidad));
                VentanaPrincipal.txtfAcel.setText(Double.toString(_aceleracion));
                
                VentanaPrincipal.datosReportes.put("velocidad-tiempo", velocidadtiempo);
                VentanaPrincipal.datosReportes.put("aceleracion-tiempo", aceleraciontiempo);
                VentanaPrincipal.datosReportes.put("x-y", xy);
                
               
                repaint();
            }
        }catch(Exception e){
            System.out.println("Ocurrió un error:"+e.getMessage());
        }
    }
    
    public void restart(){
        hilo = new Thread(this);
        hilo.start();
    }
    
    public void start(){
        hilo.start();
    }
    
    public void suspend(){
        hilo.suspend();
    }
    
    public void resume(){
        hilo.resume();
    }
    
    public void stop(){
        isRunning = false;
    }
    
    public void setObjectPosition( double x, double y ){
        this.xPos =(int) (x*escala);
        this.yPos = (int) (getHeight() - (y*escala+sizeObject.height));
        this.repaint();
    }
    
    public void setImageBackground( String path ){
        if( path != null ){
            this.background = new ImageIcon(path).getImage();
            repaint();
        }
    }
    
    public void setEscala(int escala){
        this.escala = escala;
    }
    
    public void setDelay(int delay){
        this.delay = delay;
    }
    
    public void setTiempoMax( double tmax ){
        this.tiempoMax = tmax;
    }
    
    public void setPolinomio(Polinomio p){
        this.polinomio = p;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("PlanoCartesiano"));
        setMaximumSize(new java.awt.Dimension(670, 240));
        setPreferredSize(new java.awt.Dimension(670, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
