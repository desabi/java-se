
package classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeerString {        
    public static void main(String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String texto;
        System.out.println("Escribe lineas de texto.");
        System.out.println("Teclea stop para finalizar.");
        do {
        	texto = entrada.readLine();
        } while (!texto.equals("stop"));
        System.out.println(texto);
    }
}
