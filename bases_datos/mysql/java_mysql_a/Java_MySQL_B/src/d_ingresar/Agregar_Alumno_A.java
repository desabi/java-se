
package d_ingresar;

import b_utilidades.ConexionMySQL;
import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class Agregar_Alumno_A {
    
    public static void main(String[] args) {
        
        
        /* 1ro: Crear una instancia de Scanner */
        Scanner leer = new Scanner(System.in);
        
        /* 2do: Pedir el nombre del alumno */
        System.out.print("Escribe el nombre del alumno: ");
        String nombre = leer.nextLine();
        
        System.out.print("Escribe la fecha de ingreso: ");
        int ingreso = leer.nextInt();
        
        System.out.print("Escribe la fecha de egreso: ");
        int egreso = leer.nextInt();
        
        /* 3ro: Crear la consulta */
        String consulta = "INSERT INTO alumno VALUES(NULL, '"+nombre+"', "+ingreso+", "+egreso+")";
        
        /* 4to: Ejecutar la consulta */
        ConexionMySQL.agregar(consulta);
        
        
    }
}
