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
public class VentanaEjemplos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEjemplos
     */
    public VentanaEjemplos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupEcuaciones = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        radio5 = new javax.swing.JRadioButton();
        radio6 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Ejemplos de ecuaciones");
        getContentPane().add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 280, 24));

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 70, -1));

        groupEcuaciones.add(radio1);
        radio1.setText("r(t) =  (2*t^3)i + (3*t^1)j");
        radio1.setActionCommand("1");
        getContentPane().add(radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        groupEcuaciones.add(radio2);
        radio2.setText("r(t) = (1*t^1)i + (0.5*t^2)j");
        radio2.setActionCommand("2");
        getContentPane().add(radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        groupEcuaciones.add(radio3);
        radio3.setText("r(t) = (1*t^6)i + (-4*t^5+4*t^0)j");
        radio3.setActionCommand("3");
        getContentPane().add(radio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        groupEcuaciones.add(radio4);
        radio4.setText("r(t) = (3*t^2)i + (3*t^2)j");
        radio4.setActionCommand("4");
        getContentPane().add(radio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        groupEcuaciones.add(radio5);
        radio5.setText("r(t) = (8.49*t^1)i + (8.49*t^1+-4.9*t^2)j");
        radio5.setActionCommand("5");
        getContentPane().add(radio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        groupEcuaciones.add(radio6);
        radio6.setText("r(t) = (-20*t^2+20*t^1)i + (5*t^1+-5*t^4)j");
        radio6.setActionCommand("6");
        radio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio6ActionPerformed(evt);
            }
        });
        getContentPane().add(radio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        setSize(new java.awt.Dimension(316, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        int seleccion = Integer.parseInt(groupEcuaciones.getSelection().getActionCommand());
        String i = "";
        String j = "";
        System.out.println(seleccion);
        if(seleccion == 1){
            i = "2*t^3";
            j = "3*t^1";
        }
        if(seleccion == 2){
            i = "1*t^1";
            j = "0.5*t^2";
        }
        if(seleccion == 3){
            i = "1*t^6";
            j = "-4*t^5+4*t^0";
        }
        if(seleccion == 4){
            i = "3*t^2";
            j = "3*t^2";
        }
        if(seleccion == 5){
            i = "8.49*t^1";
            j = "8.49*t^1+-4.9*t^2";
        }
        if(seleccion == 6){
            i = "-20*t^2+20*t^1";
            j = "5*t^1+-5*t^4";
        }
        VentanaPrincipal.txtEcuacionPosicionX.setText(i);
        VentanaPrincipal.txtEcuacionPosicionY.setText(j);
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void radio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio6ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEjemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEjemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEjemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEjemplos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjemplos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup groupEcuaciones;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radio5;
    private javax.swing.JRadioButton radio6;
    // End of variables declaration//GEN-END:variables
}
