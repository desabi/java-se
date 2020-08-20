
package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.EOFException;

public class FinDeArchivoEOF {        
    public static void main(String[] args) {		
		try {
			
			try (DataOutputStream datoSalida = new DataOutputStream(new FileOutputStream("lasalida.txt", true)) ) {
				datoSalida.writeDouble(4.5);
				datoSalida.writeDouble(43.25);
				datoSalida.writeDouble(3.2);
			}
			
			try (DataInputStream datoEntrada = new DataInputStream(new FileInputStream("lasalida.txt"))) {
				while (true) {
					System.out.println("-> " + datoEntrada.readDouble());
				}
			}
					
		} catch(EOFException eof) {
			System.out.println(eof);
		} catch (IOException ioe) {
			System.out.println(ioe);
		}       
    }
}
