package INTERFACES;

import CLASES.Clase_controladora;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Ventana_principal extends javax.swing.JFrame {
    public static Clase_controladora p = new Clase_controladora(0);
    public int index=0;
    public static Agregar add = new Agregar(p);
    public static Buscar Bus = new Buscar(p);
    public static int selectable=0;
    
    public Ventana_principal() {
        
        initComponents();
        setResizable(false);
        this.Update_tree();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Proyecto");
        setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N

        jButton1.setText("Añadir");
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

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Buscar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTree1.setFont(new java.awt.Font("Quicksand Light", 1, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setToolTipText("");
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jButton7.setText("Exportar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setText("Importar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(7, 7, 7)
                .addComponent(jButton3)
                .addGap(12, 12, 12)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked
//Add
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered

    }//GEN-LAST:event_jButton5MouseEntered
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Buscar(this.p).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed
//Save
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    try {
        this.p.Save();
    } catch (IOException ex) {
        Logger.getLogger(Ventana_principal.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton7ActionPerformed
//Import
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    try {
        p.DVD_list = p.Importar();
        add.index = p.DVD_list.size();
        this.Update_tree();

        add.index = p.DVD_list.size();
    } catch (IOException | ClassNotFoundException ex) {
        Logger.getLogger(Ventana_principal.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton6ActionPerformed
//Delete DVD or File
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   try{
        String c = this.jTree1.getSelectionPath().getLastPathComponent().toString();
   if ((c.substring(c.length() - 3, c.length())).equals("peg") ){
      int j; double k;
             k = Double.valueOf(this.jTree1.getSelectionPath().getParentPath().toString().substring(14, 16)) ;
             j = (int) k + 0;
       for (int i = 0 ; i < this.p.DVD_list.get(index).Files_list.size() ; i++){
           if ((this.p.DVD_list.get(j-1).Files_list.get(i).getFile_Name() + "." + "mpeg").equals(c) ) {
                      p.DVD_list.get(j-1).Files_list.remove(i);   this.Update_tree();
           }
      }
   } else if ((c.substring(c.length() - 3, c.length())).equals("mp3") ) {
      int j; double k;
             k = Double.valueOf(this.jTree1.getSelectionPath().getParentPath().toString().substring(14, 16)) ;
             j = (int) k + 0;
              for (int i = 0 ; i < this.p.DVD_list.get(index).Files_list.size() ; i++){
           if ((this.p.DVD_list.get(j-1).Files_list.get(i).getFile_Name() + "." + "mp3").equals(c) ) {
                      p.DVD_list.get(j-1).Files_list.remove(i);   this.Update_tree();
           }
       }
       
   } else if ( (c.substring(0, 4)).equals("DVD ") ){
       System.out.println( Double.valueOf(c.substring(4, 6)) );
       p.DeleteDVD(Double.valueOf(c.substring(4, 6)));   this.Update_tree();
   }
      
   } catch (java.lang.NullPointerException s){
       
  }

    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered

    }//GEN-LAST:event_jButton8MouseEntered
//Update
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.Update_tree();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
//To select an DVD
    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        try{
            int j; double k;
             k = Double.valueOf(this.jTree1.getSelectionPath().getParentPath().toString().substring(14, 16)) ;
             j = (int) k + 0;
      selectable = j - 1;
        }
      catch (java.lang.StringIndexOutOfBoundsException | java.lang.NullPointerException e){
          //    selectable = 0;
        }
        //    selectable = 0;

      
    }//GEN-LAST:event_jTree1MouseClicked
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_principal().setVisible(true);
                
            }
        });
    }
    public void Update_tree(){
        
       DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("Paquete");
       DefaultMutableTreeNode treeNode2,treeNode3;
       
       if ( !p.DVD_list.isEmpty() ) {
          for (int i=0; i < p.DVD_list.size() ;i++){
       treeNode2 = new DefaultMutableTreeNode( "DVD " + (i+1) + " (" + p.DVD_list.get(i).getCode() + ")" );  
      try { 
           if ( !p.DVD_list.get(i).Files_list.isEmpty()) {
               for (int j=0 ; j < p.DVD_list.get(i).Files_list.size() ; j++){
               treeNode3 = new DefaultMutableTreeNode( p.DVD_list.get(i).Files_list.get(j).getFile_Name() 
                            + "." + p.DVD_list.get(i).Files_list.get(j).getExtension() );
               treeNode2.add(treeNode3);
                  }
           } else {
               treeNode3 = new DefaultMutableTreeNode(" Vacío ");
               treeNode2.add(treeNode3);
           }
           
      } catch (java.lang.IndexOutOfBoundsException e) {

          
      }
        treeNode1.add(treeNode2); 
           }
       } else {  
           treeNode2 = new DefaultMutableTreeNode(" Vacío ");
           treeNode1.add(treeNode2);
       }
        jTree1.setModel(new DefaultTreeModel(treeNode1));
        DefaultTreeModel model = (DefaultTreeModel) (jTree1.getModel());
        model.reload();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
