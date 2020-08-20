
package com.abi;

public class ContadorGUI extends javax.swing.JFrame {

    public ContadorGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelContadorA = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        labelContadorB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelContadorA.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(labelContadorA);
        labelContadorA.setBounds(50, 60, 100, 90);

        botonIniciar.setText("Iniciar");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(botonIniciar);
        botonIniciar.setBounds(140, 180, 110, 23);

        labelContadorB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(labelContadorB);
        labelContadorB.setBounds(210, 50, 120, 90);

        setSize(new java.awt.Dimension(416, 299));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        ContadorRunnable cr = new ContadorRunnable(labelContadorA);
        ContadorThread contadorThread = new ContadorThread(labelContadorB);
    }//GEN-LAST:event_botonIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContadorGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JLabel labelContadorA;
    private javax.swing.JLabel labelContadorB;
    // End of variables declaration//GEN-END:variables
}
