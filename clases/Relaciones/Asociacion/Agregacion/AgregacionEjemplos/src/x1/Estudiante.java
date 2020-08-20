
package x1;

/**
 *
 * @author Abi
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    
    private Materia materias[] = new Materia[3];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
    
    public void addMateria(int posicion, Materia materia) {
        materias[posicion] = materia;
    }
    
    public void imprimir() {
        System.out.println("---ESTUDIANTE---");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("---MATERIAS---");
        System.out.println("Materia 1: " + materias[0].getNombre() );
        System.out.println("Materia 2: " + materias[1].getNombre() );
        System.out.println("Materia 3: " + materias[2].getNombre() );
        System.out.println("Materia 4: " + materias[3].getNombre() );
    }
}