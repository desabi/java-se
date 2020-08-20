
package c_trabajador;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Trabajador_Eliminar_B {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        /* 1ro: Pedir los datos */
        System.out.print("Escribe el id del trabajador a eliminar: ");
        int idTrabajador = leer.nextInt();
        
        /* 2do: Crear la consulta */
        String consultaDELETE = "DELETE FROM trabajador WHERE idtrabajador = ?";
        
        /* 3ro: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaDELETE);
        
        try {
            
            /* 4to: Colocar los datos a la sentencia preparada */
            sentenciaPreparada.setInt(1, idTrabajador);
            
            /* 5to: Ejecutar la sentencia preparada */
            int eliminacion = sentenciaPreparada.executeUpdate();
            
            /* 6to: Imprimir el resultado de la eliminacion */
            System.out.println("eliminacion = " + eliminacion);
            
            /* 7mo: Cerrrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar el trabajador.");
            System.out.println("\n\nEl error es:\n\n"+e);
        }
    }
}
