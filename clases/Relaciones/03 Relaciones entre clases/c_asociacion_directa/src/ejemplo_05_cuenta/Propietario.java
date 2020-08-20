
package ejemplo_05_cuenta;

/**
 *
 * Autor:    Abi
 */

public class Propietario {
    
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
    /* El metodo imprimir para esta clase esta en la otra clase, Cuenta */
}
