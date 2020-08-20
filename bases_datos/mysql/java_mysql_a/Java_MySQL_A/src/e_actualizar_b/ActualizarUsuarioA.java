  
package e_actualizar_b;

import java.sql.PreparedStatement;
import a_utilidades.ConexionMySQL;
import java.sql.SQLException;

/**
 *
 * @author Abi
 */
public class ActualizarUsuarioA {
    public static void main(String[] args) {
        
        int id = 2;
        String nuevoNombre = "Ana";
        String nuevoApellidos = "Romero Ortega";
        int nuevaEdad = 19;
        Long nuevoTelefono = 7571009980L;
        
        String sql = "UPDATE usuario SET nombre=?, apellidos=?, edad=?, telefono=? WHERE idusuario=?";
        
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(sql);
        
        try {
            sentenciaPreparada.setString(1, nuevoNombre);
            sentenciaPreparada.setString(2, nuevoApellidos);
            sentenciaPreparada.setInt(3, nuevaEdad);
            sentenciaPreparada.setLong(4, nuevoTelefono);
            sentenciaPreparada.setInt(5, id);
            
            int ejecucion = sentenciaPreparada.executeUpdate();
            
            System.out.println("Ejecucion: "+ ejecucion);
            
            sentenciaPreparada.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e);
        }
        
    }
}
