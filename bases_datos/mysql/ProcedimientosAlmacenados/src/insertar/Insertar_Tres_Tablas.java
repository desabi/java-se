
package insertar;

import java.sql.CallableStatement;
import java.sql.SQLException;
import utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class Insertar_Tres_Tablas {
    
    public static void main(String[] args) {
        
        try {
            
            String consulta = "CALL insertar(?, ?, ?, ?, ?)";
            
            CallableStatement cs = ConexionMySQL.getConexion().prepareCall(consulta);
            
            cs.setString(1, "Fulano");
            cs.setInt(2, 33);
            cs.setDouble(3, 1.72);
            cs.setString(4, "Queretaro");
            cs.setString(5, "CiudadABC");
            
            cs.execute();
            
            cs.close();
            
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e);
        }
        
    }
}
