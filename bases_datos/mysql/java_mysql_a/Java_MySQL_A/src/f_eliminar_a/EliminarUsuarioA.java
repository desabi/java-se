
package f_eliminar_a;

import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class EliminarUsuarioA {
    public static void main(String[] args) {
        
        String sql = "DELETE FROM usuario WHERE nombre='Abi' ";
        // String sql = "DELETE FROM usuario WHERE edad=28";
        
        ConexionMySQL.eliminar(sql);
    }
}
