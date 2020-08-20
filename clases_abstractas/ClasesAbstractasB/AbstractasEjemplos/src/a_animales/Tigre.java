
package a_animales;

/**
 *
 * @author Abi
 */

public class Tigre extends Animal {

    @Override
    public void comer() {
        System.out.println("El " + this.getTipo() + " esta comiendo carne.");
    }
    
}
