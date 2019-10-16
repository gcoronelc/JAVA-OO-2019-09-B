
package proyecto_impuesto_renta.Ventana_reporte;

public class Reporte_impuesto extends javax.swing.JFrame {

    public Reporte_impuesto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_importe = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Exoneracion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_remuneracion_anual = new javax.swing.JTextField();
        txt_deduccion = new javax.swing.JTextField();
        txt_total_cuarta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_total_quinta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_total_4_y_5 = new javax.swing.JTextField();
        txt_deduccion_7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setBackground(new java.awt.Color(102, 204, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("IMPUESTO DE LA RENTA de 4TA y 5TA CATEGORIA");

        jLabel2.setText("Importe:");

        txt_importe.setBackground(new java.awt.Color(204, 204, 204));
        txt_importe.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_importe.setEnabled(false);
        txt_importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_importeActionPerformed(evt);
            }
        });

        total.setBackground(new java.awt.Color(204, 204, 204));
        total.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        total.setEnabled(false);

        jLabel5.setText("Exoneración:");

        Exoneracion.setBackground(new java.awt.Color(204, 204, 204));
        Exoneracion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Exoneracion.setEnabled(false);

        jLabel6.setText("Impuesto a pagar:");

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Remureación Anual :");

        jLabel8.setText("Total renta 5ta categoria :");

        jLabel9.setText("Deducción del 20% : ");

        txt_remuneracion_anual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_remuneracion_anualActionPerformed(evt);
            }
        });

        txt_deduccion.setBackground(new java.awt.Color(204, 204, 204));
        txt_deduccion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_deduccion.setEnabled(false);
        txt_deduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deduccionActionPerformed(evt);
            }
        });

        txt_total_cuarta.setBackground(new java.awt.Color(204, 204, 204));
        txt_total_cuarta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_total_cuarta.setEnabled(false);
        txt_total_cuarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_cuartaActionPerformed(evt);
            }
        });

        jLabel10.setText("Total renta 4ta categoria :");

        txt_total_quinta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_total_quinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_quintaActionPerformed(evt);
            }
        });

        jLabel11.setText("Deducción de 7 UIT  (UIT = S/ 4,150) : ");

        jLabel12.setText("Total renta 4ta y 5ta categoria:");

        txt_total_4_y_5.setBackground(new java.awt.Color(204, 204, 204));
        txt_total_4_y_5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_total_4_y_5.setEnabled(false);
        txt_total_4_y_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_4_y_5ActionPerformed(evt);
            }
        });

        txt_deduccion_7.setBackground(new java.awt.Color(204, 204, 204));
        txt_deduccion_7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_deduccion_7.setEnabled(false);
        txt_deduccion_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deduccion_7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_remuneracion_anual, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_deduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_total_cuarta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_total_quinta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(total)
                                .addComponent(Exoneracion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_deduccion_7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_total_4_y_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addComponent(txt_importe, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_remuneracion_anual, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_deduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total_cuarta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total_quinta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txt_total_4_y_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_deduccion_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_importe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exoneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
                double importe; 
                double renumeracionAnual;
                double quinta;
            
                 if(txt_importe.getText().length() != 0 ){
                    importe = Double.parseDouble(txt_importe.getText());
                }else{
                    importe = 0.0;
                }
                
                if(txt_remuneracion_anual.getText().length() != 0){
                    renumeracionAnual = Double.parseDouble(txt_remuneracion_anual.getText());
                }else{
                    renumeracionAnual = 0.0;
                }
                
                if(txt_total_quinta.getText().length() != 0){
                    quinta = Double.parseDouble(txt_total_quinta.getText());
                }else{
                    quinta = 0.0;
                }                
                
                          
                impuestorenta ip= new impuestorenta(importe, renumeracionAnual, quinta);
                ip.getCalculoCuarta();
                ip.getCalculoCuartaTotal();
                ip.getImporteExoneracion();
                txt_deduccion.setText(Double.toString(ip.getCalculoCuarta()));
                txt_total_cuarta.setText(Double.toString(ip.getCalculoCuartaTotal()));
                txt_total_4_y_5.setText(Double.toString(ip.getCalculoQuintaCuartaTotal()));
                txt_deduccion_7.setText(Double.toString(ip.getCalculoDeduccion()));
                txt_importe.setText(Double.toString(ip.getCalculoImporte()));
                Exoneracion.setText(ip.getExoneracion());
                total.setText(Double.toString(ip.getCalculoImportePagar()));	
    }//GEN-LAST:event_jButton1ActionPerformed
    private void txt_importeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_importeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_importeActionPerformed
    private void txt_remuneracion_anualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_remuneracion_anualActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_txt_remuneracion_anualActionPerformed

    private void txt_deduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_deduccionActionPerformed

    private void txt_total_cuartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_cuartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_cuartaActionPerformed

    private void txt_total_quintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_quintaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_quintaActionPerformed

    private void txt_total_4_y_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_4_y_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_4_y_5ActionPerformed

    private void txt_deduccion_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deduccion_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_deduccion_7ActionPerformed

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
            java.util.logging.Logger.getLogger(Reporte_impuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_impuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_impuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_impuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_impuesto().setVisible(true);
            }
        });
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Exoneracion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txt_deduccion;
    private javax.swing.JTextField txt_deduccion_7;
    private javax.swing.JTextField txt_importe;
    private javax.swing.JTextField txt_remuneracion_anual;
    private javax.swing.JTextField txt_total_4_y_5;
    private javax.swing.JTextField txt_total_cuarta;
    private javax.swing.JTextField txt_total_quinta;
    // End of variables declaration//GEN-END:variables
}
