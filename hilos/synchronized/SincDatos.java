

public class SincDatos {

    void verDato(String dato){
    	System.out.print("-" + dato);
    	try{
    		Thread.sleep(1000);
    	}catch(InterruptedException ex){
    		System.out.println("ex");
    	}
    	System.out.println("-");
    }   
    
}