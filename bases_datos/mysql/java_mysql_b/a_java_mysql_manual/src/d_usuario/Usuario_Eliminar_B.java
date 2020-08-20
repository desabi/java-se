
package d_usuario;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Eliminar_B {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaDELETE = "DELETE FROM usuario WHERE idusuario =  ?";
        
        /* 2do: Crear la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaDELETE);
        
        try {
            
            /* 3ro: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setInt(1, 3);  // id del usuario a eliminar
            
            /* 4to: Ejecutar la sentencia preparada */
            int eliminacion = sentenciaPreparada.executeUpdate();
            
            /* 5to: Imprimir el resultado de la eliminacion */
            System.out.println("eliminacion = " + eliminacion);
            
            /* 6to: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al eliminar el usuario.");
            System.out.println("\n\nEl error es:\n\n"+e);
            
        }
    }
}
