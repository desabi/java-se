
package com.abi;

public class ExtenderThreadMain {

    public static void main(String[] args) {
        
        ExtenderThread hiloHijo = new ExtenderThread();
        hiloHijo.iniciarHilo();
        
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("|| Hilo MAIN || "  + i);
                Thread.sleep(1000);
            }
            System.out.println("Hilo MAIN terminado.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }


}
