
package c_listar;

import java.sql.ResultSet;
import java.sql.SQLException;
import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class ListarUsuariosA {
    public static void main(String[] args) throws SQLException {
        
        /* 1ro: Crear la consulta */
        String sql = "SELECT * FROM usuario";
        
        /* 2do: Obtener los registros */
        ResultSet registros = ConexionMySQL.getRegistros(sql);
        
        /* 3ro: Obtener los registros */
        while(registros.next()){
            String nombre = registros.getString("nombre");
            String apellidos = registros.getString("apellidos");
            int edad = registros.getInt("edad");
            Long telefono = registros.getLong("telefono");
            
            /* 4to: Imprimir los resultados obtenidos */
            System.out.println(nombre+" "+apellidos+" "+edad+" "+telefono);
        }
        
    }
}
