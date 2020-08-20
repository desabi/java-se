
package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class EscribirLeerABuffer {        
    public static void main(String[] args) {
        
        try (DataOutputStream salida = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("temp.dat",true))); ) {
        	salida.writeUTF("Abi");
        	salida.writeDouble(2.4);
        	salida.writeUTF("She");
        	salida.writeDouble(5.3);
        } catch (IOException ex) {
        	System.out.println("Error al escribir: "+ex);
        }
        
        try (DataInputStream entrada = new DataInputStream(new BufferedInputStream(new FileInputStream("temp.dat"))); ) {
        	System.out.println(entrada.readUTF() + " " + entrada.readDouble());
        	System.out.println(entrada.readUTF() + " " + entrada.readDouble());
        } catch (IOException ex) {
        	System.out.println("Error al leer: " + ex);
        }
    }
}
