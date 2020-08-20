
package a_persona;

import java.sql.CallableStatement;
import java.sql.SQLException;
import utilidades.ConexionMySQL;

/**
 *
 * @author abi
 */
public class Persona_Create {
    public static void main(String[] args) {
        
        String consulta = "{CALL persona_create(?, ?)}";
        
        try {
            CallableStatement cs = ConexionMySQL.getCallableStatement(consulta);
            
            cs.setString(1, "Diana");
            cs.setString(2, "SK");
            
            boolean execute = cs.execute();
            System.out.println("execute = " + execute);
            
            cs.close();
            
            
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }
    }
}
