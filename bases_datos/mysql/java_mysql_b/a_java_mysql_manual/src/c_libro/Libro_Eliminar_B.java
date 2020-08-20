
package c_libro;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class Libro_Eliminar_B {

    public static void main(String[] args) {
        
        
        /* 1ro: Crear la consulta */
        String consultaDELETE = "DELETE FROM libro WHERE idlibro = ?";
        
        /* 2do: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaDELETE);
        
        try {
            
            /* 3ro: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setInt(1, 2);     // eliminar libro con id 2
            
            /* 4to: Ejecutar la sentencia preparada */
            int eliminacion = sentenciaPreparada.executeUpdate();
            
            /* 5to: Imprimir el resultado de la eliminacion */
            /* 1: si */
            System.out.println("eliminacion = " + eliminacion);
            
            /* 6to: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al eliminar el libro" );
            System.out.println("\n\nEl error es:\n\n" + e);
            
        }
        
    }
}

