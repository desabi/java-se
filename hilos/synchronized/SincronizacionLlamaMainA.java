
public class SincronizacionLlamaMainA {
    public static void main (String[] args) {
    	SincronizacionLlamadaA llamada = new SincronizacionLlamadaA();
    	SincronizacionLlamadorA obj1 = new SincronizacionLlamadorA(llamada, "Abi");
    	SincronizacionLlamadorA obj2 = new SincronizacionLlamadorA(llamada, "Blanca");
    	SincronizacionLlamadorA obj3 = new SincronizacionLlamadorA(llamada, "Carlos");
    	
    	try{
    		obj1.hilo.join();
    		obj2.hilo.join();
    		obj3.hilo.join();
    	}catch(InterruptedException ex){
    		System.out.println(ex);
    	}
    }
}