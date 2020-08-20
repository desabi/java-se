
package c_usuario;

import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Actualizar {
    
    public static void main(String[] args) {
        
        /* Crear las instancias de las clases */
        Scanner leer = new Scanner(System.in);
        Usuario elUsuario = new Usuario();
        UsuarioDAO elUsuarioDAO = new UsuarioDAO();
        
        /* Listar los usuarios registrados en la base */
        System.out.println("-----------------------------------------");
        elUsuarioDAO.listar();        
        System.out.println("-----------------------------------------");
        
        /* Pedir el id del usuario a actualizar*/
        System.out.print("Escribe el id del usuario a actualizar: ");
        elUsuario.setIdUsuario(leer.nextInt());
        
        System.out.print("Escribe el nuevo nombre: ");
        elUsuario.setNombre(leer.next());
        
        System.out.print("Escribe la nueva edad: ");
        elUsuario.setEdad(leer.nextInt());
        
        System.out.print("Escribe la nueva estatura: ");
        elUsuario.setEstatura(leer.nextFloat());
        
        System.out.print("Escribe el nuevo telefono: ");
        elUsuario.setTelefono(leer.nextLong());
        
        /* Actualizar los datos del usuario */
        elUsuarioDAO.actualizar(elUsuario);
        
        /* Listar los usuarios registrados en la base */
        System.out.println("-----------------------------------------");
        elUsuarioDAO.listar();        
        System.out.println("-----------------------------------------");
    }
    
}
