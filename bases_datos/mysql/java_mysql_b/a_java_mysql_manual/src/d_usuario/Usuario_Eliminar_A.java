
package d_usuario;

import b_utilidades.ConexionMySQL;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Eliminar_A {

    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaDELETE = "DELETE FROM usuario WHERE idusuario=4";
        
        /* 2do: Ejecutar la consulta */
        ConexionMySQL.ejecutarConsulta(consultaDELETE);
        
    }
}
