
package c_aparatos;

/**
 *
 * @author Abi
 */

public class Lavadora extends Aparato {

    @Override
    public void funcionar() {
        System.out.println(this.getDescripcion() + " esta lavando");
    }
    
}
