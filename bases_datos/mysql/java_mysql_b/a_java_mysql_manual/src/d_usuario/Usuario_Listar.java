
package d_usuario;

import b_utilidades.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Listar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaSELECT = "SELECT idusuario, nombre, edad, estatura, telefono FROM usuario";
        
        /* 2do: Obtener los registros */
        ResultSet registros = ConexionMySQL.getRegistros(consultaSELECT);
        
       
        try {
            
            /* 3ro: Recorrer los registros */
            while (registros.next()) {
                
                /* 4to: Obtener los datos del usuario */
                int idUsuario = registros.getInt("idusuario");
                String nombre = registros.getString("nombre");
                int edad = registros.getInt("edad");
                double estatura = registros.getDouble("estatura");
                long telefono = registros.getLong("telefono");
                
                /* 5to: Imprimir los datos */
                System.out.println(idUsuario+" - "+nombre+" - "+edad+" - "+estatura+" - "+telefono);
                
            }
            
            /* 6to: Cerrar los registros */
            registros.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al listar los usuarios.");
            System.out.println("\n\nEl error es: " + e);
            
        }
    }

}
