
package classes;

import java.io.IOException;

public class LeerConsolaTexto {        
    public static void main(String[] args) throws IOException {
        
        // System.in es una instancia de InputStream
        // InputStream tiene el metodo read() para leer
        
        byte datos[] = new byte[10];
        
        System.out.println("Escribe algo: ");
        System.in.read(datos);
        
        System.out.println("\nEscribiste: ");
        for (int i = 0; i<datos.length; i++) {
        	System.out.print((char) datos[i]);
        }
        
    }
}
