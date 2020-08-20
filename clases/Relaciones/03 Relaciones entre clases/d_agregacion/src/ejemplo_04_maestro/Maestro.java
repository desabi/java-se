
package ejemplo_04_maestro;

/**
 *
 * Autor:    Abi
 */

public class Maestro {

    private String nombre;
    
    /* Instancia de una clase como atributo */
    private Materia laMateria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia getLaMateria() {
        return laMateria;
    }

    public void setLaMateria(Materia laMateria) {
        this.laMateria = laMateria;
    }
    
    public void imprimir() {
        System.out.println("MAESTRO:");
        System.out.println("Nombre: " + nombre);
        
        /* utilizamos la instancia: laMateria y sus metodos get */
        /* para obtener los datos de la materia */
        System.out.println("MATERIA:");
        System.out.println("Nombre: " + laMateria.getNombre() );
        System.out.println("Horas: " + laMateria.getHoras() );
    }
    
}
