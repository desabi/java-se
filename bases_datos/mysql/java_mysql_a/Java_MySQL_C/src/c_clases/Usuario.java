
package c_clases;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Abi
 */
public class Usuario {
    
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private int edad;
    private long telefono;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    public void registrarA() {
        String consultaSQL = "INSERT INTO usuario VALUES (NULL, '"+nombre+"', '"+apellidos+"', "+edad+", "+telefono+")";
        ConexionMySQL.agregar(consultaSQL);
    }
    
    public void registrarB() {
        String consultaSQL = "INSERT INTO usuario VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaSQL);
        
        try {
            
            sentenciaPreparada.setString(1, null);
            sentenciaPreparada.setString(2, nombre);
            sentenciaPreparada.setString(3, apellidos);
            sentenciaPreparada.setInt(4, edad);
            sentenciaPreparada.setLong(5, telefono);
            
            int ejecucion = sentenciaPreparada.executeUpdate();
            System.out.println("Agregado: " + ejecucion);
            
            
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            System.out.println("Error en registrarB():\n"+e);
        }
    }
    
    public void actualizarA(int idIngresado) {
        
        String consultaSQL = "UPDATE usuario SET nombre='"+nombre+"',"
                + " apellidos='"+apellidos+"', edad="+edad+","
                + " telefono="+telefono+" WHERE idusuario = " + idIngresado;
        
        ConexionMySQL.actualizar(consultaSQL);
    }
    
    public void actualizarB(int idIngresado) {
        
        String consultaSQL = "UPDATE usuario SET nombre=?,apellidos=?, edad=?, telefono=? WHERE idusuario=?";
        
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaSQL);
        
        try {
            
            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setString(2, apellidos);
            sentenciaPreparada.setInt(3, edad);
            sentenciaPreparada.setLong(4, telefono);
            sentenciaPreparada.setInt(5, idIngresado);
            
            int ejecucion = sentenciaPreparada.executeUpdate();
            System.out.println("ejecucion = " + ejecucion);
            
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            System.out.println("Error en actualizarB():\n"+e);
        }
    }
    
    public void eliminarA(int idIngresado) {
        
        String consultaSQL = "DELETE FROM usuario WHERE idusuario="+idIngresado;
        
        ConexionMySQL.eliminar(consultaSQL);
    }
    
    public void eliminarB(int idIngresado) {
        
        String consultaSQl = "DELETE FROM usuario WHERE idusuario=?";
        
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaSQl);
        
        try {
            sentenciaPreparada.setInt(1, idIngresado);
            
            int ejecucion = sentenciaPreparada.executeUpdate();
            System.out.println("ejecucion = " + ejecucion);
            
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            System.out.println("Error en: Usuario.eliminarA()");
            System.out.println("El error es: " + e);
        }
        
    }
    
}