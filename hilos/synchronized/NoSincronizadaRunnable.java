
package classes;

public class NoSincronizadaRunnable implements Runnable {

      String mensaje;
      NoSincronizada noSincronizada;
      Thread hilo;
      
      public NoSincronizadaRunnable(NoSincronizada noSincronizada, String mensaje){
      	
      	this.noSincronizada = noSincronizada;
      	this.mensaje = mensaje;      	
      	
      	hilo = new Thread(this);
      	hilo.start();	
      }
      
      @Override
      public void run(){
      	noSincronizada.metodoNoSincronizado(mensaje);
      }
    
}