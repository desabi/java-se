package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author   Abi
 * @proyecto ActionListener
 * @archivo  ClaseA.java
 * @fecha    30/06/2014 06:53:49 PM
 */

public class AEventoImplementado implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Interfaz: ActionListener" );
        System.out.println("Metodo: actionPerformed(ActionEvent e)");
        System.out.println("Evento: ActionEvent");
        
        
        System.out.println("getActionCommand: "+e.getActionCommand());
        
        Object source = e.getSource();
        if(source.equals(AEventoImplementadoMain.miBoton)){
            System.out.println("Has presionado miBoton");    
        }
    }
}
