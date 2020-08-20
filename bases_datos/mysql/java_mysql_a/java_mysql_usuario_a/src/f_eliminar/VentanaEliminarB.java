package f_eliminar;

import b_utilidades.TablaSwing;
import c_clases.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abi
 */
public class VentanaEliminarB extends javax.swing.JFrame {

    public VentanaEliminarB() {
        initComponents();

        String consultaSQL = "SELECT id_usuario, nombre, contrasena FROM usuario";
        TablaSwing.llenarTabla(tablaUsuarios, consultaSQL);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTablaUsuarios = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_usuario", "nombre", "contrasena"
            }
        ));
        scrollTablaUsuarios.setViewportView(tablaUsuarios);

        getContentPane().add(scrollTablaUsuarios);
        scrollTablaUsuarios.setBounds(30, 30, 640, 200);

        botonEliminar.setText("Eliminar");
        getContentPane().add(botonEliminar);
        botonEliminar.setBounds(260, 260, 140, 23);
        EventoEliminar elEventoEliminar = new EventoEliminar();

        botonEliminar.addActionListener(elEventoEliminar);

        setSize(new java.awt.Dimension(703, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminarB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JScrollPane scrollTablaUsuarios;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    private class EventoEliminar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            int idUsuario = TablaSwing.getId(tablaUsuarios);

            if (idUsuario > 0) {

                UsuarioDAO elUsuarioDAO = new UsuarioDAO();

                elUsuarioDAO.eliminar(idUsuario);

                String consultaSQL = "SELECT id_usuario, nombre, contrasena FROM usuario";
                TablaSwing.actualizarTabla(tablaUsuarios, consultaSQL);

            }
            
        }

    }

}
