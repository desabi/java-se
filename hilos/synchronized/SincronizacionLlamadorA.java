
public class SincronizacionLlamadorA implements Runnable{
	
	Thread hilo;
	SincronizacionLlamadaA llamada;
	String mensaje;
    
    public SincronizacionLlamadorA(SincronizacionLlamadaA llamada, String mensaje){
    	this.llamada = llamada;
    	this.mensaje = mensaje;
    	hilo = new Thread(this);
    	hilo.start();	
    }
    
    @Override
    public void run(){
    	synchronized (llamada){
    		llamada.llamar(mensaje);
    	}
    }
}