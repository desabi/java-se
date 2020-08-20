
package c_aparatos;

/**
 *
 * @author Abi
 */

public class Laptop extends Aparato {
    
    @Override
    public void funcionar() {
        System.out.println(this.getDescripcion() + " esta editando un documento.");
    }
    
}