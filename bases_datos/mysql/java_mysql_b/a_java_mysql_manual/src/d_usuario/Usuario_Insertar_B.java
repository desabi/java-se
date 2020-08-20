
package d_usuario;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Insertar_B {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaINSERT = "INSERT INTO usuario VALUES(?,?,?,?,?)";
        
        /* 2do: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaINSERT);
        
        try {
            
            /* 3ro: colocar datos a la sentencia */
            sentenciaPreparada.setString(1, null);       // id de usuario
            sentenciaPreparada.setString(2, "Fulano");   // nombre 
            sentenciaPreparada.setInt(3, 35);            // edad
            sentenciaPreparada.setDouble(4, 1.85);       // estatura
            sentenciaPreparada.setLong(5, 7571002850L);  // telefono
            
            /* 4to: Ejecutar la sentencia preparada */
            int insercion = sentenciaPreparada.executeUpdate();
            
            /* 5to: Imprimir el resultado de la insercion */
            /* 1: ok*/
            System.out.println("insercion = " + insercion);
            
            /* 6to: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al insertar el usuario.");
            System.out.println("\n\nEl error es: \n\n" + e);
            
        }
        
    }
    
}
