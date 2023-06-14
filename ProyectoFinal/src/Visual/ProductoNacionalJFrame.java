/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Clases.Almacen;
import Clases.Producto;
import Clases.ProductoNacional;
import Clases.Supermercado;

/**
 *
 * @author Camila
 */
public class ProductoNacionalJFrame extends javax.swing.JFrame {

    public ProductoNacionalJFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExistenciaFisicabuttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        CodigojTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SijRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        nombrejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        preciojSpinner = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        CancelarjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        empresajTextField = new javax.swing.JTextField();

        jLabel1.setText("Codigo: ");

        CodigojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigojTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Existencia Fisica:");

        ExistenciaFisicabuttonGroup.add(SijRadioButton);
        SijRadioButton.setText("Si/No");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Precio:");

        preciojSpinner.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 0.5d));

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CancelarjButton.setText("Cancelar");
        CancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarjButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Empresa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CodigojTextField)
                    .addComponent(nombrejTextField)
                    .addComponent(preciojSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(empresajTextField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CancelarjButton)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(SijRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CodigojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preciojSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SijRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(empresajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(CancelarjButton))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarjButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelarjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
        
        Principal.supermercado.almacenes.get( Principal.cant - 1 ).productos.add( new  ProductoNacional( empresajTextField.getText()  ,
                    CodigojTextField.getText() ,  nombrejTextField.getText() , Double.parseDouble(preciojSpinner.getValue().toString()) , SijRadioButton.isEnabled() ) );
       
        System.out.println("Producto creado");}
                                        
        catch (java.lang.IndexOutOfBoundsException e){
                
                 System.out.println("Error debe crear un Almacen primero");  
                }
     this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CodigojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigojTextFieldActionPerformed




        // TODO add your handling code here:
    }//GEN-LAST:event_CodigojTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarjButton;
    private javax.swing.JTextField CodigojTextField;
    private javax.swing.ButtonGroup ExistenciaFisicabuttonGroup;
    private javax.swing.JRadioButton SijRadioButton;
    private javax.swing.JTextField empresajTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombrejTextField;
    private javax.swing.JSpinner preciojSpinner;
    // End of variables declaration//GEN-END:variables
}
