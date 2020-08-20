
package d_ingresar;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class Agregar_Alumno_B {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear una instancia de Scanner */
        Scanner leer = new Scanner(System.in);
        
        /* 2do: Pedir los datos del alumno */
        System.out.print("Escribe el nombre del alumno: ");
        String nombre = leer.nextLine();
        
        System.out.print("Escribe la fecha de ingreso: ");
        int ingreso = leer.nextInt();
        
        System.out.print("Escribe la fecha de egreso: ");
        int egreso = leer.nextInt();
        
        /* 3ro: Crear la consulta */
        String consultaSQL = "INSERT INTO alumno VALUES(?,?,?,?)";
        
        /* 4to: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaSQL);
        
        try {
            /* 5to: Establecer los datos */
            sentenciaPreparada.setString(1, null);
            sentenciaPreparada.setString(2, nombre);
            sentenciaPreparada.setInt(3, ingreso);
            sentenciaPreparada.setInt(4, egreso);
            
            /* Ejecutar la sentencia */
            int ejecucion = sentenciaPreparada.executeUpdate();
            
            System.out.println("Resultado: " + ejecucion);
            
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            System.out.println("Error al agregar: \n" + e);
        }
        
    }
}
