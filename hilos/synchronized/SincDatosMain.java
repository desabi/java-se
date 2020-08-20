
public class SincDatosMain {
    public static void main (String[] args) {
    	SincDatos misdatos =  new SincDatos();
    	SincDatosManip nombre = new SincDatosManip(misdatos, "abi");
    	SincDatosManip apellido = new SincDatosManip(misdatos, "desa");
    	SincDatosManip sexo = new SincDatosManip(misdatos, "hombre");
    	
    	try{
    		
    		/* al parecer ordena si necesidad de sincronizar
    		 * esto por que inicia el hilo con el metodo iniciar
    		 * y despues se pausa el hilo principal hasta que el hilo 
    		 * actual termine de ejecutar su tarea. 
    		 * y se pasa al siguiente hilo */
    		nombre.iniciar();
    		nombre.hilo.join();
    		apellido.iniciar();
    		apellido.hilo.join();
    		sexo.iniciar();
    		sexo.hilo.join();
    		
    	}catch(InterruptedException ex){
    		System.out.println(ex);
    	}
    }
    
}