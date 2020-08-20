
package classes;

public class MultiplesHilos implements Runnable {
    
    String nombre;
    Thread hilo;
    
    public MultiplesHilos(String nombreDelHilo){
    	this.nombre = nombreDelHilo;
    	hilo = new Thread(this, nombre);
    	hilo.start();
    }
    
    @Override
    public void run(){
    	try {
    		for(int i=1; i<5; i++){
    			System.out.println(nombre + " : " + i);
    			Thread.sleep(1000);
    		}
		}catch (InterruptedException ex) {
			System.out.println("Ocurrio un error: " + ex);
		}
		System.out.println(hilo.getName() + " Terminado.");
    }
    
}