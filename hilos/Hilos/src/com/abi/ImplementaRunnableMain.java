
package com.abi;

public class ImplementaRunnableMain {

    public static void main(String[] args) {
        
        ImplementarRunnable hiloHijo = new ImplementarRunnable();
        hiloHijo.iniciarHilo();
        
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Hilo MAIN: "  + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
