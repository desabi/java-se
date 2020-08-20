
package c_libro;

import b_utilidades.ConexionMySQL;

/**
 *
 * Autor:    Abi
 */

public class Libro_Eliminar_A {

    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaDELETE = "DELETE FROM libro WHERE idlibro=6";
        
        /* 2do: Ejecutar la consulta */
        ConexionMySQL.ejecutarConsulta(consultaDELETE);
        
        
    }
}
