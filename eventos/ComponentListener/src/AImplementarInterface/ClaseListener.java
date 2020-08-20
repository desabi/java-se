
package AImplementarInterface;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 * @author Abi
 */
public class ClaseListener implements ComponentListener{

    @Override
    public void componentResized(ComponentEvent e) {
        
//        String nombreComponente = e.getComponent().getClass().getName();
        String nombreComponente = e.getComponent().getClass().getSimpleName();
        System.out.println( nombreComponente +" redimensionado");
        
        //Component component = e.getComponent();
        Component componente = (Component) e.getSource();
        //System.out.println(componente);
        
        Point location = componente.getLocation();
        System.out.println("Locacion:" + location);
        
        float x = componente.getAlignmentX();
        float y = componente.getAlignmentY();
        System.out.println(x +" - " + y);
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        String nombreComponente = e.getComponent().getClass().getName();
        System.out.println("\n"+nombreComponente +" movido");
    }

    @Override
    public void componentShown(ComponentEvent e) {
        String nombreComponente = e.getComponent().getClass().getSimpleName();
        System.out.println("\n"+nombreComponente +" mostrado");
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        String nombreComponente = e.getComponent().getClass().getSimpleName();
        System.out.println("\n"+nombreComponente +" ocultado");
    }

}
