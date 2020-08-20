
package c_usuario;

import b_utilidades.ConexionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Listar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear el objeto */
        Usuario elUsuario = new Usuario();
        
        /* 2do: Crear la consulta */
        String consultaSELECT = "SELECT idusuario, nombre, edad, estatura, telefono FROM usuario";
        
        /* 3ro: Obtener los registros */
        ResultSet registros = ConexionMySQL.getRegistros(consultaSELECT);
        
        try {
            
            /* 4to: Recorrer los registros */
            while (registros.next()) {
                
                /* 5to: Obtener los datos */
                int idUsuario = registros.getInt("idusuario");
                String nombre = registros.getString("nombre");
                int edad = registros.getInt("edad");
                float estatura = registros.getFloat("estatura");
                long telefono = registros.getLong("telefono");
                
                /* 6to: Colocar los datos al objeto */
                elUsuario.setIdUsuario(idUsuario);
                elUsuario.setNombre(nombre);
                elUsuario.setEdad(edad);
                elUsuario.setEstatura(estatura);
                elUsuario.setTelefono(telefono);
                
                /* 7mo: Imprimir los datos */
                System.out.print(elUsuario.getIdUsuario() + " - ");
                System.out.print(elUsuario.getNombre() + " - ");
                System.out.print(elUsuario.getEdad() + " - ");
                System.out.print(elUsuario.getEstatura() + " - ");
                System.out.print(elUsuario.getTelefono() + " - ");
                System.out.println();
                
            }
            
            /* Cerrar los registros */
            registros.close();
            
        } catch (SQLException e) {
            
             /* Imprimir mensajes en caso de que haya ocurrido un error al listar */
            System.out.println("Error al listar los usuarios.\n\n");
            System.out.println("\nEl error es:\n\n"+e);
            
        }
    }
}
