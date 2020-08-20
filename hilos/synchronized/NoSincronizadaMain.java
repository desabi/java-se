
package classes;

public class NoSincronizadaMain {
    public static void main (String[] args) {
    	
    	NoSincronizada ns = new NoSincronizada();
    	
    	NoSincronizadaRunnable hilo1 = new NoSincronizadaRunnable(ns, "hola");
    	NoSincronizadaRunnable hilo2 = new NoSincronizadaRunnable(ns, "sincronizado");
    	NoSincronizadaRunnable hilo3 = new NoSincronizadaRunnable(ns, "mundo");
    	
    	try {
    		hilo1.hilo.join();
    		hilo2.hilo.join();
    		hilo3.hilo.join();
		}catch (InterruptedException ex) {
			System.out.println("Error: "+ ex);
		}
    }
}