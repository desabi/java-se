package c_clases;

import b_utilidades.Conexion_MySQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Abi
 */
public class UsuarioDAO {

    public void insertar(UsuarioPOJO elUsuarioPOJO) {

        /* 1ro: Obtener los datos del usuario */
        String nombre = elUsuarioPOJO.getNombre();
        String contrasena = elUsuarioPOJO.getContrasena();

        String consultaSQL = "INSERT INTO usuario VALUES(?, ?, ?)";

        PreparedStatement sentenciaPreparada = Conexion_MySQL.getSentenciaPreparada(consultaSQL);

        try {

            /* Colocar el id */
            sentenciaPreparada.setString(1, null);
            /* Colocar el nombre */
            sentenciaPreparada.setString(2, nombre);
            /* Colocar la contrasena */
            sentenciaPreparada.setString(3, contrasena);

            sentenciaPreparada.executeUpdate();

            sentenciaPreparada.close();

        } catch (SQLException e) {

            String mensaje = "Error al insertar el usuario.\n";
            mensaje += "\nEl error es:\n" + e;
            String titulo = "UsuarioDAO.insertar(UsuarioPOJO elUsuarioPOJO)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

        }

    }

    public ArrayList<UsuarioPOJO> listar() {

        ArrayList<UsuarioPOJO> losUsuarios = new ArrayList<>();

        return losUsuarios;
    }

    public UsuarioPOJO getUsuario(int idUsuario) {

        UsuarioPOJO elUsuarioPOJO = new UsuarioPOJO();

        String consultaSQL = "SELECT id_usuario, nombre, contrasena FROM usuario WHERE id_usuario=" + idUsuario;

        ResultSet registro = Conexion_MySQL.getRegistros(consultaSQL);

        try {

            String nombre = "desconocido";
            String contrasena = "indefinida";

            while (registro.next()) {
                nombre = registro.getString("nombre");
                contrasena = registro.getString("contrasena");
            }

            elUsuarioPOJO.setNombre(nombre);
            elUsuarioPOJO.setContrasena(contrasena);

            registro.close();
            
        } catch (SQLException e) {

            String mensaje = "Ocurrio un problema al obtener el registro.\n" + consultaSQL;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "Error en: Conexion_MySQL.getUsuario(int idUsuario)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

        }

        return elUsuarioPOJO;
    }

    public void actualizar(int idUsuario, UsuarioPOJO elUsuarioPOJO) {
        
        /* Obtener los nuevos datos */
        String nombreNuevo = elUsuarioPOJO.getNombre();
        String contrasenaNueva = elUsuarioPOJO.getContrasena();
        
        /* Crear la consulta */
        String consultaSQL = "UPDATE usuario SET nombre=?, contrasena=? WHERE id_usuario=?";
        
        /* Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = Conexion_MySQL.getSentenciaPreparada(consultaSQL);
        
        try {
            
            sentenciaPreparada.setString(1, nombreNuevo);
            sentenciaPreparada.setString(2, contrasenaNueva);
            sentenciaPreparada.setInt(3, idUsuario);
            
            sentenciaPreparada.executeUpdate();
            
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            String mensaje = "Ocurrio un problema al actualizar el registro.\n" + consultaSQL;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "Error en: Conexion_MySQL.actualizar(int idUsuario, UsuarioPOJO elUsuarioPOJO)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    public void eliminar(int idUsuario) {
        
        String consultaSQL = "DELETE FROM usuario WHERE id_usuario=?";
        
        PreparedStatement sentenciaPreparada = Conexion_MySQL.getSentenciaPreparada(consultaSQL);
        
        try {
        
            sentenciaPreparada.setInt(1, idUsuario);
            
            sentenciaPreparada.executeUpdate();
                    
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            String mensaje = "Ocurrio un problema al eliminar el registro.\n" + consultaSQL;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "Error en: Conexion_MySQL.eliminar(int idUsuario)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
