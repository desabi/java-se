
package ejemplo_04_maestro_materia;

/**
 *
 * Autor:    Abi
 */

public class Materia {
    
    private String nombre;
    private float horas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }
    
    public void imprimir() {
        System.out.println("MATERIA: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas: " + horas);
    }
}
