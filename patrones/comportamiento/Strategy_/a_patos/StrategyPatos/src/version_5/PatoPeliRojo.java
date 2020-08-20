
package version_5;

/**
 *
 * Autor:    Abi
 */

public class PatoPeliRojo extends Pato {

    public PatoPeliRojo() {
        comportamientoSonido = new SonidoQuack();
        comportamientoVolar = new VolarConAlas();
    }
    
    @Override
    public void mostrarEnPantalla() {
        System.out.println("## PATO PELIROJO ##");
    }
    
}
