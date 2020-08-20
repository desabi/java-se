
package PersonaDireccion;

/**
 *
 * @author Abi
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private long telefono;
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
          
    public void imprimirDatos() {
        System.out.println("---DATOS---");
        /* imprimir los datos de la persona */
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono:" + telefono);
        
        /* imprimir la direccion de la persona */
        System.out.println("Ciudad: " + direccion.getCiudad() );
        System.out.println("Colonia: " + direccion.getColonia() );
        System.out.println("Calle: " + direccion.getCalle() );
        System.out.println("Numero: " +  direccion.getNumero() );
    }
    
    
}