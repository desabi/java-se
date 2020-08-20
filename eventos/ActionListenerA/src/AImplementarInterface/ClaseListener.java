
package AImplementarInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ClaseListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String etiqueta = e.getActionCommand();
        Object fuente = e.getSource();
        
//        System.out.println("actionCommand : " + actionCommand);
//        System.out.println("source : " + source);
        
        if (fuente instanceof JButton) {
            System.out.println("Boton presionado : "+etiqueta);
        }
        
        if (etiqueta.equals("primero")) {
            System.out.println("Se ha presionado el primer boton");
        }
        
        if (etiqueta.equals("segundo")) {
            System.out.println("Se ha presionado el segundo boton");
        }
        
//      Si hay varias botones, podemos saber cual de ellos ha sido pulsado mediante equals.
//
//      la fuente debe estar dentro de la misma clase.
//        
//	Object control=e.getSource();
//	if(control.equals(btnAceptar)){
//		System.out.println("Se ha pulsado el botón Aceptar");
//	}
        
    }
    
}