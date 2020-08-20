
package c_usuario;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class UsuarioDAO {
    
    public void listar() {
        
        /* Crear la consulta */
        String consultaSELECT = "SELECT idusuario, nombre, edad, estatura, telefono FROM usuario";
        
        /* Obtener los registros */
        ResultSet registros = ConexionMySQL.getRegistros(consultaSELECT);
        
        try {
            
            /* Recorrer los registros */
            while (registros.next()) {
                
                /* Obtener los datos de la base */
                int idUsuario = registros.getInt("idusuario");
                String nombre = registros.getString("nombre");
                int edad = registros.getInt("edad");
                float estatura = registros.getFloat("estatura");
                long telefono = registros.getLong("telefono");
                
                System.out.print(idUsuario + " - ");
                System.out.print(nombre + " - ");
                System.out.print(edad + " - ");
                System.out.print(estatura + " - ");
                System.out.print(telefono + " - \n");
                
            }
            
            registros.close();
            
        } catch (SQLException e) {
            System.out.println("Error en: UsuarioDAO.listar() \n\n");
            System.out.println("El error es:\n\n"+e);
        }
    }
    
    public void insertar(Usuario elUsuario) {
        
        /* Obtener los datos de elUsuario */
        String nombre = elUsuario.getNombre();
        int edad = elUsuario.getEdad();
        float estatura = elUsuario.getEstatura();
        long telefono = elUsuario.getTelefono();
        
        /* Crear la consulta */
        String consultaINSERT = "INSERT INTO usuario VALUES (?, ?, ?, ?, ?)";
        
        /* Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaINSERT);
        
        try {
            
            /* Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, null);        
            sentenciaPreparada.setString(2, nombre);
            sentenciaPreparada.setInt(3, edad);
            sentenciaPreparada.setFloat(4, estatura);
            sentenciaPreparada.setLong(5, telefono);
            
            /* Ejecutar la sentencia preparada */
            int insercion = sentenciaPreparada.executeUpdate();
            
            /* Imprimir el resultado de la insercion */
            System.out.println("insercion = " + insercion);
            
            /* Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            System.out.println("Error en: UsuarioDAO.insertar(Usuario elUsuario)");
            System.out.println("\n\nEl error es:\n\n"+e);
        }
        
    }
    
    public void actualizar(Usuario elUsuario) {
        
        /* Crear la consulta */
        String consultaUPDATE = "UPDATE usuario SET nombre = ?, edad = ?, estatura = ?, telefono = ? WHERE idusuario = ?";
        
        /* Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaUPDATE);
        
        try {
            
            /* Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, elUsuario.getNombre() );
            sentenciaPreparada.setInt(2, elUsuario.getEdad() );
            sentenciaPreparada.setFloat(3, elUsuario.getEstatura() );
            sentenciaPreparada.setLong(4, elUsuario.getTelefono() );
            sentenciaPreparada.setInt(5, elUsuario.getIdUsuario() );
            
            /* Ejecutar la sentencia preparada */
            int actualizacion = sentenciaPreparada.executeUpdate();
            
            /* Imprimir el resultado de la actualizacion */
            System.out.println("actualizacion = " + actualizacion);
            
            /* Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            System.out.println("Error en: UsuarioDAO.actualizar(Usuario elUsuario)");
            System.out.println("\n\nEl error es:\n\n"+e);
        }
    }
    
    public void eliminar(int idUsuario) {
        
        /* Crear la consulta */
        String consultaDELETE = "DELETE FROM usuario WHERE idUsuario = ? "  ;
        
        /* Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaDELETE);
        
        try {
            
            /* Colocar datos a la sentencia preparada */
            sentenciaPreparada.setInt(1, idUsuario);
            
            /* Ejecutar la sentencia preparada */
            int eliminacion = sentenciaPreparada.executeUpdate();
            
            /* Imprimir el resultado de la eliminacion */
            System.out.println("eliminacion = " + eliminacion);
            
        } catch (SQLException e) {
            System.out.println("Error en: UsuarioDAO.eliminar(int idUsuario)");
            System.out.println("\n\nEl error es:\n\n");
        }
        
    }
    
}