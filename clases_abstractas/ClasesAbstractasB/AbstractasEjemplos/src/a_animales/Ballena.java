
package a_animales;

/**
 *
 * @author Abi
 */

public class Ballena extends Animal {

    @Override
    public void comer() {
        System.out.println("La " + this.getTipo() + " esta comiendo plancton.");
    }

}
