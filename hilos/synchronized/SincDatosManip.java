
public class SincDatosManip implements Runnable {
	
	Thread hilo;
	String dato;
	SincDatos datos;
	
    public SincDatosManip(SincDatos datos, String dato) {
    	this.datos = datos;
    	this.dato = dato;
    	hilo = new Thread(this);
    }
    
    @Override
    public void run(){
    	//synchronized (datos){
    		datos.verDato(dato);
    	//}
    }
    
    public void iniciar(){
    	hilo.start();
    }
}