/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormovimientocurvilineo;

/**
 *
 * @author Jibaru
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Simulador Movimiento Curvilíneo Plano");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planoCartesiano1 = new simuladormovimientocurvilineo.PlanoCartesiano();
        btnIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        comboEstilos = new javax.swing.JComboBox();
        btnPausar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        labelPosicionX = new javax.swing.JLabel();
        LabelVelocidad = new javax.swing.JLabel();
        LabelTiempo = new javax.swing.JLabel();
        txtfPosX = new javax.swing.JTextField();
        txtfVel = new javax.swing.JTextField();
        txtfTiempo = new javax.swing.JTextField();
        LabelPosiciónY = new javax.swing.JLabel();
        LabelAceleración = new javax.swing.JLabel();
        txtfPosY = new javax.swing.JTextField();
        txtfAcel = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        labelPosicion = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout planoCartesiano1Layout = new javax.swing.GroupLayout(planoCartesiano1);
        planoCartesiano1.setLayout(planoCartesiano1Layout);
        planoCartesiano1Layout.setHorizontalGroup(
            planoCartesiano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        planoCartesiano1Layout.setVerticalGroup(
            planoCartesiano1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );

        getContentPane().add(planoCartesiano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 76, -1, -1));

        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 180, -1));

        jLabel4.setText("(0,0)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 328, -1, -1));

        jLabel5.setFont(new java.awt.Font("Raleway SemiBold", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html><b>SIMULADOR MOVIMIENTO CURVILÍNEO PLANO</b></html>");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 22, 987, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 43, 120, -1));

        jLabel6.setText("Velocidad inicial");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 100, -1));

        jLabel7.setText("Tiempo inicial");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 90, -1));

        jLabel8.setText("Aceleración inicial");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 100, -1));

        jLabel9.setText("Ángulo de inclinación");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 110, -1));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 76, -1, -1));

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 107, -1, -1));

        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 138, -1, -1));

        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 169, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 180, -1));

        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 180, -1));

        btnConfiguracion.setText("Configuracion");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 180, -1));

        jLabel10.setText("Estilos");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, -1));

        comboEstilos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fondo 1", "Fondo 2", "Fondo 3" }));
        comboEstilos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstilosActionPerformed(evt);
            }
        });
        getContentPane().add(comboEstilos, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 340, 130, -1));

        btnPausar.setText("PAUSAR");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 180, -1));

        btnTerminar.setText("TERMINAR");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 180, -1));

        labelPosicionX.setText("Posicion X");
        getContentPane().add(labelPosicionX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 50, 20));

        LabelVelocidad.setText("Velocidad");
        getContentPane().add(LabelVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 20));

        LabelTiempo.setText("Tiempo");
        getContentPane().add(LabelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 20));

        txtfPosX.setText("jTextField5");
        txtfPosX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfPosXActionPerformed(evt);
            }
        });
        getContentPane().add(txtfPosX, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 60, 20));

        txtfVel.setText("jTextField6");
        getContentPane().add(txtfVel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, 20));

        txtfTiempo.setText("jTextField7");
        getContentPane().add(txtfTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, 20));

        LabelPosiciónY.setText("Posición Y");
        getContentPane().add(LabelPosiciónY, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, 20));

        LabelAceleración.setText("Aceleración");
        getContentPane().add(LabelAceleración, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, 20));

        txtfPosY.setText("jTextField8");
        txtfPosY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfPosYActionPerformed(evt);
            }
        });
        getContentPane().add(txtfPosY, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, 20));

        txtfAcel.setText("jTextField9");
        txtfAcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfAcelActionPerformed(evt);
            }
        });
        getContentPane().add(txtfAcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DATOS INICIALES");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 180, -1));

        labelPosicion.setText("Posicion");
        getContentPane().add(labelPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel18.setText("INFORMACIÓN DE LA SIMULACIÓN:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        setBounds(0, 0, 1040, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        planoCartesiano1.restart();
        btnIniciar.setEnabled(false);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        VentanaReportes ventanaReportes = new VentanaReportes();
        ventanaReportes.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        VentanaConfiguracion ventanaConfiguracion = new VentanaConfiguracion();
        ventanaConfiguracion.setVisible(true);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void txtfPosYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfPosYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPosYActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboEstilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstilosActionPerformed
        String path = null;
        int indice = comboEstilos.getSelectedIndex();
        switch(indice){
            case 0:
               path = "src/assets/img/fondo1.jpg";
               break;
            case 1:
               path = "src/assets/img/fondo2.jpg";
               break;
            case 2:
               path = "src/assets/img/fondo3.png";
               break;
        }
        this.planoCartesiano1.setImageBackground(path);
    }//GEN-LAST:event_comboEstilosActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        if(isSuspended){
            this.planoCartesiano1.resume();
            btnPausar.setText("PAUSAR");
            this.isSuspended = false;
        } else {
            this.planoCartesiano1.suspend();
            btnPausar.setText("CONTINUAR");
            this.isSuspended = true;
        }
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        this.planoCartesiano1.stop();
        btnIniciar.setEnabled(true);
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void txtfPosXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfPosXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPosXActionPerformed

    private void txtfAcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfAcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfAcelActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });

    }
    private boolean isSuspended = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAceleración;
    private javax.swing.JLabel LabelPosiciónY;
    private javax.swing.JLabel LabelTiempo;
    private javax.swing.JLabel LabelVelocidad;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JComboBox comboEstilos;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JLabel labelPosicion;
    public static javax.swing.JLabel labelPosicionX;
    private simuladormovimientocurvilineo.PlanoCartesiano planoCartesiano1;
    public static javax.swing.JTextField txtfAcel;
    public static javax.swing.JTextField txtfPosX;
    public static javax.swing.JTextField txtfPosY;
    public static javax.swing.JTextField txtfTiempo;
    public static javax.swing.JTextField txtfVel;
    // End of variables declaration//GEN-END:variables
}
