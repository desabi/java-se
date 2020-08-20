package f_eliminar_a;

import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class EliminarUsuarioB {

    public static void main(String[] args) {

        String sql = "DELETE FROM usuario WHERE nombre='Berna' ";

        boolean eliminado = ConexionMySQL.eliminar(sql);

        System.out.println("Usuario eliminado: " + eliminado);
    }
}
