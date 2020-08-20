
package classes;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EscribirArchivo {        
    public static void main(String[] args) throws IOException {
     
     
     // ntroductionToJavaProgrammingComprehensiveVersion pagina 682
     try ( FileOutputStream salida = new FileOutputStream("escribirarchivo.dat"); ) {
     	for (int i=65; i<=80; i++) {
     		salida.write(i);	
     	}
     } 
     
     try (FileInputStream entrada = new FileInputStream("escribirarchivo.dat"); ) {
     	int letra;
     	while ( (letra = entrada.read()) != -1 ) {
     		System.out.print((char)letra);
     	}
     }
     
    }
}
