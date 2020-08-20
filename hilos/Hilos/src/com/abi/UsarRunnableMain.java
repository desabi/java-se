
package com.abi;

public class UsarRunnableMain {

    public static void main(String[] args) {
        
        System.out.println("Creando hilos.");
        
        Thread hiloB = new Thread(new UsarRunnable("Hilo1"));
        Thread hiloC = new Thread(new UsarRunnable("Hilo2"));
        Thread hiloD = new Thread(new UsarRunnable("Hilo3"));
        
        System.out.println("Hilos creados.");
        
        hiloB.start();
        hiloC.start();
        hiloD.start();
    }
}
