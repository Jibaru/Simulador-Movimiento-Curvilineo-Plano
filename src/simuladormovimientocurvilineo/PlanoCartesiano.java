/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormovimientocurvilineo;

import ecuaciones.FuncionVectorial;
import ecuaciones.Vector;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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
    private double tiempo;
    private FuncionVectorial vectorPosicion;
    FuncionVectorial vel;
    FuncionVectorial acel;
    public static boolean mostrarVectorPosicion = true;
    public static boolean mostrarVectorVelocidad = true;
    public static boolean mostrarVectorAceleracion = true;
    public static boolean detenerSiEscapa = true;
    /**
     * Creates new form PlanoCartesiano
     */
    public PlanoCartesiano() {
        initComponents();
        sizeObject = new Dimension(10,10);
        background = new ImageIcon("src/assets/img/cuadricula.jpg").getImage();
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
        
        if(mostrarVectorPosicion && isRunning){
            Color colActual = g.getColor();
            g.setColor(Color.gray);
            drawArrow(0, 0+getHeight(), xPos, yPos, g);
            g.setColor(colActual);
        }
        
        if(mostrarVectorVelocidad && isRunning){
            drawArrow(xPos, yPos, 
                xPos+getPositionXfrom(vel.getValorI(tiempo)), 
                yPos+getPositionYfrom(vel.getValorJ(tiempo)), g);
        }
        
        if(mostrarVectorAceleracion && isRunning){
            Color colActual = g.getColor();
            g.setColor(Color.blue);
            drawArrow(xPos, yPos, 
                xPos+getPositionXfrom(acel.getValorI(tiempo)), 
                yPos+getPositionYfrom(acel.getValorJ(tiempo)), g);
            g.setColor(colActual);
        }
        
        
    }
    
    public void drawArrow(int x0,int y0,int x1,int y1, Graphics g){
        double alfa=Math.atan2(y1-y0,x1-x0);
        g.drawLine(x0,y0,x1,y1);
        int k=5;
        int xa=(int)(x1-k*Math.cos(alfa+1));
        int ya=(int)(y1-k*Math.sin(alfa+1));
        // Se dibuja un extremo de la dirección de la flecha.
        g.drawLine(xa,ya,x1,y1);
        xa=(int)(x1-k*Math.cos(alfa-1));
        ya=(int)(y1-k*Math.sin(alfa-1));
        // Se dibuja el otro extremo de la dirección de la flecha.
        g.drawLine(xa,ya,x1,y1);
    }
    
    @Override
    public void run() {
        isRunning = true;
        vel = vectorPosicion.getDerivada();
        acel = vel.getDerivada();
        
        List<List<Double>> velocidadtiempo = new ArrayList<>();
        List<List<Double>> aceleraciontiempo = new ArrayList<>();
        List<List<Double>> xy = new ArrayList<>();
        
        List<Double> velocidades = new ArrayList<>();
        List<Double> aceleraciones = new ArrayList<>();
        List<Double> posicionesX = new ArrayList<>();
        List<Double> posicionesY = new ArrayList<>();
        
        
        VentanaPrincipal.datosReportes.clear();
        VentanaPrincipal.datosIndividuales.clear();
        
        try{
            for( tiempo = 0; tiempo <= tiempoMax && isRunning; tiempo +=0.01 ){
                double porcentaje = tiempo*100/tiempoMax;
                
                VentanaPrincipal.progressBarSimulacion.setValue((int)porcentaje);
                Thread.sleep(delay);

                double _x = vectorPosicion.getValorI(tiempo);
                double _y = vectorPosicion.getValorJ(tiempo);
                double _velocidad = vel.getModulo(tiempo);
                double _aceleracion = acel.getModulo(tiempo);
                double _velRadial = vel.getValorI(tiempo);
                double _velTransv = vel.getValorJ(tiempo);
                double _radCurv = getRadioCurvatura(vel.getVector(tiempo), acel.getVector(tiempo));
                double _acelNormal = Math.pow(vel.getVector(tiempo).getModulo(),2)/_radCurv;
                double _acelTang = Math.sqrt(Math.pow(acel.getVector(tiempo).getModulo(), 2) - Math.pow(_acelNormal, 2));
                double _acelRadial = acel.getValorI(tiempo);
                double _acelTransv = acel.getValorJ(tiempo);
                
                
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
                
                velocidades.add(_velocidad);
                aceleraciones.add(_aceleracion);
                posicionesX.add(_x);
                posicionesY.add(_y);
                
                setObjectPosition(_x,_y);
                
                VentanaPrincipal.txtfTiempo.setText(Float.toString((float)tiempo));
                VentanaPrincipal.txtfPosX.setText(Float.toString((float)_x));
                VentanaPrincipal.txtfPosY.setText(Float.toString((float)_y));
                VentanaPrincipal.txtfVel.setText(Float.toString((float)_velocidad));
                VentanaPrincipal.txtfAcel.setText(Float.toString((float)_aceleracion));
                VentanaPrincipal.txtfAcelNormal.setText(Float.toString((float) _acelNormal));
                VentanaPrincipal.txtfAcelTang.setText(Float.toString((float) _acelTang));
                VentanaPrincipal.txtfAcelRad.setText(Float.toString((float) _acelRadial));
                VentanaPrincipal.txtfAcelTransv.setText(Float.toString((float)_acelTransv));
                VentanaPrincipal.txtfVelX.setText(Float.toString((float)_velRadial));
                VentanaPrincipal.txtfVelY.setText(Float.toString((float)_velTransv));
                VentanaPrincipal.txtfRadCurv.setText(Float.toString((float)_radCurv));
                
                VentanaPrincipal.datosReportes.put("velocidad-tiempo", velocidadtiempo);
                VentanaPrincipal.datosReportes.put("aceleracion-tiempo", aceleraciontiempo);
                VentanaPrincipal.datosReportes.put("x-y", xy);
                
                VentanaPrincipal.datosIndividuales.put("velocidades", velocidades);
                VentanaPrincipal.datosIndividuales.put("aceleraciones", aceleraciones);
                VentanaPrincipal.datosIndividuales.put("posicionesx", posicionesX);
                VentanaPrincipal.datosIndividuales.put("posicionesy", posicionesY);
                
               
                repaint();
            }
        }catch(InterruptedException e){
            System.out.println("Ocurrió un error:"+e.getMessage());
        }
    }
    
    public void setDatosEnTiempo(double t){
        
        vel = vectorPosicion.getDerivada();
        acel = vel.getDerivada();
        
        double _x = vectorPosicion.getValorI(t);
        double _y = vectorPosicion.getValorJ(t);
        double _velocidad = vel.getModulo(t);
        double _aceleracion = acel.getModulo(t);
        double _velRadial = vel.getValorI(t);
        double _velTransv = vel.getValorJ(t);
        double _radCurv = getRadioCurvatura(vel.getVector(t), acel.getVector(t));
        double _acelNormal = Math.pow(vel.getVector(t).getModulo(),2)/_radCurv;
        double _acelTang = Math.sqrt(Math.pow(acel.getVector(t).getModulo(), 2) - Math.pow(_acelNormal, 2));
        double _acelRadial = acel.getValorI(t);
        double _acelTransv = acel.getValorJ(t);
        
        VentanaPrincipal.txtfTiempo.setText(Float.toString((float)t));
        VentanaPrincipal.txtfPosX.setText(Float.toString((float)_x));
        VentanaPrincipal.txtfPosY.setText(Float.toString((float)_y));
        VentanaPrincipal.txtfVel.setText(Float.toString((float)vel.getModulo(t)));
        VentanaPrincipal.txtfAcel.setText(Float.toString((float)acel.getModulo(t)));
        VentanaPrincipal.txtfAcelNormal.setText(Float.toString((float) _acelNormal));
        VentanaPrincipal.txtfAcelTang.setText(Float.toString((float) _acelTang));
        VentanaPrincipal.txtfAcelRad.setText(Float.toString((float) _acelRadial));
        VentanaPrincipal.txtfAcelTransv.setText(Float.toString((float)_acelTransv));
        VentanaPrincipal.txtfVelX.setText(Float.toString((float)_velRadial));
        VentanaPrincipal.txtfVelY.setText(Float.toString((float)_velTransv));
        VentanaPrincipal.txtfRadCurv.setText(Float.toString((float)_radCurv));
        
        setObjectPosition(_x, _y);
        isRunning = true;
        tiempo = t;
        repaint();
    }
    
    public double getRadioCurvatura(Vector vel, Vector acel){
        
        // Estamos usando la fórmula: 
        // 1/radio = |(vxa)/v^3|
        // Como nuestro simulador es en 2D, el valor de
        // vxa siempre será un unico valor Z, al cual
        // corresponderá su módulo
        
        double sup = Math.abs(vel.crossBy(acel));
        double inf = Math.pow(vel.getModulo(), 3);
        
        return inf/sup;
        
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
        
        if(detenerSiEscapa){
            if(this.xPos > (int) (getWidth()) || 
               this.yPos > (int) (getHeight()) || this.yPos < 0){
                isRunning = false;
            }
        }
        
        this.repaint();
    }
    
    public int getPositionXfrom( double x ){
        return (int) x*escala;
    }
    
    public int getPositionYfrom( double y ){
        return (int)(getHeight() - (y*escala));
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
    
    public void setVectorPosicion(FuncionVectorial r){
        this.vectorPosicion = r;
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
