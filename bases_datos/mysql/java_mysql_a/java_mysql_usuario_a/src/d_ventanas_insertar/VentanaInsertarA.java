
package d_ventanas_insertar;

import b_utilidades.TablaSwing;
import c_clases.UsuarioDAO;
import c_clases.UsuarioPOJO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abi
 */
public class VentanaInsertarA extends javax.swing.JFrame implements ActionListener {

    public VentanaInsertarA() {
        initComponents();
        
        String consultaSQL = "SELECT id_usuario, nombre, contrasena FROM usuario";
        TablaSwing.llenarTabla(tablaUsuarios, consultaSQL);
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
        scrollTablaUsuarios = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        etiquetaMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMensaje.setText("AGREGAR NUEVO USUARIO");
        getContentPane().add(etiquetaMensaje);
        etiquetaMensaje.setBounds(70, 10, 240, 30);

        etiquetaNombre.setText("Nombre");
        getContentPane().add(etiquetaNombre);
        etiquetaNombre.setBounds(30, 50, 70, 20);
        getContentPane().add(campoNombre);
        campoNombre.setBounds(130, 50, 150, 20);

        etiquetaContrasena.setText("Contrasena");
        getContentPane().add(etiquetaContrasena);
        etiquetaContrasena.setBounds(30, 80, 70, 14);
        getContentPane().add(campoContrasena);
        campoContrasena.setBounds(130, 80, 150, 20);

        botonInsertar.setText("Insertar");
        getContentPane().add(botonInsertar);
        botonInsertar.setBounds(320, 60, 90, 23);
        botonInsertar.addActionListener(this);

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_usario", "nombre", "contrasena"
            }
        ));
        scrollTablaUsuarios.setViewportView(tablaUsuarios);

        getContentPane().add(scrollTablaUsuarios);
        scrollTablaUsuarios.setBounds(40, 130, 650, 300);

        setSize(new java.awt.Dimension(735, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInsertarA().setVisible(true);
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
    private javax.swing.JScrollPane scrollTablaUsuarios;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /* 1ro: Crear el objeto usuario POJO y DAO */
        UsuarioPOJO elUsuarioPOJO = new UsuarioPOJO();
        UsuarioDAO elUsuarioDAO = new UsuarioDAO();
        
        /* 2do: Obtener los datos del formulario */
        String nombre = campoNombre.getText();
        String contrasena = campoContrasena.getText();
        
        /* 3ro: Colocar los datos al POJO */
        elUsuarioPOJO.setNombre(nombre);
        elUsuarioPOJO.setContrasena(contrasena);
        
        /* 4to: Insertar los datos */
        elUsuarioDAO.insertar(elUsuarioPOJO);
        
        String consultaSQL = "SELECT id_usuario, nombre, contrasena FROM usuario";
        TablaSwing.actualizarTabla(tablaUsuarios, consultaSQL);
        
    }
}
