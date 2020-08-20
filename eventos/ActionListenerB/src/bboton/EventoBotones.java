
package bboton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abi
 */
public class EventoBotones implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String textoDelBoton = e.getActionCommand();
        System.out.println("El boton presionado dice: " + textoDelBoton);
        
        if (textoDelBoton.equals("Insertar")) {
            System.out.println("El boton insertar ha sido presionado.");
        }
        
        if (textoDelBoton.equals("Eliminar")) {
            System.out.println("El boton eliminar ha sido preisonado por el usuario.");
        }
        
        System.out.println("-------------------------------------------------");
    }

}
