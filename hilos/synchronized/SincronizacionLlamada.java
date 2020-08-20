
package classes;

public class SincronizacionLlamada {

    synchronized void llamar(String mensaje){
    	
    	System.out.print(" [" + mensaje);
    	
    	try{
    		/* 
    		 * cuando se pausa este hilo, entra otro.
    		 * synchronized sirve para que un hilo haga lo que hay en
    		 * el metodo hasta terminarlo, no deja que otro hilo entre en 
    		 * ejecucion de este metodo 
    		 * */
    		Thread.sleep(1000);
    	}catch(InterruptedException ex){
    		System.out.println(ex);
    	}
    	
    	System.out.println("] ");	
    }  
}