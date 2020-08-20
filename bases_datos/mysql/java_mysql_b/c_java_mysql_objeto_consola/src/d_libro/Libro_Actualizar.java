
package d_libro;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Libro_Actualizar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de los objetos */
        Scanner leer = new Scanner(System.in);
        Libro unLibro = new Libro();
        
        /* 2do: Pedir los nuevos datos */
        /* 3ro: Colocar los datos a unLibro */
        
        System.out.print("Escribe el id del libro a actualizar: ");
        unLibro.setIdLibro(leer.nextInt());
        
        System.out.print("Escribe el nuevo titulo: ");
        unLibro.setTitulo(leer.next());
        
        System.out.print("Escribe el nuevo precio: ");
        unLibro.setPrecio(leer.nextFloat());
        
        System.out.print("Escribe el nuevo numero de paginas: ");
        unLibro.setPaginas(leer.nextInt());
        
        /* 4to: Crear la consulta */
        String consultaUPDATE = "UPDATE libro SET titulo = ?, precio = ?, paginas = ? WHERE idlibro = ?";
        
        /* 5to: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaUPDATE);
        
        try {
            
            /* 6to: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, unLibro.getTitulo() ); // nuevo titulo
            sentenciaPreparada.setFloat(2, unLibro.getPrecio() );  // nuevo precio 
            sentenciaPreparada.setInt(3, unLibro.getPaginas() );   // nuevas paginas
            sentenciaPreparada.setInt(4, unLibro.getIdLibro() );   // id del libro a actualizar
            
            /* 7mo: Ejecutar la sentencia preparada */
            int actualizacion = sentenciaPreparada.executeUpdate();
            
            /* 8vo: Imprimir el resultado de la actualizacion */
            System.out.println("actualizacion = " + actualizacion);
            
            /* 9no: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al actualizar el libro.\n\n");
            System.out.println("El error es:\n\n"+e);
            
        }
    }
}
