
package ejemploa;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Abi
 */
public class CampoTextoEventosKey implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Metodo: keyTyped");
        
        char keyChar = e.getKeyChar();
        int keyCode = e.getKeyCode();
        
        System.out.println("keyChar: " + keyChar);
        System.out.println("keyCode: " + keyCode);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("-------------------------------------------------");
        System.out.println("Metodo: keyPressed");
        
        char keyChar = e.getKeyChar();
        int keyCode = e.getKeyCode();
        
        System.out.println("keyChar: " + keyChar);
        System.out.println("keyCode: " + keyCode);
        
         if ( keyCode == KeyEvent.VK_ENTER ) {
            System.out.println("Enter presionado");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("*************************************************");
        System.out.println("Metodo: keyReleased");
        
        char keyChar = e.getKeyChar();
        int keyCode = e.getKeyCode();
        
        System.out.println("keyChar: " + keyChar);
        System.out.println("keyCode: " + keyCode);
    }

}
