public class SincronizacionLlamadaA {

    void llamar(String mensaje){
    	
    	System.out.print(" [" + mensaje);
    	
    	try{
    		Thread.sleep(1000);
    	}catch(InterruptedException ex){
    		System.out.println(ex);
    	}
    	
    	System.out.println("] ");	
    }  
}