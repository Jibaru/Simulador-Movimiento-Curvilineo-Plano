/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormovimientocurvilineo;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author USUARIO1
 */
public class VentanaReportes extends javax.swing.JFrame {

    /**
     * Creates new form VentanaReportes
     */
    private void dibujarGrafica(int[] ValX, int[] ValY ){
      XYSeries valoresGrafica = new XYSeries("");
      
      for(int i=0 ; i<ValX.length ; i++){
          valoresGrafica.add(ValX[i],ValY[i]);
      }
      
      XYSeriesCollection coleccionDeDatos = 
              new XYSeriesCollection(valoresGrafica);
      
      JFreeChart chartGrafica = ChartFactory.createXYLineChart(
      "Titulo","Etiqueta X","Etiqueta Y",
      coleccionDeDatos
      );
      
      ChartPanel panel = new ChartPanel(chartGrafica);
      
      panel.setSize(600,400);
      panel.setVisible(true);
      panelGraficas.add(panel);
   
    }
    
    
    public VentanaReportes() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        int[]valoresX = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[]valoresY = {2,4,9,16,25,36,49,64,81,100,121,144};
        dibujarGrafica(valoresX,valoresY);              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtReportesVelocidad = new javax.swing.JTextField();
        txtReportesAceleracion = new javax.swing.JTextField();
        txtReportesDistancia = new javax.swing.JTextField();
        txtReportesAltura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        panelGraficas = new javax.swing.JPanel();

        jLabel5.setText("jLabel5");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 601));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Reporte de datos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 290, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Velocidad máxima");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("alcanzada");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Aceleración máxima");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("GRÁFICAS OBTENIDAS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 270, 21));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("alcanzada");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Distancia máxima");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Altura máxima");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txtReportesVelocidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtReportesVelocidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReportesVelocidad.setText("\"Valor\"");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtReportesVelocidad, org.jdesktop.beansbinding.ELProperty.create("false"), txtReportesVelocidad, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        getContentPane().add(txtReportesVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 94, -1));

        txtReportesAceleracion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtReportesAceleracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReportesAceleracion.setText("\"Valor\"");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtReportesAceleracion, org.jdesktop.beansbinding.ELProperty.create("false"), txtReportesAceleracion, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        getContentPane().add(txtReportesAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 94, -1));

        txtReportesDistancia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtReportesDistancia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReportesDistancia.setText("\"Valor\"");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtReportesDistancia, org.jdesktop.beansbinding.ELProperty.create("false"), txtReportesDistancia, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        txtReportesDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportesDistanciaActionPerformed(evt);
            }
        });
        getContentPane().add(txtReportesDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 94, -1));

        txtReportesAltura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtReportesAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReportesAltura.setText("\"Valor\"");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtReportesAltura, org.jdesktop.beansbinding.ELProperty.create("false"), txtReportesAltura, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        getContentPane().add(txtReportesAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 94, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("RELACIÓN VELOCIDAD VS TIEMPO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 50, 190, -1));

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 93, -1));

        panelGraficas.setBackground(new java.awt.Color(51, 255, 51));
        panelGraficas.setInheritsPopupMenu(true);
        panelGraficas.setMinimumSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout panelGraficasLayout = new javax.swing.GroupLayout(panelGraficas);
        panelGraficas.setLayout(panelGraficasLayout);
        panelGraficasLayout.setHorizontalGroup(
            panelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panelGraficasLayout.setVerticalGroup(
            panelGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(panelGraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 600, 400));

        bindingGroup.bind();

        setBounds(0, 0, 1040, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void txtReportesDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportesDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportesDistanciaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelGraficas;
    private javax.swing.JTextField txtReportesAceleracion;
    private javax.swing.JTextField txtReportesAltura;
    private javax.swing.JTextField txtReportesDistancia;
    private javax.swing.JTextField txtReportesVelocidad;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
