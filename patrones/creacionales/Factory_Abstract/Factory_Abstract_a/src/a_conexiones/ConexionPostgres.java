
package a_conexiones;

/**
 *
 * Autor:    Abi
 */

public class ConexionPostgres extends Conexion {
    
    public ConexionPostgres() {
        
    }
    
    @Override
    public String getDescripcion() {
        return "Conexion Postgres";
    }
}
