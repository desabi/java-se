
package c_libro;

import b_utilidades.ConexionMySQL;

/**
 *
 * Autor:    Abi
 */

public class Libro_Insertar_A {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaINSERT = "INSERT INTO libro VALUES (NULL, 'PHP avanzado', 350.25, 750)";
        
        /* 2do: Ejecutar la consulta */
        ConexionMySQL.ejecutarConsulta(consultaINSERT);
        
    }
}
