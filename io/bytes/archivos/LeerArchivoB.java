
package classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LeerArchivoB {        
    public static void main(String[] args) throws IOException {
    	
    	//Java comprehensive version pagina 683
    	
    	// try with resources
        try ( FileInputStream entrada = new FileInputStream("leerarchivo.dat"); ) {
        	int letra;
        	while ( (letra = entrada.read()) != -1) {
        		System.out.print( (char) letra );
        	}
        }
    }
}
