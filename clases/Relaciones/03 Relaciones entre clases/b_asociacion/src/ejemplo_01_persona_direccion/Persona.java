package ejemplo_01_persona_direccion;


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
        System.out.println("PERSONA");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad );
    }
}
