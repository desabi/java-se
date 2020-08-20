
package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

//Java beginner's guide
public class EscibirLeer {        
    public static void main(String[] args) {
        
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        
        try ( DataOutputStream datoSalida = new DataOutputStream(new FileOutputStream("salida.txt", true)) ){
        	datoSalida.writeInt(i);
        	datoSalida.writeDouble(d);
        	datoSalida.writeBoolean(b);
        	datoSalida.writeDouble(12.5 * 3.2);
        } catch (IOException ex) {
        	System.out.println("Error al escribir: " + ex);
        }
        
        System.out.println(" ");
        
        try ( DataInputStream datoEntrada = new DataInputStream(new FileInputStream("salida.txt")) ) {
        	int ii = datoEntrada.readInt();
        	System.out.println("Leido: " + ii);
        	double dd = datoEntrada.readDouble();
        	System.out.println("Leido: " +dd);
        	boolean bb = datoEntrada.readBoolean();
        	System.out.println("Leido: " + bb);
        	double m = datoEntrada.readDouble();
        	System.out.println("Leido: "+m);
        } catch (IOException ex) {
        	System.out.println("Error el leer: " + ex);
        }
        
        
    }
}
