package b_utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Abi 
 * Archivo: Conexion_MySQL.java 
 * Paquete: utilidades
 * Fecha: 11/12/2016 
 * Hora: 7:58:57 PM
 */
public class Conexion_MySQL {

    /**
     * <b> Método que devuelve la conexion a una base de datos </b> <br >
     *
     * @return retorna la conexion de una bd.
     */
    public static Connection getConexion() {

        Connection conexion = null;

        try {

            /* cargar el controlador */
            Class.forName("com.mysql.jdbc.Driver");

            /* conectar a la bd */
            String url = "jdbc:mysql://localhost/java_mysql_gui";
            String usuario = "root";
            String contrasena = "";
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            //System.out.println("CONEXION REALIZADA CON EXITO A: " + url);

        } catch (ClassNotFoundException | SQLException e) {
            String mensaje = "Error al obtener la conexion.\n\n";
            mensaje += "El error es:\n" + e;
            String titulo = "Conexion_MySQL.getConexion()";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }

        return conexion;
    }

    /**
     *
     * <b>Este método obtiene los resultados de una consulta sql.</b> <br />
     *
     * @param consultaSQL Especificar la consulta sql
     * @return El metodo devuelve los registros obtenidos de la consulta sql
     */
    public static ResultSet getRegistros(String consultaSQL) {
        
        ResultSet resultados = null;
        
        try {
            
            Statement sentencia = getSentencia();
            resultados = sentencia.executeQuery(consultaSQL);
            
        } catch (SQLException e) {
            
            String mensaje = "Ocurrio un problema al obtener los registros.\n" + consultaSQL;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "Error en: Conexion_MySQL.getRegistros(String consultaSQL)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
            
        }
        
        return resultados;
    }

    public static Statement getSentencia() {

        Connection conexion = getConexion();
        Statement sentencia = null;

        try {

            sentencia = conexion.createStatement();

        } catch (SQLException e) {

            String mensaje = "Error al obtener la sentencia.\n\n";
            mensaje += "El error es:\n" + e;
            String titulo = "Conexion_MySQL.getSentencia()";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

        }

        return sentencia;
    }

    /**
     * <b>Método que inserta/actualiza datos mediante una sentencia preparada
     * (PreparedStatement)</b> <br><br>
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
     * @param consultaSQL especificar la consulta sql
     * @return retorna la sentencia preparada
     */
    public static PreparedStatement getSentenciaPreparada(String consultaSQL) {

        Connection conexion = getConexion();
        PreparedStatement sentenciaPreparada = null;

        try {

            sentenciaPreparada = conexion.prepareStatement(consultaSQL, PreparedStatement.RETURN_GENERATED_KEYS);

        } catch (SQLException e) {

            String mensaje = "Error al obtener la sentencia preparada.\n" + consultaSQL;
            mensaje += "\nnEl error es:\n" + e;
            String titulo = "Conexion_MySQL.getSentenciaPreparada(String consultaSQL)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);

        }

        return sentenciaPreparada;
    }

    public static void getUltimoID() {
        
        int ultimoID = 0;
        
        String consultaSQL = "SELECT LAST_INSER_ID()";
        
        Statement sentencia = getSentencia();
        
        try {
            
            ResultSet resultado = sentencia.executeQuery(consultaSQL);
            
            
            
        } catch (SQLException e) {
            
            String mensaje = "Error al obtener el ultimo id.\n" + consultaSQL;
            mensaje += "\nnEl error es:\n" + e;
            String titulo = "Conexion_MySQL.getultimoID()";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
