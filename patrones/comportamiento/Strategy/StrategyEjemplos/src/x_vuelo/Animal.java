
package x_vuelo;

/**
 *
 * @author Abi
 */

public class Animal {
    
    private String nombre;
    public EstrategiaVuelo estrategiaVuelo;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEstrategiaVuelo(EstrategiaVuelo estrategiaVuelo) {
        this.estrategiaVuelo = estrategiaVuelo;
    }
    
    public String realizarVuelo() {
        return estrategiaVuelo.volar();
    }
    
}
