
package classes;

public class MultiplesHilosMainA {

    public static void main (String[] args) {
    	
    	new MultiplesHilos("primero");
    	new MultiplesHilos("segundo");
    	
    	Thread hilo = Thread.currentThread();
    	hilo.setName("principal");
    	
    	try {
    		// si ponemos un numero (6) menor al que tiene el hijo (5)
    		// el hilo principal termina primero y luego el hijo
    		// eso no debe ser asi. el hilo principal debe terminar al ultimo.
    		for (int i = 6; i>0; i--){
    			System.out.println("principal : " + i);
    			hilo.sleep(1000);
    		}
		}catch (InterruptedException ex) {
			System.out.println("Excepcion : " + ex);
		}
		
		System.out.println(hilo.getName() + " terminado");
    }   
    
    // se utiliza un retraos suficiente para esperar que los hilos hijos terminen
    // el retraso se hace con sleep()
}