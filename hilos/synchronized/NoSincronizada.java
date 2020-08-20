
package classes;

public class NoSincronizada {

    void metodoNoSincronizado(String mensaje){
    	
    	System.out.print(" [ " + mensaje);
    	
    	try {
    		Thread.sleep(1500);
		}catch (InterruptedException ex) {
			System.out.println("Error: " + ex);
		}
		
		System.out.println(" ] ");
    }
    
}