
package a_persona;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import utilidades.ConexionMySQL;

/**
 *
 * @author abi
 */
public class Persona_Search {
    public static void main(String[] args) {
        
        String consulta = "{CALL persona_search(?, ?, ?)}";
        
        try (CallableStatement cs = ConexionMySQL.getCallableStatement(consulta);) {
            
            
            /* IN pid_persona INT*/
            cs.setInt(1, 2);            
            /* OUT pnombre VARCHAR(45)*/
            cs.registerOutParameter(2, Types.VARCHAR);
            /* OUT papellidos VARCHAR(45) */
            cs.registerOutParameter(3, Types.VARCHAR);
            
            boolean execute = cs.execute();
            System.out.println("execute = " + execute);
            
            /* Se coloca el nombre del parametro cuando se creo el procedimiento */
            /* o se puede colocar el numero de la posicion */
            System.out.print(cs.getString("pnombre"));
            System.out.println(" "+cs.getString("papellidos"));
            
            cs.close();
            
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }
    }
}
