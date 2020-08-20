
package classes;

import java.io.IOException;

public class LeerConsolaLetra {        
    public static void main(String[] args) throws IOException {
   		
   		// System.in es una instancia de InputStream
   		// InputStream tiene el metodo read() para leer
   		
   		System.out.println("Escribe una letra: ");
   		int letra = System.in.read();
   		
   		System.out.println("La letra escrita es: ");
   		System.out.println("-> " + letra);
   		System.out.println("-> " + (char) letra );
   		     
    }
}
