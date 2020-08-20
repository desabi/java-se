
package c_clases;

import b_utilidades.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Abi
 */
public class Listar {
    
    public static void alumnos() {
       
        String consultaSQL = "SELECT idusuario, nombre, apellidos, edad, telefono FROM usuario";
        
        ResultSet registros = ConexionMySQL.getRegistros(consultaSQL);
        
        try {
            System.out.println("********************************************************************");
            
            while (registros.next()) {
                
                int idUsuario = registros.getInt("idusuario");
                String nombre = registros.getString("nombre");
                String apellidos = registros.getString("apellidos");
                int edad = registros.getInt("edad");
                long telefono = registros.getLong("telefono");
                
                System.out.println(idUsuario + " - " + nombre + " - " + apellidos + " - " + edad + " - " + telefono);
            }
            
            System.out.println("********************************************************************");
            registros.close();
            
        } catch (SQLException e) {
            System.out.println("Error a listar los alumnos: " + e);            
        }       
        
    }
    
    public static void alumno(int idUsuario) {
        
        String consultaSQL = "SELECT idusuario, nombre, apellidos, edad, telefono FROM usuario WHERE idusuario="+idUsuario;
        
        ResultSet registro = ConexionMySQL.getRegistros(consultaSQL);
         
        
        try {
            System.out.println("--------------------------------------------------------------");
            
            while (registro.next()) {
                //int idUsuario = registro.getInt("idusuario");
                String nombre = registro.getString("nombre");
                String apellidos = registro.getString("apellidos");
                int edad = registro.getInt("edad");
                long telefono = registro.getLong("telefono");
                
                System.out.println(idUsuario + " - " + nombre + " - " + apellidos + " - " + edad + " - " + telefono );
            }
            
            System.out.println("--------------------------------------------------------------");
            
            
        } catch (SQLException e) {
            System.out.println("Error al obtener los datos del alumno:\n"+e);
        }
        
    }
    
}
