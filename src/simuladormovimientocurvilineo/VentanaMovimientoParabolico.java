/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormovimientocurvilineo;

import ecuaciones.MovilParabolico;

/**
 *
 * @author Jibaru
 */
public class VentanaMovimientoParabolico extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMovimientoParabolico
     */
    public VentanaMovimientoParabolico() {
        initComponents();
        movilParabolico = new MovilParabolico();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtVelInicial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAngulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVelX = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVelY = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTiempoVuelo = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JToggleButton();
        btnAceptar = new javax.swing.JToggleButton();
        labelError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimiento Parabólico");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtVelInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, -1));

        jLabel1.setText("Velocidad Inicial");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 20));

        jLabel2.setText("Ángulo de inclinación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 20));
        getContentPane().add(txtAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inserte los siguientes datos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 240, 20));

        jLabel4.setText("Velocidad en X");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 20));

        txtVelX.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtVelX.setEnabled(false);
        getContentPane().add(txtVelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 120, -1));

        jLabel5.setText("Velocidad en Y");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 20));

        txtVelY.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtVelY.setEnabled(false);
        getContentPane().add(txtVelY, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 120, -1));

        jLabel6.setText("Tiempo de vuelo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 20));

        txtTiempoVuelo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTiempoVuelo.setEnabled(false);
        getContentPane().add(txtTiempoVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, -1));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, -1));

        labelError.setForeground(new java.awt.Color(255, 51, 51));
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 240, 20));

        setSize(new java.awt.Dimension(316, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        double velInicial;
        double angulo;
        try{
            labelError.setText("");
            velInicial = Double.parseDouble(this.txtVelInicial.getText());
            angulo = Double.parseDouble(this.txtAngulo.getText());
        }catch(NumberFormatException e){
            System.out.println("Ocurrió un error, texto no válido");
            labelError.setText("Solo admite números");
            return;
        }
        
        double velX = movilParabolico.velX(angulo, velInicial);
        double velY = movilParabolico.velY(angulo, velInicial);
        
        movilParabolico.setVelIni(velInicial);
        movilParabolico.setAngulo(angulo);
        
        double tiempoVuelo = movilParabolico.tiempoVuelo(velInicial, angulo);
        this.txtVelX.setText(Float.toString((float)velX));
        this.txtVelY.setText(Float.toString((float)velY));
        this.txtTiempoVuelo.setText(Float.toString((float)tiempoVuelo));
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        VentanaPrincipal.txtEcuacionPosicion.setText(movilParabolico.trayectoria());
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMovimientoParabolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMovimientoParabolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMovimientoParabolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMovimientoParabolico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMovimientoParabolico().setVisible(true);
            }
        });
    }
    
    public static MovilParabolico movilParabolico;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JToggleButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelError;
    private javax.swing.JTextField txtAngulo;
    private javax.swing.JTextField txtTiempoVuelo;
    private javax.swing.JTextField txtVelInicial;
    private javax.swing.JTextField txtVelX;
    private javax.swing.JTextField txtVelY;
    // End of variables declaration//GEN-END:variables
}
