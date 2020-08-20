
package c_usuario;

/**
 *
 * Autor:    Abi
 */

public class Usuario_Listar {
    
    public static void main(String[] args) {
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        usuarioDAO.listar();
        
    }
}
