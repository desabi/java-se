
public class SincronizacionContadorMain {
    public static void main (String[] args) {
    	
    	SincronizacionContador contador = new SincronizacionContador();
    	SincronizacionContadorManip a = new SincronizacionContadorManip("A", contador);
    	SincronizacionContadorManip b = new SincronizacionContadorManip("B", contador);
    	
    	try{
    		a.hilo.join();
    		b.hilo.join();
    	}catch(InterruptedException ex){
    		System.out.println(ex);
    	}
    }   
}