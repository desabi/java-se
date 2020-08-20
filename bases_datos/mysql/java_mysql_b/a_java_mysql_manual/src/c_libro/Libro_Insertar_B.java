package c_libro;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * Autor: Abi
 */
public class Libro_Insertar_B {

    public static void main(String[] args) {

        /* 1ro: Crear la consulta */
        String consultaINSERT = "INSERT INTO libro VALUES (?, ?, ?, ?)";

        /* 2do: Obtener la sentencia preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaINSERT);

        try {

            /* 3ro: Colocar los datos a la sentencia preparada */
            sentenciaPreparada.setString(1, null);      // id del libro
            sentenciaPreparada.setString(2, "Java 8");  // nombre del libro
            sentenciaPreparada.setDouble(3, 895.99);    // precio del libro
            sentenciaPreparada.setInt(4, 567);          // paginas del libro
            
            /* 4to: Ejecutar la sentencia preparada */
            int insercion = sentenciaPreparada.executeUpdate();
            
            /* 5to: Imprimir si el usuario fue agregado o no*/
            /* 1: si */
            System.out.println("insercion = " + insercion);
            
            /* 6to: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error al insertar el libro.");
            System.out.println("\n\nEl error es:\n\n " + e);
            
        }

    }
}
