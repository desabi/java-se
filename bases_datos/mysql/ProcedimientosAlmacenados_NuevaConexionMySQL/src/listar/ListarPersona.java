
package listar;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class ListarPersona {
    public static void main(String[] args) {
        
        String consulta = "{CALL listarPersona()}";
        
        try {
            
            CallableStatement cs = ConexionMySQL.getCallableStatement(consulta);
            
            ResultSet resultados = cs.executeQuery();
            
            while (resultados.next()) {
                
                int idPersona = resultados.getInt("idpersona");
                String nombre = resultados.getString("nombre");
                
                System.out.println(idPersona + " " + nombre);
            }
            
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }
    }
}
