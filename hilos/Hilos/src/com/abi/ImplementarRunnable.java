
package com.abi;

public class ImplementarRunnable implements Runnable{
    
    private Thread hiloHijo;
    
    public ImplementarRunnable(){
        instanciarThread();
    }
    
    @Override
    public void run(){
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Hilo hijo: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Hilo hijo terminado.");
    }
    
    private void instanciarThread(){
        hiloHijo = new Thread(this, "HILO HIJO");
        System.out.println("HILO HIJO CREADO: " + hiloHijo);
        //hiloHijo.start();
    }
    
    public void iniciarHilo(){
        hiloHijo.start();
    }
}
