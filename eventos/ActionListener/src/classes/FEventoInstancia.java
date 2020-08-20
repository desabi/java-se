
package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author   Abi
 * @proyecto ActionListener
 * @archivo  FEventoInstancia.java
 * @fecha    30/06/2014 10:12:07 PM
 */

public class FEventoInstancia {
    
    public void miMetodo(){
        
        ActionListener evento = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        };
        
        
    }
}
