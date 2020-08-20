
package ejemplo_05_cuenta_propietario;

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
    
    public void imprimir() {
        System.out.println("PROPIETARIO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
    }
    
}
