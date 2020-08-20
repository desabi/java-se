
package f_eliminar;

import b_utilidades.ConexionMySQL;
import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class Eliminar_Alumno_A {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Alumno.listarAlumnos();
        
        System.out.print("Escribe el id del alumno a eliminar: ");
        int idIngresado = leer.nextInt();
        
        String consultaSQL = "DELETE FROM alumno WHERE idalumno="+idIngresado;
        
        boolean eliminado = ConexionMySQL.eliminar(consultaSQL);
        System.out.println("Registro eliminado: " + eliminado);
        
        Alumno.listarAlumnos();
        
    }
}
