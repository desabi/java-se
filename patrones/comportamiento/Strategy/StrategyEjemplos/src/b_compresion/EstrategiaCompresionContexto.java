
package b_compresion;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Abi
 */

public class EstrategiaCompresionContexto {
    
    private EstrategiaCompresion estrategiaCompresion;
    
    public void setEstrategiaCompresion(EstrategiaCompresion laEstrategiaCompresion) {
        this.estrategiaCompresion = laEstrategiaCompresion;
    }
    
    public void crearArchivoComprimido(ArrayList<String> archivos) {
        estrategiaCompresion.comprimirArchivos(archivos);
    }
    
}
