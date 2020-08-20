
package mipaquete;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author   Abi
 * @proyecto ArchivosGUI
 * @archivo  AbrirGuardar.java
 * @fecha    13/08/2014 07:31:04 AM
 */

public class AbrirGuardarCodificacion extends javax.swing.JFrame {

    public AbrirGuardarCodificacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAbrir = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        scrollArea = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        botonAbrir.setText("Abrir");
        botonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(botonAbrir);
        botonAbrir.setBounds(50, 10, 90, 30);

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar);
        botonGuardar.setBounds(330, 10, 90, 30);

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        scrollArea.setViewportView(areaTexto);

        getContentPane().add(scrollArea);
        scrollArea.setBounds(40, 70, 370, 340);

        setSize(new java.awt.Dimension(465, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrirActionPerformed
        String texto = abrirArchivo();
        areaTexto.setText("");
        areaTexto.append(texto);
    }//GEN-LAST:event_botonAbrirActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        guardarArchivo();
    }//GEN-LAST:event_botonGuardarActionPerformed


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
            java.util.logging.Logger.getLogger(AbrirGuardarCodificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbrirGuardarCodificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbrirGuardarCodificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbrirGuardarCodificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AbrirGuardarCodificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JScrollPane scrollArea;
    // End of variables declaration//GEN-END:variables

    private String abrirArchivo(){
        String texto="";
        String linea;
        try {
            JFileChooser buscador = new JFileChooser();
            buscador.showOpenDialog(this);
            File archivo = buscador.getSelectedFile();
            
            if(archivo != null){
                FileReader fr = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(fr);
                while( (linea = lector.readLine()) != null ){
                    texto += linea + "\n";
                }
                lector.close();
            }else{
                String titulo = "Error al leer";
                String mensaje = "Algo salio mal.";
                JOptionPane.showMessageDialog(rootPane,titulo, mensaje, JOptionPane.ERROR_MESSAGE );
            }
        } catch (HeadlessException | IOException e) {
            String titulo = "Error al abrir";
            String mensaje = "Ningun archivo seleccionado";
            JOptionPane.showMessageDialog(rootPane,titulo, mensaje, JOptionPane.ERROR_MESSAGE );
        }
        
        return texto;
    }
    
    private void guardarArchivo(){
        try {
            JFileChooser buscador = new JFileChooser();
            buscador.showSaveDialog(this);
            File archivo = buscador.getSelectedFile();
            
            if(archivo != null){
                
                try {
                    
                    File miArchivo = new File(archivo+".doc");
                    FileOutputStream fos = new FileOutputStream(miArchivo);
                    OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF8");
                    BufferedWriter bw = new BufferedWriter(osw);
                    
                    String texto = areaTexto.getText();
                    bw.write(texto);
                    
                    bw.close();
                    osw.close();
                    fos.close();
                    
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(rootPane, "IOExpcetion -> "+e);
                }
                
            }else{
                String titulo = "Error al leer";
                String mensaje = "Algo salio mal al leer\n";
                JOptionPane.showMessageDialog(rootPane, titulo, mensaje, JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (HeadlessException e) {
            String titulo = "Error al guardar";
            String  mensaje = "Algo salio mal al guardar.\n"+e;
            JOptionPane.showMessageDialog(rootPane, titulo, mensaje, JOptionPane.ERROR_MESSAGE);
        }
    }
}
