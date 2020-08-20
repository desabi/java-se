
package classes;

public class SincronizacionLlamador implements Runnable{
	
	Thread hilo;
	SincronizacionLlamada llamada;
	String mensaje;
    
    public SincronizacionLlamador(SincronizacionLlamada llamada, String mensaje){
    	this.llamada = llamada;
    	this.mensaje = mensaje;
    	hilo = new Thread(this);
    	hilo.start();	
    }
    
    @Override
    public void run(){
    	llamada.llamar(mensaje);
    }
}