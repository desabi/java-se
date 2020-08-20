
package c_libro;

import b_utilidades.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class Libro_Listar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta SELECT */
        String consultaSELECT = "SELECT idlibro, titulo, precio, paginas FROM libro";
        
        /* 2do: Obtener los registros/resultados */
        ResultSet registros = ConexionMySQL.getRegistros(consultaSELECT);
        
        try {
            
            /* 3ro: Recorrer los registros */
            while (registros.next()) {
                
                /* 4to: Obtener los datos de los libro */
                int idLibro = registros.getInt("idlibro"); 
                String titulo = registros.getString("titulo");
                double precio = registros.getDouble("precio");
                int paginas = registros.getInt("paginas");
                
                /* 5to: Imprimir los datos de los libros */
                System.out.println(idLibro+" - "+titulo+" - "+precio+" - "+paginas);
                
            }
            
            /* 6to: Cerrar los registros */
            registros.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Error al listar los libros.");
            System.out.println("\n\nEl error es: " + ex);
            
        }
        
    }
}
