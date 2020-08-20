
public class HiloJoinMain {
	public static void main (String[] args) {
		
		/* El hilo principal es: main */
		System.out.println("Hilo: " + Thread.currentThread().getName() + ", iniciado.");
		
		HiloJoinRunnable hiloSecundario = new HiloJoinRunnable("secundario");
		
		try{
			/* 
			 * t.join();
			 * causes the current thread to pause execution until
			 * t's thread terminates */
			 
			 // Se pausa main hasta que hiloSecundario termine su ejecucion.
			hiloSecundario.hilo.join();
		}catch(InterruptedException ex){
			System.out.println("Error: " + ex);
		}
		
		System.out.println("Hilo: " + Thread.currentThread().getName() + ", Terminado.");
		/*
		 * The join method allows one thread to wait for the completion of another. 
		 * If t is a Thread object whose thread is currently executing,
		 * 			t.join();
		 * causes the current thread to pause execution until t's thread terminates.
		 **/ 
		 
		 /* 
		  * entonces se pausa el hilo de main por que es el hilo principal
		  * hasta que los hilos hA y hB terminen.*/
    }       
}