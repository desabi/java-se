
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class Copiar {        
    public static void main(String[] args) {
        
        try (
        	BufferedInputStream entrada = new BufferedInputStream(new FileInputStream("origen.txt"));
        	BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("destino.txt", true));
        ){
        	int letra;
        	int bytesCopiados = 0;
        	while ( (letra = entrada.read()) != -1 ) {
        		salida.write((byte)letra);
        		bytesCopiados++;
        	}
        	System.out.println(bytesCopiados + " bytes copiados con exito. ");
        } catch (IOException ex) {
        	System.out.println("Error al copiar: " + ex);
        }
        
    }
}
