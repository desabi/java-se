
package version_5;

/**
 *
 * Autor:    Abi
 */

public class Simulador {
    public static void main(String[] args) {
        
        PatoReal patoReal = new PatoReal();
        patoReal.mostrarEnPantalla();
        patoReal.nadar();
        patoReal.realizarSonido();
        patoReal.realizarVuelo();
        
        PatoPeliRojo patoPelirojo = new PatoPeliRojo();
        patoPelirojo.mostrarEnPantalla();
        patoPelirojo.nadar();
        patoPelirojo.realizarSonido();
        patoPelirojo.realizarVuelo();
        
        PatoDeGoma patoGoma = new PatoDeGoma();
        patoGoma.mostrarEnPantalla();
        patoGoma.nadar();
        patoGoma.realizarSonido();
        patoGoma.realizarVuelo();
        
        PatoDeMadera patoMadera = new PatoDeMadera();
        patoMadera.mostrarEnPantalla();
        patoMadera.nadar();
        patoMadera.realizarSonido();
        patoMadera.realizarVuelo();
    }
}
