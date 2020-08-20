
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EscribirArchivoA {        
    public static void main(String[] args) throws IOException {
    	
    	FileOutputStream salida = new FileOutputStream("escribir.txt", true);
    	
    	System.out.println("Escribe una letra: ");
    	int letra = System.in.read();
    	salida.write(letra);
    	
    	salida.close();
    	
        
    }
}
