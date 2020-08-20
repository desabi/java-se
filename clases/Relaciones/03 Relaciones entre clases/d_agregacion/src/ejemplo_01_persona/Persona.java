
package ejemplo_01_persona;

/**
 *
 * Autor:    Abi
 */

public class Persona {
    
    private String nombre;
    private int edad;
    
    /* Instancia de una clase como atributo */
    private Direccion laDireccion;

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

    public Direccion getLaDireccion() {
        return laDireccion;
    }

    public void setLaDireccion(Direccion laDireccion) {
        this.laDireccion = laDireccion;
    }
    
    public void imprimir() {
        System.out.println("PERSONA:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad:" + edad);
        
        /* utilizamos la instancia: laDireccion y sus metodos get */
        /* para obtener los datos de la direccion */
        System.out.println("DIRECCION:");
        System.out.println("Ciudad: " + laDireccion.getCiudad() );
        System.out.println("Colonia: " + laDireccion.getColonia() );   
    }
    
}
