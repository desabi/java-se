
package d_libro;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Libro_Insertar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de los objetos */
        Scanner leer = new Scanner(System.in);
        Libro elLibro = new Libro();
        
        /* 2do: Pedir los datos */
        /* 3ro: Colocar los datos */
        System.out.print("Escribe el titulo del libro: ");
        elLibro.setTitulo(leer.next());
        
        System.out.print("Escribe el precio del libro: ");
        elLibro.setPrecio(leer.nextFloat());
        
        System.out.print("Escribe el numero de paginas del libro: ");
        elLibro.setPaginas(leer.nextInt());
        
        /* 4to: Crear la consulta */
        String consultaINSERT = "INSERT INTO libro VALUES (?, ?, ?, ?)";
        
        /* 5to: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaINSERT);
        
        try {
            
            /* 6to: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, null);                    //idusuario 
            sentenciaPreparada.setString(2, elLibro.getTitulo() );    // titulo
            sentenciaPreparada.setFloat(3, elLibro.getPrecio() );     // precio
            sentenciaPreparada.setInt(4, elLibro.getPaginas() );      // paginas
            
            /* 7mo: Ejecutar la sentencia preparada */
            int insercion = sentenciaPreparada.executeUpdate();
            
            /* 8vo: Imprimir el resultado de la insercion */
            System.out.println("insercion = " + insercion);
            
            /* 9no: Cerra la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
             /* Imprimir mensajes en caso de que haya ocurrido un error al insertar */
            System.out.println("Error al insertar el libro.\n\n");
            System.out.println("\nEl error es:\n\n"+e);
            
        }
    }
}
