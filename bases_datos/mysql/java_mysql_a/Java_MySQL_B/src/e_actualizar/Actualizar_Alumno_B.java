
package e_actualizar;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class Actualizar_Alumno_B {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Alumno.listarAlumnos();
        
        System.out.print("Escrib el id del alumno a actualizar: ");
        int idIngresado = leer.nextInt();
        
        Alumno.listarAlumno(idIngresado);
        
        
        System.out.print("Escribe el nuevo nombre: ");
        String nombre = leer.next();
        
        System.out.print("Escribe el nuevo año de ingreso: ");
        int ingreso = leer.nextInt();
        
        System.out.print("Escribe el nuevo año de egreso: ");
        int egreso = leer.nextInt();
        
        String consultaSQL = "UPDATE alumno SET nombre=?, ingreso=?, egreso=? WHERE idalumno=?";
        
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaSQL);
        
        try {
            
            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setInt(2, ingreso);
            sentenciaPreparada.setInt(3, egreso);
            sentenciaPreparada.setInt(4, idIngresado);
            
            int ejecucion = sentenciaPreparada.executeUpdate();
            System.out.println("Registro actualizado: " + ejecucion);
            
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar:\n" + e);
        }
        
        Alumno.listarAlumnos();
        
    }
}

