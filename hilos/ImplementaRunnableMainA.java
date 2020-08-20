
package classes;

public class ImplementaRunnableMainA {
	
    public static void main (String[] args) {
    	
    	new ImplementaRunnable(); // Creacion de un nuevo hilo (hijo).
    	
    	Thread hilo = Thread.currentThread();
    	
    	try{
    		// si se pone 4 el hilo principal termina primero, y luego el hilo hijo.
    		for (int i = 0; i<7; i++) {
				System.out.println("Hilo Principal : " + i );
				hilo.sleep(1000);
			}
    	}catch(InterruptedException ex){
    		System.out.println("Excepcion: " + ex);
    	}
    	
    	System.out.println("Hilo Principal terminado.");
    }
    
}