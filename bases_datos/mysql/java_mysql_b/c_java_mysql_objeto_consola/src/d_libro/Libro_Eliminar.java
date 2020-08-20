
package d_libro;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Libro_Eliminar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de los objetos */
        Scanner leer = new Scanner(System.in);
        Libro elLibro = new Libro();
        
        /* 2do: Pedir los datos */
        /* 3ro: Colocar los datos al objeto */
        System.out.print("Escribe el id del libro que deseas eliminar: ");
        elLibro.setIdLibro(leer.nextInt());
        
        /* 4to: Crear la consulta */
        String consultaDELETE = "DELETE FROM libro WHERE idlibro = ?";
        
        /* 5to: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaDELETE);
        
        try {
            
            /* 6to: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setInt(1, elLibro.getIdLibro());
            
            /* 7mo: Ejecutar la sentencia preparada */
            int eliminacion = sentenciaPreparada.executeUpdate();
            
            /* 8vo: Imprimir el resultado de la eliminacion */
            System.out.println("eliminacion = " + eliminacion);
            
            /* 9no: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al eliminar el libro\nn");
            System.out.println("El error es:\n\n"+e);
            
        }
        
    }       
}
