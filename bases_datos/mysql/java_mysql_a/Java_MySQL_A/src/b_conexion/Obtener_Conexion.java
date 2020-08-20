
package b_conexion;

import java.sql.Connection;
import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class Obtener_Conexion {
    
    public static void main(String[] args) {
        
        /* Verificar si existe o no conexion con la base de datos */
        Connection conexion = ConexionMySQL.getConexion();
        
    }
}
