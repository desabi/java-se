
package classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class LeerArchivoA {        
    public static void main(String[] args) {
        
        // Java A Begginer's Guide pag 338
        FileInputStream entrada=null;
        
        try {
        	entrada = new FileInputStream("leerarchivo.txt");
        } catch(FileNotFoundException ex) {
        	System.out.println("Archivo no encontrado: "+ex);
        }
        
        int letra;
        
        try {
        	do {
        		letra = entrada.read();
        		if ( letra != -1 ) {
        			System.out.print( (char) letra);
        		}
        	} while (letra != -1);
        } catch(IOException ex){
        	System.out.println("Ocurrio una excepcion: "+ex);
        }
        
        try {
        	entrada.close();
        } catch(IOException ex) {
        	System.out.println("Error al cerrar el archivo: "+ex);
        }
    }
}
