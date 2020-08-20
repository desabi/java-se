
package com.abi;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ContadorThread extends Thread{

    private final JLabel labelContadorB;
    
    public ContadorThread(JLabel labelContadorB){
        super("Hilo Hijo");
        this.labelContadorB = labelContadorB;
        iniciar();
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                labelContadorB.setText("" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void iniciar(){
        //start() invokes the run() method on the Thread object.
        this.start();
    }
}
