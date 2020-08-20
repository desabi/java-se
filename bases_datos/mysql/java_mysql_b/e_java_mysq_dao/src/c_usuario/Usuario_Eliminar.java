
package c_usuario;

import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Eliminar {
    
    public static void main(String[] args) {
        
        /* Crear las instancias de la clases */
        Scanner leer = new Scanner(System.in);
        Usuario elUsuario = new Usuario();
        UsuarioDAO elUsuarioDAO = new UsuarioDAO();
        
        /* Listar los usuarios registrados en la base */
        System.out.println("-----------------------------------------");
        elUsuarioDAO.listar();        
        System.out.println("-----------------------------------------");
        
        /* Pedir el id del usuario a eliminar */
        System.out.print("Escribe el id del usuario a eliminar: ");
        int idUsuario = leer.nextInt();
        
        /* Eliminar el usuario */
        elUsuarioDAO.eliminar(idUsuario);
        
        /* Listar los usuarios registrados en la base */
        System.out.println("-----------------------------------------");
        elUsuarioDAO.listar();        
        System.out.println("-----------------------------------------");
        
    }
}
