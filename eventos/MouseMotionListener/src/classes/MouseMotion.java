
package classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @author   Abi
 * @proyecto MouseMotionListener
 * @archivo  MouseMotion.java
 * @fecha    30/06/2014 10:58:01 PM
 */

public class MouseMotion implements MouseListener, MouseMotionListener{

    int uX = 0;
    int uY = 0;
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        uX = e.getX();
        uY = e.getY();
        
        System.out.println("Inicio : " +uX+" : "+uY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        uX = e.getX();
        uY = e.getY();
        
        System.out.println("Fin : " +uX+" : "+uY);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    
    
    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        
        Graphics g = Ventana.miPanel.getGraphics();
        g.setColor(Color.ORANGE);
        g.drawLine(uX, uY, x, y);
        uX = x;
        uY = y;
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

  
}
