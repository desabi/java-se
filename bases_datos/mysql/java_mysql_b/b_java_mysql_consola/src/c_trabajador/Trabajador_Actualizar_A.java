
package c_trabajador;

import b_utilidades.ConexionMySQL;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Trabajador_Actualizar_A {
    
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
        
        /* 1ro: Crear la consulta */
        String consultaUPDATE = "UPDATE trabajador SET nombre='"+nuevoNombre+"', entrada='"+nuevaEntrada+"', salida='"+nuevaSalida+"' WHERE idtrabajador="+id;
        
        /* 2do: Ejecutar la consulta */
        ConexionMySQL.ejecutarConsulta(consultaUPDATE);
        
    }
    
}
