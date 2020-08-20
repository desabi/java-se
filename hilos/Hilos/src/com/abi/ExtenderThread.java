
package com.abi;

public class ExtenderThread extends Thread{
    
    public ExtenderThread(){
        super("Hilo Hijo");
        System.out.println("Hilo Hijo: " + this);
    }
    
    @Override
    public void run(){
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("-- Hilo hijo -- " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Hilo hijo terminado.");
    }
    
    public void iniciarHilo(){
        this.start();
    }
}
