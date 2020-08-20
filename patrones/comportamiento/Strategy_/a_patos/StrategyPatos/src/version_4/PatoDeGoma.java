
package version_4;

/**
 *
 * Autor:    Abi
 */

public class PatoDeGoma extends Pato implements EmiteSonido {

    @Override
    public void mostrarEnPantalla() {
        System.out.println("## PATO DE GOMA ##");
    }

    @Override
    public void sonido() {
        System.out.println("** El pato ha CHIRRIADO **");      
    }

}
