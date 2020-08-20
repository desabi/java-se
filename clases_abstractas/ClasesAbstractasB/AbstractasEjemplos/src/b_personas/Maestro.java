
package b_personas;

/**
 *
 * @author Abi
 */

public class Maestro extends Persona {
    
    @Override
    public void trabajar() {
        System.out.println(this.getNombre() + " trabaja dando clases.");
    }
    
}
