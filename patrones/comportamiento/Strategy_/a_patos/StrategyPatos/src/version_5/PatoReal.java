
package version_5;

/**
 *
 * Autor:    Abi
 */

public class PatoReal extends Pato {

    public PatoReal() {
        comportamientoSonido = new SonidoQuack();
        comportamientoVolar = new VolarConAlas();
    }
    
    @Override
    public void mostrarEnPantalla() {
        System.out.println("## PATO REAL ## ");
    }

}
