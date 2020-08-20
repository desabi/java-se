
public class SincronizacionContadorManip implements Runnable{
	
	Thread hilo;
	SincronizacionContador contador;
	String nombre;
	
    public SincronizacionContadorManip(String nombre, SincronizacionContador contador) {
    	this.contador = contador;
    	hilo = new Thread(this);
    	hilo.setName(nombre);
    	hilo.start();
    }
    
    @Override
    public void run(){
    	synchronized (contador){
    		contador.contar();
    	}
    }
    
}