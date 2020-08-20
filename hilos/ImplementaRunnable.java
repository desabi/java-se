
package classes;

// 1. Crear una clase que implemente la interfaz Runnable
public class ImplementaRunnable implements Runnable {
    
    // Crear un objeto de tipo Thread dentro de la clase.
    private Thread hilo; 
    /* if you are running on Java 5 or higher, you should not start it
     * with new Thread but use an ExecutorService instead.
     **/
	public ImplementaRunnable(){
		// pasando this como primer argumento indica que el nuevo hilo
		// llame al metodo run en este objeto.
		// 2do parametro es el nombre del hilo
		hilo = new Thread(this, "Hilo implementado con Runnable.");
		
		// el nuevo hilo que acaba de crear no comenzara su ejecucion hasta que
		// se llame al metodo start();
		hilo.start();
		// start() ejecuta una llamada a run()
	}
	
	@Override
	public void run(){
		try {
    		for (int i=1; i<6; i++){
				System.out.println(hilo.getName());
				Thread.sleep(1000);
			}
		}catch (InterruptedException ex) {
			System.out.println("Error: " + ex);
		}
		
		System.out.println(hilo.getName() + " terminado.");
	}	
}

/* run() puede llamar a otros metodos, usar otras clases, y declarar variables,
 * de la misma forma que el hilo principal.
 **/