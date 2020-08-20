
package classes;

public class ExternaB {

	String varExterna = "Variable de la Clase Externa.";
	
	void miMetodoExterno(){
		
		for (int i = 0; i<3; i++) {
			
			class InternaB{
				String varInterna = "Variable de la clase Interna.";
				
				void metodoClaseInterna(){
					System.out.println("varExterna: " + varExterna);
					System.out.println("varInterna: " + varInterna+"\n");
				}	
			}
			
			InternaB interna = new InternaB();
			interna.metodoClaseInterna();
		}		
	}
    
}