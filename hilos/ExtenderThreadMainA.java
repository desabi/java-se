
package classes;

public class ExtenderThreadMainA {
	public static void main (String[] args) {
    	new ExtenderThread();
    	
    	Thread hilo = Thread.currentThread();
    	
    	try {
    		for (int i = 0; i<7; i++) {
    			System.out.println("Hilo principal : " + i);
    			hilo.sleep(1000);
			}
		}catch (InterruptedException ex) {
			System.out.println("Excepcion : " + ex);
		}
		System.out.println("Hilo principal terminado.");
    }
    
}