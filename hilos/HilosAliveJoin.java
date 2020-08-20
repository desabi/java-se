
package classes;

public class HilosAliveJoin {
    public static void main (String[] args) {
    	
    	/* 
    	 * en este momento los dos hilos comienzan a ejecutarse
    	 * y se imprimen aleatoriamente porque en la clase principal,
    	 * MultiplesHilos, se encuentra el metodo start().  
    	 *
    	 **/
    	MultiplesHilos word = new MultiplesHilos("word");
    	MultiplesHilos excel = new MultiplesHilos("excel");
    	
    	/*
    	 * final boolean isalive()
    	 * - return true if the thread upon which it is called is still running.
    	 * - It return false otherwise.
    	 **/
    	System.out.println("HiloWord vivo? " + word.hilo.isAlive());
    	System.out.println("HiloExcel vivo? " + excel.hilo.isAlive());
    	
    	try {
    		System.out.println("Esperando a que se terminen de ejecutar los hilos");
    		 // Se utiliza join para asegurar que el hilo principal es el ultimo en terminar.
    		 // Este metodo espera hasta que termine el hilo sobre el que se realizo la llamada.
    		word.hilo.join();
    		//System.out.println("HiloWord vivo? " + word.hilo.isAlive());
    		excel.hilo.join();
    		
    		//System.out.println("HiloExcel vivo? " + excel.hilo.isAlive());
		}catch (InterruptedException ex) {
			System.out.println("Hilo Main Interrupido");
		}
		
		System.out.println("HiloWord vivo? " + word.hilo.isAlive());
    	System.out.println("HiloExcel vivo? " + excel.hilo.isAlive());
    	
		System.out.println("Hilo Main Terminado");
    }
}