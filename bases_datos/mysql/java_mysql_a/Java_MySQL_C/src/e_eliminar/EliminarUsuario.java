
package e_eliminar;

import c_clases.Listar;
import c_clases.Usuario;
import java.util.Scanner;

/**
 *
 * @author Abi
 */
public class EliminarUsuario {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Usuario elUsuario = new Usuario();
        
        Listar.alumnos();
        
        System.out.print("Escribe el id del usuario a eliminar: ");
        int idIngresado = leer.nextInt();
        
        elUsuario.eliminarB(idIngresado);
        
        
        Listar.alumnos();
    }
}
