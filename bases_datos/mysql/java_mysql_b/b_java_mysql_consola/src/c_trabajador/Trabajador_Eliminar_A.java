
package c_trabajador;

import b_utilidades.ConexionMySQL;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Trabajador_Eliminar_A {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        /* 1ro: Pedir los datos */
        System.out.print("Escribe el id del trabajador a eliminar: ");
        int idTrabajador = leer.nextInt();
        
        /* 2do: Crear la consulta */
        String consultaDELETE = "DELETE FROM trabajador WHERE idtrabajador="+idTrabajador;
        
        /* 3ro: Ejecutar la consulta */
        ConexionMySQL.ejecutarConsulta(consultaDELETE);
        
        
    }
}
