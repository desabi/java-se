
package ejemplo_04_maestro;

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
    
    /* Se utiliza una clase de tipo Materia como parametro */
    public void imprimirMateria(Materia laMateria) {
        System.out.println("MATERIA: ");
        System.out.println("Nombre: " + laMateria.getNombre() );
        System.out.println("Horas: " + laMateria.getHoras() );
    }
    
}
