
package IngenieroLaptop;

/**
 *
 * @author Abi
 */
public class Ingeniero {
    
    private String nombre;
    private int edad;
    private Laptop laptop;

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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    
    public void imprimirDatos(){
        System.out.println("---DATOS---");
        
        /* datos del ingeniero */
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
        /* datos de la laptop */
        System.out.println("Marca: " + laptop.getMarca() );
        System.out.println("Modelo: " + laptop.getModelo() );
        System.out.println("Precio: " + laptop.getPrecio() );
    }
}
