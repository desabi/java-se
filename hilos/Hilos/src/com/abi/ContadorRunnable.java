
package com.abi;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ContadorRunnable implements Runnable{
    
    private final Thread hilo;
    private final JLabel labelContador;
    
    public ContadorRunnable(JLabel labelContador){
        this.labelContador = labelContador;
        hilo = new Thread(this, "HiloRunnable");
        iniciar();
    }
    
    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                labelContador.setText(""+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void iniciar(){
        hilo.start();
    }
}
