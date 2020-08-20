
package insertar;

import java.sql.CallableStatement;
import java.sql.SQLException;
import utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class Insertar_Dos_Tablas {
    public static void main(String[] args) {
        
        
        try {
            
            CallableStatement cs = ConexionMySQL.getConexion().prepareCall("CALL insertar_persona_e_informacion(?, ?, ?)");
            
            cs.setString(1, "Richard");
            cs.setInt(2, 24);
            cs.setDouble(3, 1.65);
            
            cs.executeUpdate();
            
            cs.close();
            
        } catch (SQLException e) {
            System.out.println("Error al insertar: \n" + e.getMessage());
        }
        
        
    }
    
}
