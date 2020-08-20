
package d_actualizar;

import c_clases.Listar;
import c_clases.Usuario;
import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class ActualizarUsuario {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Usuario elUsuario = new Usuario();
        
        Listar.alumnos();
        
        System.out.print("Escribe el id del alumno a actualizar ");        
        int idUsuario = leer.nextInt();
        
        Listar.alumno(idUsuario);
        
        System.out.print("Escribe el nuevo nombre: ");
        String nombre = leer.next();
        
        System.out.print("Escribe los nuevos apellidos: ");
        String apellidos = leer.next();
        
        System.out.print("Escribe la nueva edad:");
        int edad = leer.nextInt();
        
        System.out.print("Escribe el nuevo telefono: ");
        long telefono = leer.nextLong();
        
        elUsuario.setNombre(nombre);
        elUsuario.setApellidos(apellidos);
        elUsuario.setEdad(edad);
        elUsuario.setTelefono(telefono);
        
        elUsuario.actualizarA(idUsuario);
    }
    
}
