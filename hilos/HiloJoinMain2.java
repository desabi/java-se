
public class HiloJoinMain2 {
    public static void main (String[] args) {
    	
    	HiloJoinThread hiloA = new HiloJoinThread("A");
    	HiloJoinThread hiloB = new HiloJoinThread("B");
    	
    	/* el metodo main se esta ejecutando */
    	try{
    		hiloA.start();
    		/* 
    		 * cuando el hilo del metodo main se encuentra con la linea 13:
    		 * dejara de ejecutarse hasta que hiloA haya terminado */
    		hiloA.join();
    		/*
    		 * Despues el metodo main volvera a jecutarse en la linea 18
    		 * solo cuando la ejecucion de hiloA haya terminado.
    		 **/
    		hiloB.start();
    		hiloB.join();
    		/*
    		 * tal vez parezca que hiloA afecta a hiloB, pero esta actualmente
    		 * afectando al hilo main principal
    		 **/
    	}catch(InterruptedException ex){
    		System.out.println("Error: " + ex);
    	}
    }
}

/*
 * Este método permite a un hilo quedar a la espera que termine un segundo hilo.
 * El método join() suele utilizarse para mantener un orden en la secuencia 
 * de los hilos. Así, podemos arrancar una secuencia de hilos llamando a join()
 * para que cada uno finalice en el orden que hemos marcado según la llamada a join().
 **/