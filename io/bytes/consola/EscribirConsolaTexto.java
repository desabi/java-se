
package classes;

import java.io.IOException;


public class EscribirConsolaTexto {        
    public static void main(String[] args) throws IOException{
		
		byte texto[] = new byte[10];
		
		System.out.println("Escribe un texto");
		System.in.read(texto);
		
		System.out.println("Lo que escribiste fue:");
		for (int i = 0; i<texto.length; i++) {
			System.out.write(texto[i]);
			System.out.write('\r');
			System.out.write('\n');        			
		}	
    }
}
