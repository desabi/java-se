
public class HiloJoinMain1 {
    public static void main (String[] args) {
    	
    	System.out.println(Thread.currentThread().getName() + " iniciado.");
    	
    	HiloJoinThread hilo = new HiloJoinThread("hilo");
    	HiloJoinThread otroHilo = new HiloJoinThread("otroHilo");
    	try{
    		hilo.start();
    		hilo.join();
    		otroHilo.start();
    		otroHilo.join();
    	}catch(InterruptedException ex){
    		System.out.println("Error: " + ex);
    	}
    	
    	System.out.println(Thread.currentThread().getName() + " Terminado.");
    }
}
/*
 * However if you use join() ,it makes sure that as soon as a thread calls join,
 * the current thread(yes,currently running thread) will not execute unless the
 * thread you have called join is finished.
 * 
 * For example, in your case
 *     ob1.t.join();
 * This will make sure that the current running thread will run only after t
 * has finished running.
 *
 *
 **/