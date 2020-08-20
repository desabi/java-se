
package c_usuario;

import java.util.Scanner;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Insertar {
    
    public static void main(String[] args) {
        
        /* Crear las instancias de la clases */
        Scanner leer = new Scanner(System.in);
        Usuario elUsuario = new Usuario();
        UsuarioDAO elUsuarioDAO = new UsuarioDAO();
        
        /* Pedir los datos y asignarlos */
        System.out.print("Escribe el nombre: ");
        elUsuario.setNombre(leer.next());
        
        System.out.print("Escribe la edad: ");
        elUsuario.setEdad(leer.nextInt());
        
        System.out.print("Escribe la estatura: ");
        elUsuario.setEstatura(leer.nextFloat());
        
        System.out.print("Escribe el telefono: ");
        elUsuario.setTelefono(leer.nextLong());
        
        /* Insertar los datos */
        elUsuarioDAO.insertar(elUsuario);
        
    }
}
