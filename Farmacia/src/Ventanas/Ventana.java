package Ventanas;

import Clases.Estante;
import Clases.Farmacia;
import Clases.Medicamento_Importado;
import Clases.Medicamento_Nacional;
import Clases.Medicamento_donacion;
import Clases.medicamento;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Ventana extends javax.swing.JFrame {
    public static Farmacia p = new Farmacia(0);
    private ArrayList <medicamento> vendidos;
    public int index=0;
    public static Agregar add = new Agregar();
    public static int selectable=0;
    
    public Ventana() {
        
        initComponents();
        setResizable(false);
        this.Update_tree();
        vendidos = new ArrayList();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTree1 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FarmaSoft");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setToolTipText("");
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });

        jButton1.setText("Añadir medicamentos");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar estante");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setText("Actualizar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar Estante");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton10.setText("Vender medicamento");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTree1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTree1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos", jPanel1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Aqui se muestran sus datos de salida...\n\n");
        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setText("Mostrar estadísticas de la farmacia");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton11.setText("Control de Medicamentos Importados");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Exportar fichero de texto");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField3.setText("Informe.txt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Estadísticas", jPanel2);

        jButton5.setText("Listado de medicamentos más vendidos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Inventario diario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Medicamentos Nacionales"));

        jTextField1.setText("Precio en MN");

        jButton7.setText("Cantidad de productos por encima");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Medicamentos de Donación"));

        jTextField2.setText("Introduzca un País");

        jButton9.setText("Cantidad de productos donados");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Operaciones", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered

    }//GEN-LAST:event_jButton8MouseEntered
//Update
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.Update_tree();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    
    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        try{
            int j; double k;
            String c = this.jTree1.getSelectionPath().getLastPathComponent().toString();

            if ( (c.substring(0, 4)).equals("Esta") ){
                k=(Double.valueOf((c.substring(8, c.length()))));
            } else k=0;
             
             j = (int) k + 0;
      selectable = j - 1;
        }
        
      catch (java.lang.StringIndexOutOfBoundsException | java.lang.NullPointerException e){
          //    selectable = 0;
        }
        //    selectable = 0;

      
    }//GEN-LAST:event_jTree1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

p.DVD_list.add( new Estante());
this.Update_tree();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            String c = this.jTree1.getSelectionPath().getLastPathComponent().toString();

            
            if ( (c.substring(0, 4)).equals("Esta") ){
                 
                p.Delete(Double.valueOf((c.substring(8, c.length()))));
                this.Update_tree();
            }

        } catch (java.lang.NullPointerException s){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     String t=" ----------------- Medicamentos en la farmacia: \n";
           if ( !p.DVD_list.isEmpty() ) {
          for (int i=0; i < p.DVD_list.size() ;i++){
       t+=( "Estante " + (i+1) + "\n" );  
      try { 
           if ( !p.DVD_list.get(i).Files_list.isEmpty()) {
               for (int j=0 ; j < p.DVD_list.get(i).Files_list.size() ; j++){
               t+=( p.DVD_list.get(i).Files_list.get(j).getNombre() + "\n" );
                  }
           } else {
              t+=("\n - Sin Medicamentos \n ");
           }
      } catch (java.lang.IndexOutOfBoundsException e) {

      }
      }
      } else {  
          t+=("\n Sin Estantes ");
      }
     t+=("\n\n ---------------- Medicamentos vendidos \n");
    for (int i=0;i<this.vendidos.size();i++) {
     t+= (" Nombre del Medicamento : " + 
                this.vendidos.get(i).getNombre() + "\n" );   
    }
    jTextArea2.setText("Inventario Diario\n\n" + t);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try{
            String c = this.jTree1.getSelectionPath().getLastPathComponent().toString();

            if ( (c.substring(0, 4)).equals("Esta") ){
                this.Update_tree();
            } else {
                      int j; double k;
             k = Double.valueOf(this.jTree1.getSelectionPath().getParentPath().toString().substring
                     (this.jTree1.getSelectionPath().getParentPath().toString().length() - 3,
                       this.jTree1.getSelectionPath().getParentPath().toString().length() - 1)) ;
             
             j = (int) k + 0;
             
                for (int i = 0 ; i < this.p.DVD_list.get(j - 1).Files_list.size() ; i++){
                     if ((this.p.DVD_list.get(j - 1).Files_list.get(i)).getNombre().equalsIgnoreCase(c) ) {
                  this.vendidos.add( p.DVD_list.get(j-1).Files_list.remove(i) ) ;
                  this.Update_tree();
                  break;
                     }
                }
            }

        } catch (java.lang.NullPointerException s){

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
String t="";
    for (int i=0;i<this.vendidos.size();i++) {
        for (int j=0;j<this.vendidos.size();j++){
         if (this.vendidos.get(i).equals(this.vendidos.get(j)) ) t+= ("-------\nNombre del Medicamento : " + 
                this.vendidos.get(i).getNombre() );   
         break;
        }
    }
    if (t.equals(""))  jTextArea2.setText("No hay datos para mostrar."); 
    else  jTextArea2.setText(t);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      String t="";
       for (int i=0; i < p.DVD_list.size() ;i++){
      t+=( "Estante " + (i+1) + "\n" );  
           if ( !p.DVD_list.get(i).Files_list.isEmpty()) {
               for (int j=0 ; j < p.DVD_list.get(i).Files_list.size() ; j++){
                   if (p.DVD_list.get(i).Files_list.get(j) instanceof Medicamento_Importado  ){
               t+=( p.DVD_list.get(i).Files_list.get(j).getNombre() + " procede de " + ((Medicamento_Importado) p.DVD_list.get(i).Files_list.get(j)).getCompannia_que_comercializa() +  "\n" );
               }}
           } else {
              t+=("\n  -  Sin Medicamentos importados \n ");
           }
       }
    if (t.equals(""))  jTextArea2.setText("No hay datos para mostrar."); 
    else  jTextArea1.setText(t);  
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

           String t=" ----------------- Medicamentos en la farmacia: \n";
           if ( !p.DVD_list.isEmpty() ) {
          for (int i=0; i < p.DVD_list.size() ;i++){
       t+=( "Estante " + (i+1) + "\n");  
      try { 
           if ( !p.DVD_list.get(i).Files_list.isEmpty()) {
               for (int j=0 ; j < p.DVD_list.get(i).Files_list.size() ; j++){
               t+=( p.DVD_list.get(i).Files_list.get(j).getNombre() + "\n" );
                  }
           } else {
              t+=("\n  -  Sin Medicamentos\n ");
           }
      } catch (java.lang.IndexOutOfBoundsException e) {

      }
      }
      } else {  
          t+=(" Sin Estantes ");
      }
        jTextArea1.setText(t);
           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     String t="";
     try {
       for (int i=0; i < p.DVD_list.size() ;i++){
      // t+=( "Estante " + (i+1) + "\n" );  
           if ( !p.DVD_list.get(i).Files_list.isEmpty()) {
               for (int j=0 ; j < p.DVD_list.get(i).Files_list.size() ; j++){
                   if (p.DVD_list.get(i).Files_list.get(j) instanceof Medicamento_Nacional  ){
                       if (((Medicamento_Nacional) p.DVD_list.get(i).Files_list.get(j)).getCosto_produccion() > Double.valueOf( jTextField1.getText() ) ){
               t+=( p.DVD_list.get(i).Files_list.get(j).getNombre() + " con un costo de " + ((Medicamento_Nacional) p.DVD_list.get(i).Files_list.get(j)).getCosto_produccion() +  "\n" );
                       }
                   }}
           }
       }
     } catch (java.lang.NumberFormatException e){
         System.out.println(" Error en el campo ");
     }
    if (t.equals(""))  jTextArea2.setText("No hay datos para mostrar."); 
    else  jTextArea2.setText("--------\n"+t);  
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     String t="";
       for (int i=0; i < p.DVD_list.size() ;i++){
       t+=( "Estante " + (i+1) + "\n" );  
           if ( !p.DVD_list.get(i).Files_list.isEmpty()) {
               for (int j=0 ; j < p.DVD_list.get(i).Files_list.size() ; j++){
                   if (p.DVD_list.get(i).Files_list.get(j) instanceof Medicamento_donacion  ){
                       if (((Medicamento_donacion) p.DVD_list.get(i).Files_list.get(j)).getPais_que_dona().equalsIgnoreCase( jTextField2.getText() ) ){
               t+=( p.DVD_list.get(i).Files_list.get(j).getNombre() + "\n" );
                       }
                   }}
           }
       }
    if (t.equals(""))  jTextArea2.setText("No hay datos para mostrar."); 
    else  jTextArea2.setText("-----------\n" + t);  
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
           BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter( jTextField3.getText() ));
            bufferedWriter.write(   jTextArea1.getText()  );
            System.out.print( "El archivo " + jTextField3.getText() + " ha sido creado sin problemas. " );
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            if (bufferedWriter != null)
                try {
                    bufferedWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
                
            }
        });
    }
    public void Update_tree(){
        
       DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("Farmacia");
       DefaultMutableTreeNode treeNode2,treeNode3;
       
       if ( !p.DVD_list.isEmpty() ) {
          for (int i=0; i < p.DVD_list.size() ;i++){
       treeNode2 = new DefaultMutableTreeNode( "Estante " + (i+1) );  
      try { 
           if ( !p.DVD_list.get(i).Files_list.isEmpty()) {
               for (int j=0 ; j < p.DVD_list.get(i).Files_list.size() ; j++){
               treeNode3 = new DefaultMutableTreeNode( p.DVD_list.get(i).Files_list.get(j).getNombre()   );
               treeNode2.add(treeNode3);
                  }
           } else {
               treeNode3 = new DefaultMutableTreeNode(" Sin Medicamentos ");
               treeNode2.add(treeNode3);
           }
           
      } catch (java.lang.IndexOutOfBoundsException e) {

          
      }
        treeNode1.add(treeNode2); 
           }
       } else {  
           treeNode2 = new DefaultMutableTreeNode(" Sin Estantes ");
           treeNode1.add(treeNode2);
       }
        jTree1.setModel(new DefaultTreeModel(treeNode1));
        DefaultTreeModel model = (DefaultTreeModel) (jTree1.getModel());
        model.reload();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
