package c_libro;

import b_utilidades.ConexionMySQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * Autor: Abi
 */
public class Libro_Actualizar_B {

    public static void main(String[] args) {

        /* 1ro: Crear la consulta */
        String consultaUPDATE = "UPDATE libro SET titulo=?, precio=?, paginas=? WHERE idlibro=?";

        /* 2do: Obtener la sentencia Preparada */
        PreparedStatement sentenciaPreparada = ConexionMySQL.getSentenciaPreparada(consultaUPDATE);

        try {
            
            /* 3ro: Colocar datos a la sentencia preparada */
            sentenciaPreparada.setString(1, "Algebra");   // nuevo titulo
            sentenciaPreparada.setDouble(2, 769.80);      // nuevo precio
            sentenciaPreparada.setInt(3, 1240);           // nuevas paginas
            
            /* 4to: Ejecutar la consulta */
            int actualizacion = sentenciaPreparada.executeUpdate();
            
            /* 5to: Imprimir el resultado de la actualizacion */
            /* 1: si*/
            System.out.println("actualizacion = " + actualizacion);
            
            /* 6to: Cerrar la sentencia preparada */
            sentenciaPreparada.close();
            
        } catch (SQLException e) {
            
            System.out.println("Error en al actualizar el libro.");
            System.out.println("\n\nEl error es:\n\n" + e);
            
        }

    }
}
