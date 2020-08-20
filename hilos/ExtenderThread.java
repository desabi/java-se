
package classes;

// 1. crear una clase que extienda a Thread

class ExtenderThread extends Thread{
	
	public ExtenderThread(){
		super("Hilo extendedido con Thread");
		// 3. Debe llamar al metodo star() para
		//    comenzar la ejecucion del nuevo hilo.
		start();
	}
	
	// 2. Debe sobre escribir el metodo run
	// que ese el punto de entrada para el nuevo hilo
	@Override
	public void run(){
		try {
    		for (int i = 0; i<6; i++){
    			System.out.println(this.getName());    		
    			Thread.sleep(1000);
    		}
		}catch (InterruptedException ex) {
			System.out.println("Error: " + ex);
		}
		
		System.out.println(this.getName() + " terminado.");
	}
}