
package version_5;

/**
 *
 * Autor:    Abi
 */

public class PatoDeGoma extends Pato {
    
    public PatoDeGoma() {
        comportamientoSonido = new SonidoChirrido();
        comportamientoVolar = new VolarNoPuede();
    }
    
    @Override
    public void mostrarEnPantalla() {
        System.out.println("## PATO DE GOMA ##");
    }
    
}
