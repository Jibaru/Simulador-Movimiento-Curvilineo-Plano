/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormovimientocurvilineo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author Jibaru
 */
public class PlanoCartesiano extends javax.swing.JPanel implements Runnable{
    
    int x=getWidth()/2;
    private int xPos = 0;
    private int yPos = 0;
    Dimension sizeObject;
    Thread hilo;
    /**
     * Creates new form PlanoCartesiano
     */
    public PlanoCartesiano() {
        initComponents();
        hilo = new Thread(this);
        sizeObject = new Dimension(30,30);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.red);
        g.fillOval(xPos, yPos,sizeObject.width,sizeObject.height);
    }
    
    @Override
    public void run() {
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
            for( int i = 0; i <= 500; i ++ ){
                Thread.sleep(100);
                setObjectPosition(2*i,0);
                VentanaPrincipal.labelPosicion.setText(Integer.toString(this.xPos));
                repaint();
            }
        }catch(Exception e){
            System.out.println("Ocurrió un error:"+e.getMessage());
        }
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
    
    public void setObjectPosition( int x, int y ){
        this.xPos = x;
        this.yPos = getHeight() - (y+sizeObject.height);
        this.repaint();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
