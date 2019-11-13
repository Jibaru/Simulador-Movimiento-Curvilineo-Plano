/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormovimientocurvilineo;

import java.util.HashMap;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author USUARIO1
 */
public class VentanaReportes extends javax.swing.JFrame {
 
    
    private final ChartPanel chartPanel;
    private final XYSeries valoresGrafica = new XYSeries("");
    /**
     * Creates new form VentanaReportes
     */
    
    private ChartPanel crearChart(HashMap<Double, Double> map){

      crearSeries(map);
      XYSeriesCollection col = crearColeccion(valoresGrafica);
      JFreeChart chartGrafica = ChartFactory.createXYLineChart(
        "Titulo","Etiqueta X","Etiqueta Y",col
      );
      
      ChartPanel panel = new ChartPanel(chartGrafica);
      
      return panel;
    }
    
    private XYSeriesCollection crearColeccion(XYSeries series){
        XYSeriesCollection coleccionDeDatos = 
              new XYSeriesCollection(series);
        return coleccionDeDatos;
    }
    
    public void crearSeries(HashMap<Double, Double> map){
        map.entrySet().forEach((item) -> {
            valoresGrafica.addOrUpdate(item.getKey(),item.getValue());
        });
    }
    
    public VentanaReportes(){
        initComponents();
        
        HashMap<Double, Double> datos = new HashMap<>();
        chartPanel = crearChart(datos);
        chartPanel.setSize(500,300);
        chartPanel.setVisible(true);
        chartPanel.setLocation(280,60);
        add(chartPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtReportesVelocidad = new javax.swing.JTextField();
        txtReportesAceleracion = new javax.swing.JTextField();
        txtReportesDistancia = new javax.swing.JTextField();
        txtReportesAltura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de datos");
        setMaximumSize(new java.awt.Dimension(1024, 601));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Datos máximos (MKS):");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Velocidad máxima");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Aceleración máxima");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("REPORTE GENERAL");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Distancia máxima");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Altura máxima");

        txtReportesVelocidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReportesVelocidad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtReportesVelocidad.setEnabled(false);
        txtReportesVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportesVelocidadActionPerformed(evt);
            }
        });

        txtReportesAceleracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReportesAceleracion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtReportesAceleracion.setEnabled(false);

        txtReportesDistancia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReportesDistancia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtReportesDistancia.setEnabled(false);
        txtReportesDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportesDistanciaActionPerformed(evt);
            }
        });

        txtReportesAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReportesAltura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtReportesAltura.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("RELACIÓN DE DATOS");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Velocidad Máx VS Aceleración Máx", "Velocidad Máx VS Distancia Máx", "Velocidad Máx VS Altura Máx", "Aceleración Máx VS Distancia Máx", "Aceleración Máx VS Altura Máx", "Distancia Máx VS Altura Máx" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9))
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(22, 22, 22)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtReportesVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtReportesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtReportesDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtReportesAceleracion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtReportesVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReportesAceleracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtReportesDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtReportesAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(816, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtReportesDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportesDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportesDistanciaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int ind = jComboBox1.getSelectedIndex();
        HashMap<Double, Double> datos = new HashMap<Double,Double>();      
        valoresGrafica.clear();
        switch(ind){
            case 0://VELOCIDAD MAX VS ACELERACION MAX
               datos.put(0.0,0.0);
               datos.put(1.0,1.0);
               datos.put(2.0,4.0);
               datos.put(3.0,1.0);
               datos.put(4.0,6.0);                                   
               break;
            case 1://VELOCIDAD MAX VS DISTANCIA MAX
               datos.put(5.0,5.0);
               datos.put(6.0,2.0);
               datos.put(7.0,1.0);
               datos.put(8.0,8.0);
               datos.put(9.0,3.0);  
               break;
            case 2://VELOCIDAD MAX VS ALTURA MAX
               datos.put(10.0,1.0);
               datos.put(11.0,24.0);
               datos.put(12.0,43.0);
               datos.put(13.0,28.0);
               datos.put(14.0,15.0); 
               break;
            case 3://ACELERACION MAX VS DISTANCIA MAX
               datos.put(0.0,9.0);
               datos.put(1.0,4.0);
               datos.put(2.0,7.0);
               datos.put(3.0,3.0);
               datos.put(4.0,8.0);                                   
               break;
            case 4://ACELERACION MAX VS ALTURA MAX
               datos.put(5.0,4.0);
               datos.put(6.0,8.0);
               datos.put(7.0,1.0);
               datos.put(8.0,0.0);
               datos.put(9.0,9.0);  
               break;
            case 5://DISTANCIA MAX VS ALTURA MAX
               datos.put(10.0,3.0);
               datos.put(11.0,8.0);
               datos.put(12.0,4.0);
               datos.put(13.0,2.0);
               datos.put(14.0,9.0); 
               break;
        }
         crearSeries(datos);
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtReportesVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportesVelocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportesVelocidadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaReportes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtReportesAceleracion;
    private javax.swing.JTextField txtReportesAltura;
    private javax.swing.JTextField txtReportesDistancia;
    private javax.swing.JTextField txtReportesVelocidad;
    // End of variables declaration//GEN-END:variables
}
