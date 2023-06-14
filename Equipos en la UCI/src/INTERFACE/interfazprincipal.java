
package INTERFACE;

import CLASES.UCI;


public class interfazprincipal extends javax.swing.JFrame {
    public static UCI uci = new UCI();
    
    public interfazprincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnhadirNacionaljButton = new javax.swing.JButton();
        AnhadirExtranjerojButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App");
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        AnhadirNacionaljButton.setText("Añadir Equipo");
        AnhadirNacionaljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnhadirNacionaljButtonActionPerformed(evt);
            }
        });

        AnhadirExtranjerojButton.setText("Funcionalidades");
        AnhadirExtranjerojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnhadirExtranjerojButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        jButton3.setText("Añadir Mobiliario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("<html>Usted puede crear equipos y mobiliarios y posteriormente realizar operaciones con estos </html>");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AnhadirExtranjerojButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addComponent(AnhadirNacionaljButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(AnhadirNacionaljButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(AnhadirExtranjerojButton)
                .addGap(27, 27, 27)
                .addComponent(jLabel1))
        );

        getAccessibleContext().setAccessibleName("Gestión Supermercado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnhadirNacionaljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnhadirNacionaljButtonActionPerformed
new agregarequipo().setVisible(true);

    }//GEN-LAST:event_AnhadirNacionaljButtonActionPerformed

    private void AnhadirExtranjerojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnhadirExtranjerojButtonActionPerformed
new Operaciones().setVisible(true);

    }//GEN-LAST:event_AnhadirExtranjerojButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new Mobiliarios().setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazprincipal().setVisible(true);
            }
        });
    }

    
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnhadirExtranjerojButton;
    private javax.swing.JButton AnhadirNacionaljButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
