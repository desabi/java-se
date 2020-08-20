
package classes;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class EscribirObjetos {        
    public static void main(String[] args) {
		
		try ( ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("objetos.txt", true)); ) {
			salida.writeUTF("Abi");
			salida.writeDouble(85.5);
			salida.writeObject(new Date());
		} catch (IOException ex) {
			System.out.println("Error al escribir: " + ex);
		}
		 
    }
}
