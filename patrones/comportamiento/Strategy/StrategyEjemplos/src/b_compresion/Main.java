
package b_compresion;

import java.util.ArrayList;

/**
 *
 * @author Abi
 */

public class Main {
    public static void main(String[] args) {
        
        /* Archivos */
        ArrayList<String> archivos = new ArrayList<>();
        
        archivos.add("Abi");
        archivos.add("Berna");
        archivos.add("Mary");
        archivos.add("Paco");
        archivos.add("Heidy");
        
        EstrategiaCompresionContexto estrategia = new EstrategiaCompresionContexto();
        
        estrategia.setEstrategiaCompresion(new EstrategiaCompresionZIP());
        estrategia.crearArchivoComprimido(archivos);
        
        estrategia.setEstrategiaCompresion(new EstrategiaCompresionRAR());
        estrategia.crearArchivoComprimido(archivos);
        
    }
}
