
package d_agregar_a;

import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class AgregarUsuarioA {
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta para agregar un nuevo usuario */
        String sql = "INSERT INTO usuario VALUES(NULL, 'Abi', 'Delgado Salmeron', 28, 7571002850)";
        
        /* 2do: Ejecutar la consulsta */
        ConexionMySQL.agregar(sql);
    }
}
