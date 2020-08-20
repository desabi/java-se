package d_ventanas_insertar;

import c_clases.UsuarioDAO;
import c_clases.UsuarioPOJO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abi
 */
public class VentanaInsertarC extends javax.swing.JFrame {

    public VentanaInsertarC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaMensaje = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etiquetaContrasena = new javax.swing.JLabel();
        campoContrasena = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiquetaMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMensaje.setText("AGREGAR NUEVO USUARIO");
        getContentPane().add(etiquetaMensaje);
        etiquetaMensaje.setBounds(70, 10, 240, 30);

        etiquetaNombre.setText("Nombre");
        getContentPane().add(etiquetaNombre);
        etiquetaNombre.setBounds(50, 60, 70, 20);
        getContentPane().add(campoNombre);
        campoNombre.setBounds(150, 60, 150, 20);

        etiquetaContrasena.setText("Contrasena");
        getContentPane().add(etiquetaContrasena);
        etiquetaContrasena.setBounds(50, 90, 70, 14);
        getContentPane().add(campoContrasena);
        campoContrasena.setBounds(150, 90, 150, 20);

        botonInsertar.setText("Insertar");
        getContentPane().add(botonInsertar);
        botonInsertar.setBounds(130, 120, 90, 23);
        EventoInsertarC elEventoInsertarC = new EventoInsertarC();

        botonInsertar.addActionListener(elEventoInsertarC);

        setSize(new java.awt.Dimension(360, 211));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInsertarC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextField campoContrasena;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel etiquetaContrasena;
    private javax.swing.JLabel etiquetaMensaje;
    private javax.swing.JLabel etiquetaNombre;
    // End of variables declaration//GEN-END:variables

}
