package d_ventanas_insertar;

import c_clases.UsuarioDAO;
import c_clases.UsuarioPOJO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abi
 */
public class EventoInsertarC implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        String textoBoton = e.getActionCommand();

        System.out.println("textoBoton = " + textoBoton);

        if (textoBoton.equals("Insertar")) {
            
            /* ¿¿ Como pasar los campos de texto aqui ?? */
            
//            /* 1ro: Crear el objeto usuario POJO y DAO */
//            UsuarioPOJO elUsuarioPOJO = new UsuarioPOJO();
//            UsuarioDAO elUsuarioDAO = new UsuarioDAO();
//
//            /* 2do: Obtener los datos del formulario */
//            //String nombre = campoNombre.getText();
//            //String contrasena = campoContrasena.getText();
//
//            /* 3ro: Colocar los datos al POJO */
//            elUsuarioPOJO.setNombre(nombre);
//            elUsuarioPOJO.setContrasena(contrasena);
//
//            /* 4to: Insertar los datos */
//            elUsuarioDAO.insertar(elUsuarioPOJO);

        }
    }

}
