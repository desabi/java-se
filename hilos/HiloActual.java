
package classes;

public class HiloActual {        
    public static void main(String[] args) {

		// hilo principal, a partir del cual se crean los demas hilo.
		// debe ser el ultimo que finaliza su ejecucion.
		// El hilo principal se puede controlar con un objeto Thread.
        Thread hilo = Thread.currentThread();
        System.out.println ("\nEl Hilo Actual:" + hilo);
        
        hilo.setName("HiloPrincipal");
        System.out.println ("Despues de cambiar el nombre: " + hilo);
        
        try {
    		for (int i = 1; i<5; i++){
    			System.out.println (i);
    			hilo.sleep(1000);
    			//Thread.sleep(1000);
    		}
		}
		catch (InterruptedException ex) {
			System.out.println (ex);
		}
    }
}
