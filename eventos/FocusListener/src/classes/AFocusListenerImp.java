
package classes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;

/**
 * @author   Abi
 * @proyecto FocusListener
 * @archivo  AEventoFocus.java
 * @fecha    30/06/2014 09:31:19 PM
 */

public class AFocusListenerImp implements FocusListener{

    @Override
    public void focusGained(FocusEvent e) {     
        JButton boton = (JButton) e.getSource();
        boton.setBackground(Color.BLUE);
               
        String nombre = boton.getName();
        System.out.print("Nombre: " + nombre);
        System.out.println("\tFoco ganado.");      
    }

    @Override
    public void focusLost(FocusEvent e) {     
        String elementoQueGanaeElFoco = e.getOppositeComponent().getName();
        System.out.println("Elemento que gana el foco: " + elementoQueGanaeElFoco);
        e.getComponent().setBackground(Color.red);
    }

}
