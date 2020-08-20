
package classes;

public class ExternaA {

    String varExterna = "Variable Externa.";
    
    void verInterna(){
    	InternaA interna = new InternaA();
    	interna.metodoClaseInterna();
    }
    
    class InternaA{
    	// una clase interna tiene acceso a todos los miembros de la clase externa
    	// y por logica tiene acceso a sus miembros.
    	String varInterna = "Variable Interna.";
    	void metodoClaseInterna(){
    		System.out.println("varEXterna: " + varExterna);
    		System.out.println("varInterna: " + varInterna);
    	}
    }
    
    // una clase externa no puede acceder a los miembros de una clase interna
    void verVarInterna(){
    	//System.out.println("" + varInterna);	//Error
    }
}