
package e_actualizar_a;

import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class ActualizarUsuarioA {
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta para actualizar algun usuario */
        String sql = "UPDATE usuario SET edad=27 WHERE nombre='Abi' ";
        
        /* 2do: Ejecutar la consulta para actualizar */
        ConexionMySQL.actualizar(sql);
        
    }
}
