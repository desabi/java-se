
package a_conexiones;

/**
 *
 * Autor:    Abi
 */

public class FabricaConcreta extends FabricaAbstracta {

    @Override
    protected Conexion crearConexion(String tipo) {
        if(tipo.equalsIgnoreCase("oracle")) {
            return new ConexionOracle();            
        } else if(tipo.equalsIgnoreCase("sqlserver")) {
            return new ConexionSQLServer();
        } else if(tipo.equalsIgnoreCase("mysql")) {
             return new ConexionMySQL();
        } else {
            return new ConexionPostgres();
        }      
    }
    
}
