
package Interfaces;

import equipos_y_mobiliarios.equipos;
import equipos_y_mobiliarios.mobiliarios;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operaciones extends javax.swing.JFrame {

   
    public Operaciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Cantidad de Equipos de un mismo tipo desglosado por marcas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cantidad total de medios en mal estado y desglosados por tipo ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Conocer el Equipo de más y menos años de garantía");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Conocer los principales proveedores de Equipamiento y Mobiliario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Crear DATOS.DAT con la información de muebles");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Conocer el costo total por Equipo y por Muebles");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Conocer el costo promedio por tipo de Equipo y por tipo de Mueble");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String s=""; int c=0;
       for (int j=0 ; j<Principal.uci.medios.size() ; j++){
           if (Principal.uci.medios.get(j) instanceof equipos) {
           s+= "\n De la marca " + ((equipos)Principal.uci.medios.get(j)).getMarca() + " hay: ";
                     for (int i=0 ; i<Principal.uci.medios.size() ; i++){
                        if (Principal.uci.medios.get(j) instanceof equipos ) {
                        if (((equipos)Principal.uci.medios.get(i)).getMarca().equals(((equipos)Principal.uci.medios.get(j)).getMarca() )){
                            c++;
                        }
           } }
           s+= c + "\n";
           }
           c=0;
       }
    jTextArea1.setText( s );
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  String s="";
  int c=0;
    s+="Equipos en mal estado: ";
       for (int j=0 ; j<Principal.uci.medios.size() ; j++){
                 if (Principal.uci.medios.get(j) instanceof equipos) {
                     if (Principal.uci.medios.get(j).getEstado().equals("mal") ) c++;
                 } 
       }
     s+=c;
     c=0;
    s+="\nMobiliarios en mal estado: ";
       for (int j=0 ; j<Principal.uci.medios.size() ; j++){
                 if (Principal.uci.medios.get(j) instanceof mobiliarios) {
                     if (Principal.uci.medios.get(j).getEstado().equals("mal") ) c++;
                 } 
       }
     s+=c;
    jTextArea1.setText( s );
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  String s="";int mayor=-1;int menor=-1;int pos=0;
    s+="Equipo con más años de garantía : ";
       for (int j=0 ; j<Principal.uci.medios.size() ; j++){
                 if (Principal.uci.medios.get(j) instanceof equipos) {
                     if (((equipos)Principal.uci.medios.get(j)).getAnnos_garantia() > mayor ){
                         mayor = (((equipos)Principal.uci.medios.get(j)).getAnnos_garantia());
                         pos = j;
                     }
                 } 
       }
    s+= (((equipos)Principal.uci.medios.get(pos)).getTipo()) + " con ID " + (((equipos)Principal.uci.medios.get(pos)).getNumero_de_inventario()) ; 
    s+="\nEquipo con menos años de garantía : ";
       for (int j=0 ; j<Principal.uci.medios.size() ; j++){
                 if (Principal.uci.medios.get(j) instanceof equipos) {
                     if (((equipos)Principal.uci.medios.get(j)).getAnnos_garantia() < menor ){
                         menor = (((equipos)Principal.uci.medios.get(j)).getAnnos_garantia());
                         pos = j;
                     }
                 } 
       }
    s+= (((equipos)Principal.uci.medios.get(pos)).getTipo()) + " con ID " + (((equipos)Principal.uci.medios.get(pos)).getNumero_de_inventario()) ; 
   jTextArea1.setText( s );
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  String s="";
    s+="Principales provedores : ";
    
       for (int j=0 ; j<Principal.uci.medios.size() ; j++){
          for (int i=0 ; i<Principal.uci.medios.size() ; j++){
                 if (Principal.uci.medios.get(j) instanceof equipos && Principal.uci.medios.get(i) instanceof equipos) {
                     if (((equipos)Principal.uci.medios.get(j)).getProveedor_usual().equalsIgnoreCase( ((equipos)Principal.uci.medios.get(i)).getProveedor_usual() )){
                         if (i!=j) {
                             s+= "\n " + ((equipos)Principal.uci.medios.get(j)).getProveedor_usual();
          } } } } }
        for (int j=0 ; j<Principal.uci.medios.size() ; j++){
          for (int i=0 ; i<Principal.uci.medios.size() ; j++){
                 if (Principal.uci.medios.get(j) instanceof mobiliarios && Principal.uci.medios.get(i) instanceof mobiliarios ) {
                     if ( ((mobiliarios)Principal.uci.medios.get(j)).getProveedor().equalsIgnoreCase( ((mobiliarios)Principal.uci.medios.get(i)).getProveedor())){
                         if (i!=j) {
                             s+= "\n " + ((mobiliarios)Principal.uci.medios.get(j)).getProveedor();
          } } } } }
       
   jTextArea1.setText( s );
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  String texto="";
        
      for (int i=0; i<Principal.uci.medios.size() ;i++) {
            if (Principal.uci.medios.get(i) instanceof mobiliarios )  {
                texto+= "\n" + (((mobiliarios)(Principal.uci.medios.get(i))).getTipo() + " con ID: " + Principal.uci.medios.get(i).getNumero_de_inventario() );
                 } 
       }
                  BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter( "DATOS.DAT" ));
            bufferedWriter.write(  texto );
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            if (bufferedWriter != null)
                try {
                    bufferedWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 String s="";
  double c=0;
    s+="Equipos : ";
       for (int j=0 ; j<Principal.uci.medios.size() ; j++){
                 if (Principal.uci.medios.get(j) instanceof equipos) {
                    c+= ((equipos)Principal.uci.medios.get(j)).getCosto() ;
                 } 
       }
     s+=c;
     c=0;
    s+="\nMobiliarios : ";
       for (int j=0 ; j<Principal.uci.medios.size() ; j++){
                 if (Principal.uci.medios.get(j) instanceof mobiliarios) {
                    c+=  ((mobiliarios)Principal.uci.medios.get(j)).getCosto();
                 } 
       }
     s+=c;
    jTextArea1.setText( s );
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    String s="-- Equipos -- \n ";; double c=0; int cant=0;
       for (int j=0 ; j<Principal.uci.medios.size() ; j++){
           if (Principal.uci.medios.get(j) instanceof equipos) {
           s+= "\n De el tipo " + ((equipos)Principal.uci.medios.get(j)).getTipo() + " hay un promedio de ";
           
                     for (int i=0 ; i<Principal.uci.medios.size() ; i++){
                        if (Principal.uci.medios.get(j) instanceof equipos ) {
                        if (((equipos)Principal.uci.medios.get(i)).getTipo().equals(((equipos)Principal.uci.medios.get(j)).getTipo() )){
                            cant++;
                            c+=((equipos)Principal.uci.medios.get(i)).getCosto();
                        }
                     } }
           s+= c/cant + "\n";
       }
           s+="\n\n-- Mobiliarios -- \n ";
           c=0;cant=0;
       }
              for (int j=0 ; j<Principal.uci.medios.size() ; j++){
           if (Principal.uci.medios.get(j) instanceof mobiliarios) {
           s+= "\n De el tipo " + (( mobiliarios)Principal.uci.medios.get(j)).getTipo() + " hay un promedio de ";
           
                     for (int i=0 ; i<Principal.uci.medios.size() ; i++){
                        if (Principal.uci.medios.get(j) instanceof equipos ) {
                        if ((( mobiliarios)Principal.uci.medios.get(i)).getTipo().equals((( mobiliarios)Principal.uci.medios.get(j)).getTipo() )){
                            cant++;
                            c+=(( mobiliarios)Principal.uci.medios.get(i)).getCosto();
                        }
                     } }
           s+= c/cant + "\n";
           }
           c=0;cant=0;
       }
    jTextArea1.setText( s );
    }//GEN-LAST:event_jButton7ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
