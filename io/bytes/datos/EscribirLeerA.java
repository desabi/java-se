
package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

// Java comprehensive version daniel yang
public class EscribirLeerA {        
    public static void main(String[] args) {
		
		try ( DataOutputStream datoSalida = new DataOutputStream(new FileOutputStream("out.dat", true)); ) {
			datoSalida.writeUTF("Abi");
			datoSalida.writeDouble(85.3);
			datoSalida.writeUTF("She");
			datoSalida.writeDouble(185.5);
			datoSalida.writeUTF("Fulano");
			datoSalida.writeDouble(105.25);
		} catch(IOException ex) {
			System.out.println("Error al escribir:" + ex) ;
		}
		
		try (DataInputStream datoEntrada = new DataInputStream(new FileInputStream("out.dat")); ) {
			System.out.println(datoEntrada.readUTF() + " " + datoEntrada.readDouble());
			System.out.println(datoEntrada.readUTF() + " " + datoEntrada.readDouble());
			System.out.println(datoEntrada.readUTF() + " " + datoEntrada.readDouble());
		} catch(IOException ex) {
			System.out.println("Error al leer: " + ex);
		}    
    }
}
