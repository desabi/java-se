
package version_4;

/**
 *
 * Autor:    Abi
 */

public class Simulador {
    public static void main(String[] args) {
        
        PatoReal patoReal = new PatoReal();
        patoReal.mostrarEnPantalla();
        patoReal.nadar();
        patoReal.sonido();
        patoReal.volar();
        
        PatoPelirojo patoPelirojo = new PatoPelirojo();
        patoPelirojo.mostrarEnPantalla();
        patoPelirojo.nadar();
        patoPelirojo.sonido();
        patoPelirojo.volar();
        
        PatoDeGoma patoGoma = new PatoDeGoma();
        patoGoma.mostrarEnPantalla();
        patoGoma.nadar();
        patoGoma.sonido();
        // no se puede: patoGoma.volar()
        
        PatoDeMadera patoMadera = new PatoDeMadera();
        patoMadera.mostrarEnPantalla();
        patoMadera.nadar();
        // no se puede: patoMadera.sonido();
        // no se puede: patoMadera.volar();
    }
}
