/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Clases.Almacen;
import Clases.Producto;
import Clases.ProductoExtranjero;
import Clases.Supermercado;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila
 */
public class Principal extends javax.swing.JFrame {

    public ArrayList<Producto> vendidos = new ArrayList();
    public static Supermercado supermercado;
    public static ProductoNacionalJFrame productonacional = new ProductoNacionalJFrame();
    public static ProductoExtranjeroJFrame productoextranjero = new ProductoExtranjeroJFrame();
    public static int cant=0;
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        supermercado=new Supermercado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productosjList = new javax.swing.JList<>();
        AnhadirNacionaljButton = new javax.swing.JButton();
        AnhadirExtranjerojButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Supermercados");

        productosjList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Aquí se muestran los equipos que añada..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(productosjList);

        AnhadirNacionaljButton.setText("Añadir Producto Nacional");
        AnhadirNacionaljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnhadirNacionaljButtonActionPerformed(evt);
            }
        });

        AnhadirExtranjerojButton.setText("Añadir Producto Extranjero");
        AnhadirExtranjerojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnhadirExtranjerojButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear Almacén nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jButton3.setText("Vender Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Operaciones");

        jMenuItem1.setText("Mostrar Productos Más Vendidos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Obtener Productos Menos Vendidos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Mostrar Productos Por Encima De un precio dado por consola");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Exportar en un Fichero Productos Extranjeros Según Pais y Su Precio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AnhadirNacionaljButton, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(AnhadirExtranjerojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)))))
                                .addGap(29, 29, 29)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnhadirExtranjerojButton)
                    .addComponent(AnhadirNacionaljButton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Gestión Supermercado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnhadirNacionaljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnhadirNacionaljButtonActionPerformed

    productonacional.setVisible(true);

    }//GEN-LAST:event_AnhadirNacionaljButtonActionPerformed

    private void AnhadirExtranjerojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnhadirExtranjerojButtonActionPerformed

    productoextranjero.setVisible(true);

    }//GEN-LAST:event_AnhadirExtranjerojButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.ActualizarLista();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
String t=" ";
int pos=0;
for (int i=0;i<this.vendidos.size();i++){
    for (int j = 0; j< this.vendidos.size(); j++){
        if (i!= j){
            if (this.vendidos.get(i).getNombre().equalsIgnoreCase( this.vendidos.get(j).getNombre()  ) ){
               t+= ( "\n" + this.vendidos.get(j).getNombre());
                pos = i;
            }
        }
    }
}
new salida("El producto o los productos mas vendidos son \n" + t );

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Almacen e= new Almacen();
        
        Principal.supermercado.almacenes.add(e);
        cant++;
        
        jLabel1.setText( "  La cadena tiene actualmente " + cant  + " almacenes " );
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
          String s=" ";
          
         for (int i=0; i<this.supermercado.almacenes.size() ;i++) {
            if (!this.supermercado.almacenes.get(i).productos.isEmpty() ){
                for ( int j=0;j<this.supermercado.almacenes.get(i).productos.size();j++ ){
                    if ( Principal.supermercado.almacenes.get(i).productos.get(j) instanceof ProductoExtranjero ) {
                s+=( "\n----------------\nProducto " + ((ProductoExtranjero) Principal.supermercado.almacenes.get(i).productos.get(j)).getNombre() + 
                        "\nPais y precio " + ((ProductoExtranjero) Principal.supermercado.almacenes.get(i).productos.get(j)).getPaisDeProcedencia() + "  "  + ((ProductoExtranjero) Principal.supermercado.almacenes.get(i).productos.get(j)).getPrecioUSD() );
                    }
                }}}
        
       
           BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("Informe.txt"));
            bufferedWriter.write(s);
            System.out.print( "El archivo Informe.txt ha sido creado sin problemas. " );
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            if (bufferedWriter != null)
                try {
                    bufferedWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try { 
       int a = productosjList.getSelectionModel().getLeadSelectionIndex();
                this.vendidos.add(this.supermercado.almacenes.get(this.cant - 1).productos.remove( a ));
        this.ActualizarLista();
} catch (java.lang.IndexOutOfBoundsException e){
    
    System.out.println(" Error al vender producto, debe seleccionar primero ");
}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
String t=" ";
int pos=0;
for (int i=0;i<this.vendidos.size();i++){
    for (int j = 0; j< this.vendidos.size(); j++){
        if (i!= j){
            if (this.vendidos.get(i).getNombre().equalsIgnoreCase( this.vendidos.get(j).getNombre()  ) ){

            } else {
                
                 t+=( "\n" + this.vendidos.get(j).getNombre());
                pos = i;
            }
            
        }
    }
}
new salida("El producto o los productos menos vendidos son \n" + t );

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
String s=" ";
double precio=0.0;
Scanner n = new Scanner(System.in);
System.out.println( " Digitar un precio para comparar: " );
precio = n.nextDouble();
        for (int i=0; i<this.supermercado.almacenes.size() ;i++) {
            if (!this.supermercado.almacenes.get(i).productos.isEmpty() ){
                for ( int j=0;j<this.supermercado.almacenes.get(i).productos.size();j++ ){
               if (this.supermercado.almacenes.get(i).productos.get(j).getPrecioDeCosto() > precio )  s+=("\n" +  this.supermercado.almacenes.get(i).productos.get(j).getNombre() );
        }}}
        
        new salida("Los productos son: " + s );
               
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
        
    public void ActualizarLista(){
        ArrayList<String> s = new ArrayList();
 
        for (int i=0; i<this.supermercado.almacenes.size() ;i++) {
            if (!this.supermercado.almacenes.get(i).productos.isEmpty() ){
                for ( int j=0;j<this.supermercado.almacenes.get(i).productos.size();j++ ){
                s.add( this.supermercado.almacenes.get(i).productos.get(j).getNombre() );
        }}}
        String[] x= new String[s.size()];
        for ( int i=0 ; i<s.size() ; i++ ){
            x[i] = s.get(i);
        }
        
        productosjList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = (x);
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(productosjList);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnhadirExtranjerojButton;
    private javax.swing.JButton AnhadirNacionaljButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> productosjList;
    // End of variables declaration//GEN-END:variables
}
