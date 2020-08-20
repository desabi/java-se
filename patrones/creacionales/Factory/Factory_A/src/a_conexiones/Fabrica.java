
package a_conexiones;

/**
 *
 * Autor:    Abi
 */

public class Fabrica {
    
    protected String tipo;
    
    public Fabrica(String tipo) {
        this.tipo = tipo;
    }
    
    public Conexion crearConexion() {        
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
