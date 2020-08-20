
package botona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abi
 */
public class EventoBoton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("El boton ha sido presionado.");
    }

}
