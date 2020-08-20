package c_listar;


import b_utilidades.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Abi
 */
public class Listar_Alumnos {

    public static void main(String[] args) {

        /* 1ro: Crear la consulta para obtener los alumnos */
        String consulta = "SELECT idalumno, nombre, ingreso, egreso FROM alumno";

        /* 2do: Obtener los registros a partir de la consulta */
        ResultSet registros = ConexionMySQL.getRegistros(consulta);

        /* 3ro: Recorrer todos registros e imprimir */
        try {

            while (registros.next()) {
                
                int idAlumno = registros.getInt("idalumno");
                String nombre = registros.getString("nombre");
                int ingreso = registros.getInt("ingreso");
                int egreso = registros.getInt("egreso");

                /* 4to: Imprimir */
                System.out.println(idAlumno + " " + nombre + " " + ingreso + " " + egreso);
                
            }
            /* 5to: Cerrar los registros */
            registros.close();
        } catch (SQLException e) {
            System.out.println("c_listar error es: " + e);
        }

    }
}
