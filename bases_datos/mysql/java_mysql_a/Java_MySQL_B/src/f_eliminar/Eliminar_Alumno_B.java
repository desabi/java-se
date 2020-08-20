package f_eliminar;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class Eliminar_Alumno_B {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Alumno.listarAlumnos();

        System.out.print("Escribe el id del alumno a eliminar: ");
        int idIngresado = leer.nextInt();

        String consultaSQL = "DELETE FROM alumno WHERE idalumno = ?";

        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaSQL);

        try {

            sentenciaPreparada.setInt(1, idIngresado);

            int ejecucion = sentenciaPreparada.executeUpdate();

            System.out.println("Resultado de la eliminacion: " + ejecucion);

            sentenciaPreparada.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el alumno: " + e);
        }
        
        Alumno.listarAlumnos();
        
    }
}
