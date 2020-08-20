
package b_personas;

/**
 *
 * @author Abi
 */

public class Barrendero extends Persona {

    @Override
    public void trabajar() {
        System.out.println(this.getNombre() + " trabaja barriendo las calles.");
    }

}
