
package classes;

public class SincronizacionLlamaMain {
    public static void main (String[] args) {
    	SincronizacionLlamada llamada = new SincronizacionLlamada();
    	SincronizacionLlamador obj1 = new SincronizacionLlamador(llamada, "Hola");
    	SincronizacionLlamador obj2 = new SincronizacionLlamador(llamada, "Mundo");
    	SincronizacionLlamador obj3 = new SincronizacionLlamador(llamada, "Sincronizado");
    	
    	try{
    		obj1.hilo.join();
    		obj2.hilo.join();
    		obj3.hilo.join();
    	}catch(InterruptedException ex){
    		System.out.println(ex);
    	}
    }
}