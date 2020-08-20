
package ejemplo_01_persona;

/**
 *
 * Autor:    Abi
 */

public class Persona {
    
    private String nombre;
    private int edad;

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

    public void imprimir() {
        System.out.println("PERSONA:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    /* Se utiliza una clase de tipo Direccion como parametro */
    public void imprimirDireccion(Direccion laDireccion) {
        System.out.println("DIRECCION: ");
        System.out.println("Ciudad: " + laDireccion.getCiudad() );
        System.out.println("Colonia: " + laDireccion.getColonia() );
    }
}
