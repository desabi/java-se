
package c_aparatos;

/**
 *
 * @author Abi
 */

public abstract class Aparato {
    
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public abstract void funcionar();
        
}