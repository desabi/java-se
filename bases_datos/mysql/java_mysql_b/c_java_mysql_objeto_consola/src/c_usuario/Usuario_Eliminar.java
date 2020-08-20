
package c_usuario;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Eliminar {

    public static void main(String[] args) {
        
        /* 1ro: Crear los objetos */
        Scanner leer = new Scanner(System.in);
        Usuario elUsuario = new Usuario();
        
        /* 2do: Pedir el id del usuario a eliminar */
        System.out.print("Escribe el id del usuario a eliminar: ");
        int idUsuario = leer.nextInt();
        
        /* 3ro: Colocar datos al objeto */
        elUsuario.setIdUsuario(idUsuario);
        
        /* 4to: Crear la consulta */
        String consultaDELETE = "DELETE FROM usuario WHERE idusuario = ? ";
        
        /* 5to: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaDELETE);
        
        try {
            
            /* 6to: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setInt(1, idUsuario);
            
            /* 7mo: Ejecutar la sentencia preparada */
            int eliminacion = sentenciaPreparada.executeUpdate();
            
            /* 8vo: Imprimir el resultado de la eliminacion */
            System.out.println("eliminacion = " + eliminacion);
            
            /* 9no: Cerra la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
             /* Imprimir mensajes en caso de que haya ocurrido un error al eliminar */
            System.out.println("Error al eliminar el usuario.\n\n");
            System.out.println("\nEl error es:\n\n"+e);
            
        }
    }
}
