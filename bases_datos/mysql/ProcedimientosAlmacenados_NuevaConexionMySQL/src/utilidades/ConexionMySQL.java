package utilidades;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * Autor: Abi
 *
 */
public class ConexionMySQL {

    private static Connection getConexion() {

        Connection conexion = null;

        try {

            /* 1ro: Cargar el controlador */
            Class.forName("com.mysql.jdbc.Driver");

            /* 2do: Conectar a la bd */
            String url = "jdbc:mysql://localhost/insertar_en_varias_tablas";
            String usuario = "root";
            String contrasena = "";

            conexion = DriverManager.getConnection(url, usuario, contrasena);
            //System.out.println("CONEXION REALIZADA CON EXITO.");

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Error en: ConexionMySQL.getConexion()");
            System.out.println("\n\nEl error es: " + e);

        }

        return conexion;

    }


    /**
     * <b>Método que inserta/actualiza/elimina datos mediante una sentencia
     * preparada (PreparedStatement)</b> <br><br>
     *
     * String sql = "INSERT INTO tabla VALUES (?, ?, ?, ?, ...)"; <br> <br>
     *
     * String sql = "UPDATE tabla SET columna1=?, columna2=?, columna3=? WHERE
     * id=?"; <br> <br>
     * String sql = "UPDATE tabla SET columna1=?, columna2=?, columna3=? WHERE
     * columnax=?"; <br> <br>
     *
     * String sql = "DELETE FROM tabla WHERE id=?; <br> <br>
     * String sql = "DELETE FROM tabla WHERE campox=?"; <br> <br>
     *
     * PreparedStatement sentencia = ConexionMySQL.getSentenciaPreparada(String
     * sql);
     *
     * @param consulta especificar la consulta sql (INSERT, UPDATE o DELETE)
     * @return retorna la sentencia preparada
     */
    public static PreparedStatement getSentenciaPreparada(String consulta) {

        /* 1ro: Obtener la conexion */
        Connection conexion = getConexion();

        /* 2do: Crear la sentencia preparada */
        PreparedStatement sentenciaPreparada = null;

        try {

            /* 3ro: Obtener la sentencia preparada a partir de la consulta*/
            sentenciaPreparada = conexion.prepareStatement(consulta);

        } catch (SQLException e) {

            System.out.println("Error en:\n\nConexionMySQL.getSentenciaPreparada(String consulta)");
            System.out.println("\n\nEl error es:\n\n" + e);

        }

        return sentenciaPreparada;

    }

    public static CallableStatement getCallableStatement(String consulta) {
        
        /* 1ro: Obtener la conexion */
        Connection conexion = getConexion();
        
        /* Crear el CallableStatement */
        CallableStatement cs = null;
        
        try {
            
            cs = conexion.prepareCall(consulta);
            
        } catch (SQLException e) {
            System.out.println("e = " + e);
        }
        
        return cs;
    }
    
}
