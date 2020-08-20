
package classes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 * @author   Abi
 * @proyecto MouseMotionListener
 * @archivo  MouseAdaptador.java
 * @fecha    1/07/2014 07:40:51 AM
 */

public class MouseAdaptador {

    /* 
       Cuando implementamos una interface de algun evento, todos los metodos de
       esa interface deben implementarse.
    
       Para evitar eso se utilizan los adaptadores, dentro del adaptador, se puede
       utilizar solo el metodo que queremos utilizar, y no es necesario implementar
       todos los metodos de la interfaz 
    */
    public static void miMetodo(JButton miBoton){
        miBoton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e){
                System.out.println("El boton ha dejado de presionarse");
                //Ventana.miPanel.repaint();
                
                /*Ventana.miPanel.removeAll();
                Ventana.miPanel.updateUI();*/
                
                //Ventana.miPanel.paintComponent(Ventana.miPanel.getGraphics());
                
            }
        }
        );
    }
    
    /*mousemotionadapter*/
    
}
