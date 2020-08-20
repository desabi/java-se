
package a_conexiones;

/**
 *
 * Autor:    Abi
 */

public abstract class FabricaAbstracta {
    
    public FabricaAbstracta() {
        
    }
    
    protected abstract Conexion crearConexion(String tipo);
    
}
