
package d_agregar_a;

import a_utilidades.ConexionMySQL;

/**
 *
 * @author Abi
 */
public class AgregarUsuarioB {
    public static void main(String[] args) {
        
        /* 1ro: Crear la consulta para agregar un nuevo usuario */
        String sql = "INSERT INTO usuario VALUES (NULL, 'Hugo', 'Diaz Lopez', 23, 7571009876 )";
        
        /* 2do: Ejecutar la consulta para agregar al usuario */
        /*      la operacion se guarda en una variable booleana */
        boolean agregado = ConexionMySQL.agregar(sql);
        
        /* 3ro: Imprimir el si el usuario se agrego o no */
        System.out.println("Usuario agregado: " + agregado);
    }
}
