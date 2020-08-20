
package f_eliminar_b;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class EliminarUsuarioA {
    public static void main(String[] args) {
        
        int id = 3;
        
        String sql = "DELETE FROM usuario WHERE idusuario=?";
        
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(sql);
        
        try {
            sentenciaPreparada.setInt(1, id);
            
            int ejecucion = sentenciaPreparada.executeUpdate();
            
            System.out.println("Ejecucion: " + ejecucion);
            
            sentenciaPreparada.close();
        } catch (SQLException e) {
            System.out.println("Error el eliminar: " + e);
        }
        
        
    }
}
