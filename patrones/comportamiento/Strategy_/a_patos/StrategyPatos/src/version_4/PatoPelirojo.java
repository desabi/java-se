
package version_4;

/**
 *
 * Autor:    Abi
 */

public class PatoPelirojo extends Pato implements EmiteSonido, Vuela {

    @Override
    public void mostrarEnPantalla() {
        System.out.println("## PATO PELIROJO ## ");
    }

    @Override
    public void sonido() {
        System.out.println("** El pato hizo QUACK **");
    }

    @Override
    public void volar() {
        System.out.println("== El pato esta volando == ");
    }

}
