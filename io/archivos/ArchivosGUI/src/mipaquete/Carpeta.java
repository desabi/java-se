
package mipaquete;

import javax.swing.JFileChooser;

/**
 * @author   Abi
 * @proyecto ArchivosGUI
 * @archivo  Carpeta.java
 * @fecha    12/08/2014 11:03:03 PM
 */

public class Carpeta extends javax.swing.JFrame {

    public Carpeta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonGuardar = new javax.swing.JButton();
        campoCarpeta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonGuardar.setText("Guardar en");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar);
        botonGuardar.setBounds(40, 20, 100, 30);

        campoCarpeta.setEditable(false);
        getContentPane().add(campoCarpeta);
        campoCarpeta.setBounds(160, 20, 480, 30);

        setSize(new java.awt.Dimension(687, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        
        JFileChooser dialogo = new JFileChooser();
        dialogo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        //int valor = dialogo.showOpenDialog(this);
        int valor = dialogo.showSaveDialog(dialogo);
        
        if(valor == JFileChooser.APPROVE_OPTION){
            String ruta = dialogo.getSelectedFile().getAbsolutePath();
            campoCarpeta.setText(ruta);
        }
        
    }//GEN-LAST:event_botonGuardarActionPerformed


    public static void main(String args[]) {
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Carpeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoCarpeta;
    // End of variables declaration//GEN-END:variables

}
