
package mipaquete;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 * @author   Abi
 * @proyecto ArchivosGUI
 * @archivo  Escribir.java
 * @fecha    12/08/2014 10:30:10 PM
 */

public class Leer extends javax.swing.JFrame {

    public Leer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAbrir = new javax.swing.JButton();
        scrollAreaTexto = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonAbrir.setText("Abrir Archivo");
        botonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(botonAbrir);
        botonAbrir.setBounds(20, 30, 130, 30);

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        scrollAreaTexto.setViewportView(areaTexto);

        getContentPane().add(scrollAreaTexto);
        scrollAreaTexto.setBounds(250, 20, 350, 310);

        setSize(new java.awt.Dimension(648, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirActionPerformed
        areaTexto.setText("");
        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(this);
        
        try {
            String ruta = buscador.getSelectedFile().getAbsolutePath();
            FileInputStream archivo = new FileInputStream(ruta);
            BufferedInputStream input = new BufferedInputStream(archivo);
            DataInputStream datos = new DataInputStream(input);
            
            try {
                while(datos.available() != 0){
                    areaTexto.append(datos.readLine() + "\n");
                }
            } catch (IOException e) {
                
            }
        } catch (FileNotFoundException e) {
            
        }
    }//GEN-LAST:event_botonAbrirActionPerformed


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
            java.util.logging.Logger.getLogger(Leer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Leer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JScrollPane scrollAreaTexto;
    // End of variables declaration//GEN-END:variables

}
