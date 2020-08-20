
package com.abi;

public class UsarRunnable implements Runnable{
    
    private final String nombre;
    
    public UsarRunnable(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void run(){
        try {
            System.out.printf("Tarea %s estara inactivo por 2 segundos.\n", nombre);
            Thread.sleep(2000);            
        } catch (InterruptedException e) {
            System.out.printf("Tarea %s fue interrumpida.\n%s. ", nombre, e);
        }
        System.out.printf("La tarea %s ha terminado.\n", nombre);
    }
}
