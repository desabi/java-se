
package e_actualizar;

import b_utilidades.ConexionMySQL;
import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class Actualizar_Alumno_A {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        /* 1 Mostrar los alumno */
        Alumno.listarAlumnos();
        
        /* 2: Pedir el id del alumno */
        System.out.print("Escribe el id del alumno a actualizar: ");
        int idIngresado = leer.nextInt();
        
        /* 3: ver datos del alumno */
        Alumno.listarAlumno(idIngresado);
        
        /* 4: Pedir los nuevos datos */
        System.out.print("Escribe el nuevo nombre: ");
        String nombre = leer.next();
        
        System.out.print("Escribe el año de ingreso: ");
        int ingreso = leer.nextInt();
        
        System.out.print("Escribe el año de egreso: ");
        int egreso = leer.nextInt();
        
        /* 5: CRear la consulta para actualizar */
        String consultaSQL = "UPDATE alumno SET nombre= '"+ nombre +"', ingreso=" +ingreso + ", egreso="+egreso+" WHERE idalumno=" + idIngresado;
        
        /* 6: Ejecutar la consulta */
        boolean actualizado = ConexionMySQL.actualizar(consultaSQL);
        
        //System.out.println("Registro actualizado: " + actualizado);
        
        /* 7: Listar alumnos */
        Alumno.listarAlumnos();
        
    }
}
