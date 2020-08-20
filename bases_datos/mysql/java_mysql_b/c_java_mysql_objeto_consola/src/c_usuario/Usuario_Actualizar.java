
package c_usuario;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Actualizar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear los objetos */
        Scanner leer = new Scanner(System.in);
        Usuario elUsuario = new Usuario();
        
        /* 2do: Pedir el id del usuario a actualizar */
        System.out.print("Escribe el id del Usuario a actualizar: ");
        int idUsuario = leer.nextInt();
        
        System.out.print("Escribe el nuevo nombre: ");
        String nombreNuevo = leer.next();
        
        System.out.print("Escribe la nuevo edad: ");
        int edadNueva = leer.nextInt();
        
        System.out.print("Escribe la nuevo estatura: ");
        float estaturaNueva = leer.nextFloat();
        
        System.out.print("Escribe el nuevo telefono: ");
        long telefonoNuevo = leer.nextLong();
        
        /* 3ro: Colocar datos al objeto */
        elUsuario.setIdUsuario(idUsuario);
        elUsuario.setNombre(nombreNuevo);
        elUsuario.setEdad(edadNueva);
        elUsuario.setEstatura(estaturaNueva);
        elUsuario.setTelefono(telefonoNuevo);
        
        /* 4to: Crear la consulta */
        String consultaUPDATE = "UPDATE usuario SET nombre=?, edad=?, estatura=?, telefono=? WHERE idusuario=?";
        
        /* 5to: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaUPDATE);
        
        try {
            
            /* 6to: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, elUsuario.getNombre() );
            sentenciaPreparada.setInt(2, elUsuario.getEdad() );
            sentenciaPreparada.setFloat(3, elUsuario.getEstatura() );
            sentenciaPreparada.setLong(4, elUsuario.getTelefono() );
            sentenciaPreparada.setInt(5, elUsuario.getIdUsuario() );
            
            /* 7mo: Ejecutar la sentencia preparada */
            int actualizacion = sentenciaPreparada.executeUpdate();
            
            /* 8vo: Imprimir el resultado de la insercion */
            System.out.println("actualizacion = " + actualizacion);
            
            /* 9no: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
             /* Imprimir mensajes en caso de que haya ocurrido un error al actualizar */
            System.out.println("Error al actualizar el usuario.\n\n");
            System.out.println("\nEl error es:\n\n"+e);
            
        }
                
    }
}
