
package c_libro;

import b_utilidades.ConexionMySQL;

/**
 *
 * Autor:    Abi
 */

public class Libro_Actualizar_A {

    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaUPDATE = "UPDATE libro SET titulo='HTML y CSS', precio=450.99, paginas=830 WHERE idlibro=5";
        
        /* 2do: Ejecutar la consulta */
        ConexionMySQL.ejecutarConsulta(consultaUPDATE);
        
    }
}
