
package version_5;

/**
 *
 * Autor:    Abi
 */

public class PatoDeMadera extends Pato {

    public PatoDeMadera() {
        comportamientoSonido = new SonidoSilencio();
        comportamientoVolar = new VolarNoPuede();
    }
    
    @Override
    public void mostrarEnPantalla() {
        System.out.println("## PATO DE MADERA ##");
    }

}
