
package aboton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abi
 */
public class EventoBoton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String textoDelBoton = e.getActionCommand();
        System.out.println("Contenido del boton: " + textoDelBoton);
        
    }

}
