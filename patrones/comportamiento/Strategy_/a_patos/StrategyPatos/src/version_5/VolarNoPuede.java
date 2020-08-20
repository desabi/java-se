
package version_5;

/**
 *
 * Autor:    Abi
 */

public class VolarNoPuede implements ComportamientoVolar {

    @Override
    public void volar() {
        System.out.println("== El pato no puede volar ==");
    }

}
