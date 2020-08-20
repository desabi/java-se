

package classes;

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class LeerObjetos {        
    public static void main(String[] args) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("objetos.txt")); ) {
        	String nombre = entrada.readUTF();
        	double decimal = entrada.readDouble();
        	Date fecha = (Date)(entrada.readObject());
        	System.out.println(nombre+" - "+decimal+" - " +fecha);
        } catch(ClassNotFoundException ex){
        	System.out.println("Clase no encontrada: " +ex);
        } catch(IOException ex){
        	System.out.println("Erro al leer: "+ex);
        }
    }
}
