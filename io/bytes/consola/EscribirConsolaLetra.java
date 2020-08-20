
package classes;

import java.io.IOException;

public class EscribirConsolaLetra {        
    public static void main(String[] args) {
        
        // System.out es uns instancia de OutputStream
        // OutputStream tiene el metodo write para escribir
        
        int letra = 'x';
        System.out.write(letra);
        System.out.write('\n'); // si no se coloca no imprime la x
        
    }
}
