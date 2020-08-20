
package c_trabajador;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Trabajador_Insertar_B {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        /* 1ro: Pedir los datos */
        System.out.println("Escribe el nombre:");
        String nombre = leer.next();
        
        System.out.println("Escribe la hora de entrada (hh:mm:ss) : ");
        String entrada = leer.next();
        
        System.out.println("Escribe la hora de salida (hh:mm:ss) : ");
        String salida = leer.next();
        
        /* 2do: Crear la consulta */
        String consultaINSERT = "INSERT INTO trabajador VALUES (?, ?, ?, ?)";
     
        /* 3ro: Crear la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaINSERT);
        
        try {
            
            /* 4to: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, null);     // id
            sentenciaPreparada.setString(2, nombre);   // nombre
            sentenciaPreparada.setString(3, entrada);  // entrada
            sentenciaPreparada.setString(4, salida);   // salida
            
            /* 5to: Ejecutar la sentencia preparada */
            int insercion = sentenciaPreparada.executeUpdate();
            
            /* 6to: Imprimir el resultado de la insercion */
            System.out.println("insercion = " + insercion);
            
            /* 7mo: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al insertar el trabajador");
            System.out.println("\n\nEl error es:\n\n"+e);
                        
        }
    }
    
}
