
package d_usuario;

import b_utilidades.ConexionMySQL;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Insertar_A {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaINSERT = "INSERT INTO usuario VALUES(NULL, 'Abi', 29, 1.62, 7571151798)";
        
        /* 2do: Ejecutar la consulta */
        ConexionMySQL.ejecutarConsulta(consultaINSERT);
    }
    
}
