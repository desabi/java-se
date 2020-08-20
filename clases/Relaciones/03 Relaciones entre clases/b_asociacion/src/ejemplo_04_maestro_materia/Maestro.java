
package ejemplo_04_maestro_materia;

/**
 *
 * Autor:    Abi
 */

public class Maestro {
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimir() {
        System.out.println("MAESTRO:");
        System.out.println("Nombre: " + nombre);
    }
    
}
