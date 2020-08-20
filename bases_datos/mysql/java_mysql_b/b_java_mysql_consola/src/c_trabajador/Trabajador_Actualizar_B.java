
package c_trabajador;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Trabajador_Actualizar_B {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        /* 1ro: Pedir los datos */
        System.out.print("Escribe el id del trabajador a actualizar: ");
        int id = leer.nextInt();
       
        System.out.print("Escribe el nuevo nombre: ");
        String nuevoNombre = leer.next();
        
        System.out.print("Escribe la nueva hora de entrada: ");
        String nuevaEntrada = leer.next();
        
        System.out.print("Escribe la nueva salida: ");
        String nuevaSalida = leer.next();
        
        /* 2do: Crear la consulta */
        String consultaUPDATE = "UPDATE trabajador SET nombre = ?, entrada = ?, salida = ? WHERE idtrabajador = ?";
        
        /* 3ro: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaUPDATE);
        
        try {
            
            /* 4to: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, nuevoNombre);   // nombre
            sentenciaPreparada.setString(2, nuevaEntrada);     // entrada
            sentenciaPreparada.setString(3, nuevaSalida);     // salida
            sentenciaPreparada.setInt(4, id);
            
            /* 5to: Ejecutar la sentencia preparada */
            int actualizacion = sentenciaPreparada.executeUpdate();
            
            /* 6to: Imprimir el resuldato de la actualizacion */
            System.out.println("actualizacion = " + actualizacion);
                 
            /* 7mo: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al actualizar el Trabajador.");
            System.out.println("\n\nEl error es:\n\n"+e);
            
        }
    }
    
}
