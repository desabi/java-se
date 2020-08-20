
package classes;

public class Externa {

    String varExterna = "Variable de la Clase Externa";
       
    void verInterna(){
    	Interna interna = new Interna();
    	interna.metodoClaseInterna();
    }
    
    class Interna{
    	// una clase interna tiene acceso a todos los miembros de la clase externa
    	void metodoClaseInterna(){
    		System.out.println("varExterna: " + varExterna);
    	}
    	
    }
    
}