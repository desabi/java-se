
package d_usuario;

import b_utilidades.ConexionMySQL;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Actualizar_A {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta */
        String consultaUPDATE = "UPDATE usuario SET nombre='mengano', edad=39, estatura=1.67, telefono=7571009087 WHERE idusuario=5";
        
        /* 2do: Ejecutar la consulta */
        ConexionMySQL.ejecutarConsulta(consultaUPDATE);
        
    }
    
}
