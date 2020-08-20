
package d_libro;

import b_utilidades.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class Libro_Listar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de los objetos */
        Libro elLibro = new Libro();
        
        /* 2do: Crear la consulta */
        String consultaSELECT = "SELECT idlibro, titulo, precio, paginas FROM libro";
        
        /* 3ro: Obtener los registros */
        ResultSet registros = ConexionMySQL.getRegistros(consultaSELECT);      
        
        try {
            
            /*4to: Recorrer los registros */
            while (registros.next()) {
                
                /* 5to: Obtener los datos y colocarlos al objeto */
                elLibro.setIdLibro(registros.getInt("idlibro"));
                elLibro.setTitulo(registros.getString("titulo"));
                elLibro.setPrecio(registros.getFloat("precio"));
                elLibro.setPaginas(registros.getInt("paginas"));
                
                /* 6to: Imprimir los datos */
                System.out.print(elLibro.getIdLibro() + " - ");
                System.out.print(elLibro.getTitulo() + " - ");
                System.out.print(elLibro.getPrecio() + " - ");
                System.out.print(elLibro.getPaginas() + " - ");
                System.out.println();
            }
            
            /* 7mo: Cerrar los registros */
            registros.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error el listar los libros.\n\n");
            System.out.println("El error es:\n\n"+e);
            
        }
    }
}
