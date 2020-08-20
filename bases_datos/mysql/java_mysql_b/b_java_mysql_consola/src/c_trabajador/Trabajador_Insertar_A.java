
package c_trabajador;

import b_utilidades.ConexionMySQL;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Trabajador_Insertar_A {
    
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
        String consultaINSERT = "INSERT INTO trabajador VALUES (NULL, '"+nombre+"', '"+entrada+"', ' "+salida+" ')";
        
        /* 3ro: Ejecutar la consulta */
        ConexionMySQL.ejecutarConsulta(consultaINSERT);
        
    }
    
}
