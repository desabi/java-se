
package bestudiantedireccion;

/**
 *
 * @author Abi
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private Direccion direccion;

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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
     
        
    public void imprimir() {
        System.out.println("---ESTUDIANTE---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("---DIRECCION---");
        System.out.println("Ciudad: " + direccion.getCiudad() );
        System.out.println("Colonia: " + direccion.getCalle() );
        System.out.println("Calle: " + direccion.getColonia() );
        System.out.println("Numero: " + direccion.getNumero());
        System.out.println("------------");
    }
    
}