
package version_2;

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
        
        PatoDeGoma patoDeGoma = new PatoDeGoma();
        patoDeGoma.mostrarEnPantalla();
        patoDeGoma.nadar();
        patoDeGoma.sonido(); // el pato ha chirriado
        patoDeGoma.volar();  // el pato de goma no vuela
                
    }
}
