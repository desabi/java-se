
package d_usuario;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Actualizar_B {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaUPDATE = "UPDATE usuario SET nombre=?, edad=?, estatura=?, telefono=? WHERE idusuario=?";
        
        /* 2do: Crear la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaUPDATE);
        
        try {
            
            /* 3ro: colocar los datos a nuevos */
            sentenciaPreparada.setString(1, "Gaby");    // nombre
            sentenciaPreparada.setInt(2, 27);           // edad
            sentenciaPreparada.setDouble(3, 1.70);      // estatura
            sentenciaPreparada.setLong(4, 7571063990L); // telefono
            sentenciaPreparada.setInt(5, 4);            // id del registro a actualizar
            
            /* 4to: ejecutar la consulta  */
            int actualizacion = sentenciaPreparada.executeUpdate();
            
            /* 5to: Imprimir el resultado de la actualizacion */
            /* 1: si*/
            System.out.println("actualizacion = " + actualizacion);
            
            /* 6to: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al actualizar el usuario.");
            System.out.println("\n\nEl error es: \n\n" + e);
        }
        
    }
    
}

