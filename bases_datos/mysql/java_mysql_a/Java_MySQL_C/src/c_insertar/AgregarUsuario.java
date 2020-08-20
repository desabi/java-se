
package c_insertar;

import c_clases.Usuario;
import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class AgregarUsuario {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Usuario elUsuario = new Usuario();
        
        System.out.print("Escribe el nombre: ");
        elUsuario.setNombre(leer.nextLine());
        
        System.out.print("Escribe los apellidos ");
        elUsuario.setApellidos(leer.nextLine());
                
        System.out.print("Escribe la edad: ");
        elUsuario.setEdad(leer.nextInt());
        
        System.out.print("Escribe el telefono: ");
        elUsuario.setTelefono(leer.nextLong());
        
        elUsuario.registrarA();
        
        // Para evitar inyeccion SQL
        //elUsuario.registrarB();
    }
}
