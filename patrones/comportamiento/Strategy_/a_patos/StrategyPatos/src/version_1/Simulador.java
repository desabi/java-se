package version_1;

/**
 *
 * Autor:    Abi
 */

public class Simulador {
    
    public static void main(String[] args) {
        
        PatoReal patoReal = new PatoReal();
        patoReal.mostrarEnPantalla();
        patoReal.nadar();
        patoReal.emitirSonido();
        
        PatoPelirojo patoPelirojo = new PatoPelirojo();
        patoPelirojo.mostrarEnPantalla();
        patoPelirojo.nadar();
        patoPelirojo.emitirSonido();
        
    }
}
