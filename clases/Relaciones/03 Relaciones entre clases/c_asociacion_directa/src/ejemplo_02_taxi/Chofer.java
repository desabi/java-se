
package ejemplo_02_taxi;

/**
 *
 * Autor:    Abi
 */

public class Chofer {
    
    private String nombre;
    private long telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /* No tiene el metodo imprimir */
    /* El metodo imprimir para esta clase esta en la otra clase, Taxi */
}
