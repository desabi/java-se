
package version_4;

/**
 *
 * Autor:    Abi
 */

public class PatoReal extends Pato implements EmiteSonido, Vuela {

    @Override
    public void mostrarEnPantalla() {
        System.out.println("## PATO REAL ##");
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
