
package ejemplo_02_taxi_chofer;

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

    public void imprimir() {
        System.out.println("CHOFER: ");
        System.out.println("Nombre: " + nombre );
        System.out.println("Telefono: " + telefono );
    }
    
}
