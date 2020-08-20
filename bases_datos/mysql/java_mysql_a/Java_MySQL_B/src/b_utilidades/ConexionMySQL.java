
package b_utilidades;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abi
 * Archivo: ConexionMySQL.java
 * Paquete: utilidades
 * Fecha: 21/07/2015
 * Hora: 10:57:57 PM
 */
public class ConexionMySQL {
    
    /**
     * <b> Método que devuelve la conexion a una base de datos </b>
     * <br />
     * 
     * @return retorna la conexion de una bd.
     */
    public static Connection getConexion(){
       Connection conexion = null; 
        try {
            /* cargar el controlador */
            Class.forName("com.mysql.jdbc.Driver");
            
            /* conectar a la bd */
            String url = "jdbc:mysql://localhost/java_mysql";
            String usuario = "root";
            String contrasena = "";
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            //System.out.println("CONEXION REALIZADA CON EXITO.");
            
        } catch (ClassNotFoundException | SQLException e) {
            String mensaje = "Error al obtener la conexion.\n\n";
            mensaje += "El error es:\n" + e;
            String titulo = "ConexionMySQL.getConexion()";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
      
        return conexion;
    }
    
    private static Statement getSentencia() {
        Connection conexion = getConexion();
        Statement sentencia = null;
        try {
            sentencia = conexion.createStatement();
        } catch (Exception e) {
            String mensaje = "Error al obtener la sentencia.\n\n";
            mensaje += "El error es:\n" + e;
            String titulo = "ConexionMySQL.getSentencia()";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
        return sentencia;
    }
    
    /**
     * <b>Método que inserta un registro en una tabla primaria</b> <br /><br />
     * String sql = "INSERT INTO tabla VALUES (NULL, 'valor1', valor2, 'valor3', ...)";  <br /> <br />
     * int idGenerado = ConexionMySQL.insertar(sql);
     * 
     * @param sql especificar la consulta sql
     * @return retorna el id generado por el registro recien insertado
     */
    public static int insertar(String sql) {
        int idGenerado = 0;
        try {
            Statement sentencia = getSentencia();
            int ejecucion = sentencia.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet clavesGeneradas = sentencia.getGeneratedKeys();
                    
            while (clavesGeneradas.next()) {                
                idGenerado = clavesGeneradas.getInt(1);
            }
            
            System.out.println("Insercion: " + ejecucion);
            System.out.println("Id Generado: " + idGenerado);
            
            sentencia.close();
            clavesGeneradas.close();
        } catch (Exception e) {
            String mensaje = "Error al insertar.\n" + sql;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "ConexionMySQL.insertar(String sql)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
        return idGenerado;
    }
    
    /**
     * <b>Metodo que agrega un registro en una tabla secundaria </b> <br /> <br />
     * Tambien funciona con una tabla primaria pero no devuelve el id <br /> <br />
     * 
     * String sqlx = "INSERT INTO tabla VALUES (idGenerado, 'valor1', valor2, 'valor3', ...)"; <br /><br />
     * boolean agregado = ConexionMySQL.agregar(sqlx);
     * 
     * 
     * @param sql especificar la consulta sql
     * @return devuelve true si el registro se agrego correctamente, false si no se agrego.
     */
    public static boolean agregar(String sql) {
        boolean registroAgregado = false;
        try {
            Statement sentencia = getSentencia();
            int ejecucion = sentencia.executeUpdate(sql);
            System.out.println("Insercion: " + ejecucion);
            
            if (ejecucion == 1) {
                registroAgregado = true;
            }
            sentencia.close();
        } catch (Exception e) {
            String mensaje = "Error al agregar.\n" + sql;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "ConexionMySQL.agregar(String sql)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
            registroAgregado = false;
        }
        return registroAgregado;
    }
    
    /**
     * <b>Método que inserta/actualiza datos mediante una sentencia preparada (PreparedStatement)</b> <br /><br />
     * 
     * String sql = "INSERT INTO tabla VALUES (?, ?, ?, ?, ...)"; <br /> <br/>
     * 
     * String sql = "UPDATE tabla SET columna1=?, columna2=?, columna3=? WHERE id=?"; <br/> <br />
     * String sql = "UPDATE tabla SET columna1=?, columna2=?, columna3=? WHERE columnax=?"; <br/> <br />
     * 
     * String sql = "DELETE FROM tabla WHERE id=?; <br /> <br />
     * String sql = "DELETE FROM tabla WHERE campox=?"; <br /> <br />
     * 
     * PreparedStatement sentencia = ConexionMySQL.getSentenciaPreparada(String sql);
     * 
     * @param sql especificar la consulta sql
     * @return retorna la sentencia preparada
     */
    public static PreparedStatement getSentenciaPreparada(String sql){
        Connection conexion = getConexion();
        PreparedStatement sentenciaPreparada = null;   
        try {
            sentenciaPreparada = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        } catch (Exception e) {
            String mensaje = "Error al obtener la sentencia preparada.\n" + sql;
            mensaje += "\nnEl error es:\n" + e;
            String titulo = "ConexionMySQL.getSentenciaPreparada(String sql)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
        
        return sentenciaPreparada;
    }
    
    /**
     * <b>Método que obtiene el id generado por una sentencia preparada (PreparedStatemente)
     * al insertar un registro </b> <br /> <br />
     * 
     * int idGenerado = ConexionMySQL.getIdGenerado(PreparedStatement sentenciaPreparada); <br />
     * 
     * @param sentenciaPreparada especificar la sentencia preparada
     * @return retorna el id generado por la sentencia preparada
     */
    public static int getIdGenerado(PreparedStatement sentenciaPreparada) {
        int idGenerado = 0;
        try {
            ResultSet clavesGeneradas = sentenciaPreparada.getGeneratedKeys();
            while (clavesGeneradas.next()) {                
                idGenerado = clavesGeneradas.getInt(1);
            }
            clavesGeneradas.close();
        } catch (Exception e) {
            String mensaje = "Error al obtener el id generado.\n";
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "ConexionMySQL.getIdGenerado(PreparedStatement sentenciaPreparada)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
        return idGenerado;
    }
    
    /**
     * <b>Método que actualiza un registro </b> <br /><br />
     * String sql = "UPDATE tabla SET columna1='valorNuevoA', columna2=ValorNuevoB WHERE id=numero"; <br /><br/>
     * String sql = "UPDATE tabla SET columna1='valorNuevoA', columna2=ValorNuevoB WHERE columnax=valorx"; <br /> 
     * 
     * @param sql especificar la consulta sql de actualizacion.
     * @return retorna true si el registro se actualizo correctamente, false si no se actualizo.
     */
    public static boolean actualizar(String sql) {
        boolean registroActualizado = false;
        Statement sentencia = getSentencia();
        try {
            int ejecucion = sentencia.executeUpdate(sql);
            System.out.println("Actualizacion: " + ejecucion);
            if (ejecucion == 1) {
                registroActualizado = true;
            }
            sentencia.close();
        } catch (Exception e) {
            String mensaje = "Error al actualizar.\n" + sql;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "ConexionMySQL.actualizar(String sql)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
            registroActualizado = false;
        }
        
        return registroActualizado;
    }
    
    /**
     * <b>Método que elimina un registro de una tabla </b> <br /> <br />
     * 
     * String sql = "DELETE FROM tabla where id=numero"; <br /> <br />
     * String sql = "DELETE FROM tabla WHERE campox=valorx"; <br /> <br />
     * 
     * @param sql especificar la consulta sql de eliminacion
     * @return return true si se elimino el registro, false si no se elimino.
     */
    public static boolean eliminar(String sql) {
        boolean registroEliminado = false;
        Statement sentencia = getSentencia();

        try {
            int ejecucion = sentencia.executeUpdate(sql);
            System.out.println("Eliminacion: "+ejecucion);
            
            if (ejecucion == 1) {
                registroEliminado = true;
            }
        } catch (Exception e) {
            String mensaje = "Error al eliminar.\n" + sql;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "ConexionMySQL.eliminar(String sql)";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
            registroEliminado = false;
        }
        
        return registroEliminado;
    }
    
    /**
     * 
     * <b>Este método obtiene los resultados de una consulta sql.</b> <br />
     *  
     * @param sql Especificar la consulta sql
     * @return El metodo devuelve los registros obtenidos de la consulta sql
     */
    public static ResultSet getRegistros(String sql){
        ResultSet resultados = null;
        try {
            Statement sentencia = getSentencia();
            resultados = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            String mensaje = "Ocurrio un problema al obtener los registros.\n" + sql;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "Error en: ConexionMySQL.getRegistros()";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
        return resultados;
    }
    
    /**
     * <b>Método que obtiene los meta datos de la conexion a la base </b> <br />
     * 
     * @return retorna los meta datos de la conexion a la base
     */
    public static DatabaseMetaData getMetaDatosDB() {
        Connection conexion = getConexion();
        DatabaseMetaData metaDatosBD = null;
        
        try {
            metaDatosBD = conexion.getMetaData();
        } catch (Exception e) {
            String mensaje = "Ocurrio un problema al obtener los metadatos de la Base.\n";
            mensaje += "\nEl error es:\n" + e;
            String titulo = "Error en: ConexionMySQL.getMetaDatosBD()";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
        
        return metaDatosBD;
    }
    
    /**
     * <b>Método que obtiene los meta datos de la consulta sql </b> <br/>
     * 
     * @param sql especificar la consulta sql
     * @return retorna los meta datos de la consulta
     */
    public static ResultSetMetaData getMetaDatosResultados(String sql) {
        Statement sentencia = getSentencia();
        ResultSetMetaData metaDatosResultados = null;
        
        try {
            ResultSet resultados = sentencia.executeQuery(sql);
            metaDatosResultados = resultados.getMetaData();
        } catch (Exception e) {
            String mensaje = "Ocurrio un problema al obtener los metadatos de los resultados.\n";
            mensaje += "\nEl error es:\n" + e;
            String titulo = "Error en: ConexionMySQL.getMetaDatosResultados()";
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
        
        return metaDatosResultados;
    }
    
    /**
     * Este método llena una tabla JTable de acuerdo a una consulta sql.
     * <br><br>
     *  
     * @param tabla Especificar el nombre de la tabla JTable.
     * @param consultaSQL Especificar la consulta sql con la que se llenara la tabla.
     */
    public static void llenarTabla(JTable tabla, String consultaSQL){
        ResultSet conjuntoResultados;
        ResultSetMetaData metaDatos;
        int numeroColumnas;
        try {
            Statement sentencia = getSentencia();
            
            conjuntoResultados = sentencia.executeQuery(consultaSQL);
            metaDatos = (ResultSetMetaData) conjuntoResultados.getMetaData();
            numeroColumnas = metaDatos.getColumnCount();

            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

            while(conjuntoResultados.next()){
                Object filas[] = new Object[numeroColumnas];
                for (int i = 0; i < numeroColumnas; i++) {
                    filas[i] = conjuntoResultados.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
            conjuntoResultados.close();
            sentencia.close();
            
        } catch (SQLException e) {
            String mensaje = "Ocurrio un problema al llenar la tabla:\n" + consultaSQL;
            mensaje += "\n\nEl error es:\n" + e;
            String titulo = "Error en: ConexionMySQL.llenarTabla()";
            
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
        }
    }
    
   /**
     * El método vacia una tabla JTable y despues la llena de conforme a la consulta sql.
     * 
     * @param tabla Especificar el nombre de la tabla JTable.
     * @param consultaSQL Escribir la consulta sql con la que se llenara la tabla.
     */
    public static void actualizarTabla(JTable tabla, String consultaSQL){
        ((DefaultTableModel) tabla.getModel()).setNumRows(0);
        llenarTabla(tabla, consultaSQL);
    }
}