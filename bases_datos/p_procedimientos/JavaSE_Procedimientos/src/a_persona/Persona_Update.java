
package a_persona;

import java.sql.CallableStatement;
import java.sql.SQLException;
import utilidades.ConexionMySQL;

/**
 *
 * @author abi
 */
public class Persona_Update {
    public static void main(String[] args) {
        
        String consulta = "{CALL persona_update(?, ?, ?)}";
        
        try {
            CallableStatement cs = ConexionMySQL.getCallableStatement(consulta);
            
            cs.setInt(1, 1);
            cs.setString(2, "ABIGAHIL");
            cs.setString(3, "DESA");
            
            int executeUpdate = cs.executeUpdate();
            System.out.println("executeUpdate = " + executeUpdate);
            
            cs.close();
            
        } catch (SQLException e) {
            System.out.println("e = " + e);
        } 
    }
}
