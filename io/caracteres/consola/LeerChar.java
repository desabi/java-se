
package classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeerChar {        
    public static void main(String[] args) throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Escribe Texto, para finalizar escribe un punto (.) : ");
        
        char letra;
        
        do {
        	letra = (char) entrada.read();
        	System.out.println(letra);
        } while (letra != '.');
    }
}
