
package PersonaDireccion;

import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class MainConsola {
    public static void main(String[] args) {
        
        /* Crear los objetos */
        Scanner leer = new Scanner(System.in);
        Persona laPersona = new Persona();
        
        /* Leer los datos de la persona :*/
        System.out.print("Escribe el nombre: ");
        laPersona.setNombre(leer.next());
        
        System.out.print("Escribe la edad: ");
        laPersona.setEdad(leer.nextInt());
        
        System.out.print("Escribe el telefono: ");
        laPersona.setTelefono(leer.nextLong());
        
       /* Leer los datos de la direccion de la persona */
        Direccion laDireccion = new Direccion();
       
        System.out.print("Escribe la ciudad: ");
        laDireccion.setCiudad(leer.next());
        
        System.out.print("Escribe la colonia: ");
        laDireccion.setColonia(leer.next());
        
        System.out.print("EScribe la calle: ");
        laDireccion.setCalle(leer.next());
        
        System.out.print("Escribe el numero: ");
        laDireccion.setNumero(leer.nextInt());
        
        /* colocar la direccion a la persona */
        laPersona.setDireccion(laDireccion);
        
        /* imprimir los datos */
        laPersona.imprimirDatos();
    }
}
