
package c_usuario;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Insertar {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear los objetos */
        Scanner leer = new Scanner(System.in);
        Usuario elUsuario = new Usuario();
        
        /* 2do: Pedir los datos */
        System.out.print("Escribe el nombre del usuario: ");
        String elNombre = leer.next();
        
        System.out.print("Escribe la edad del usuario: ");
        int laEdad = leer.nextInt();
        
        System.out.print("Escribe la estatura del usuario: ");
        float laEstatura = leer.nextFloat();
        
        System.out.print("Escribe el telefono del usuario: ");
        long elTelefono = leer.nextLong();
        
        /* 3ro: Colocar datos al objeto */
        elUsuario.setNombre(elNombre);
        elUsuario.setEdad(laEdad);
        elUsuario.setEstatura(laEstatura);
        elUsuario.setTelefono(elTelefono);
        
        /* 4to: Crear la consulta */
        String consultaINSERT = "INSERT INTO usuario VALUES (?, ?, ?, ?, ?)";
        
        /* 5to: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaINSERT);
        
        try {
            
            /* 6to: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, null);                    // id del usuario
            sentenciaPreparada.setString(2, elUsuario.getNombre() );  // nombre del usuario
            sentenciaPreparada.setInt(3, elUsuario.getEdad() );       // edad
            sentenciaPreparada.setFloat(4, elUsuario.getEstatura() ); // estatura
            sentenciaPreparada.setLong(5, elUsuario.getTelefono() );  // telefono
            
            /* 7mo: Ejecutar la sentencia preparada */
            int insercion = sentenciaPreparada.executeUpdate();
            
            /* 8vo: Imprimir el resultado de la insercion */
            System.out.println("insercion = " + insercion);
            
            /* 9no: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            /* Imprimir mensajes en caso de que haya ocurrido un error al insertar */
            System.out.println("Error al insertar el usuario.\n\n");
            System.out.println("\nEl error es:\n\n"+e);
            
        }
        
    }
    
}
