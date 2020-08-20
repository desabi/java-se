
package e_actualizar_a;

import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class ActualizarUsuarioB {
    public static void main(String[] args) {
        
        String sql = "UPDATE usuario SET nombre='Bernabe' WHERE edad=23 ";
        
        boolean actualizado = ConexionMySQL.actualizar(sql);
        
        System.out.println("Usuario actualizado: " + actualizado);
    }
}
