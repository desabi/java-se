
package classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class LeerArchivo {        
    public static void main(String[] args) throws FileNotFoundException, IOException{
    	
    	FileInputStream entrada = new FileInputStream("leerarchivo.dat");
    	
    	// Java a Fondo pag 358
    	int letra = entrada.read();
    	
    	while ( letra != -1 ) {
    		System.out.print( (char) letra);
    		letra = entrada.read();
    	}
    	
    	entrada.close();
    }
}
