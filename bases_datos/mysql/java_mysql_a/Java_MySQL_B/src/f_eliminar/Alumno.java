package f_eliminar;

import b_utilidades.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Abi
 */
public class Alumno {

    /* Metodo que obtiene todos los alumnos de tabla */
    public static void listarAlumnos() {

        /* Crear la consulta */
        String consultaSQL = "SELECT idalumno, nombre, ingreso, egreso FROM alumno";

        /* Obtener los registros */
        ResultSet registros = ConexionMySQL.getRegistros(consultaSQL);

        /* Recorrer los registros */
        try {
            System.out.println("--------------------------------------------------------");
            while (registros.next()) {

                int idAlumno = registros.getInt("idalumno");
                String nombre = registros.getString("nombre");
                int ingreso = registros.getInt("ingreso");
                int egreso = registros.getInt("egreso");

                System.out.println(idAlumno + " - " + nombre + " - " + ingreso + " - " + egreso);
            }
            System.out.println("--------------------------------------------------------");
            registros.close();

        } catch (SQLException e) {
            System.out.println("Error al listar los alumnos: \n " + e);
        }

    }

    /* Metodo que obtiene los datos de un alumno en base a su id */
    public static void listarAlumno(int idIngresado) {

        /* Crear la consulta */
        String consultaSQL = "SELECT idalumno, nombre, ingreso, egreso FROM alumno WHERE idalumno=" + idIngresado;
        
        /* Obtener el registro */
        ResultSet registro = ConexionMySQL.getRegistros(consultaSQL);

        try {
            System.out.println("***********************************************");
            while(registro.next()) {
                
                int idAlumno = registro.getInt("idalumno");
                String nombre = registro.getString("nombre");
                int ingreso = registro.getInt("ingreso");
                int egreso = registro.getInt("egreso");
                
                System.out.println(idAlumno + " - " + nombre + " - " + ingreso + " - " + egreso);
            }
            System.out.println("***********************************************");
        } catch (SQLException e) {
            System.out.println("Error al listar el alumno: \n " + e);
        }
    }

}
