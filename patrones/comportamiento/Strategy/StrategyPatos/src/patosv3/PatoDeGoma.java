
package patosv3;

/**
 *
 * @author Abi
 */
public class PatoDeGoma extends Pato implements Quackable {

    @Override
    public void mostrar() {
        System.out.println("<PATO DE GOMA>");
    }

    @Override
    public void quack() {
        System.out.println("El PATO DE GOMA hizo un chirrido.");
    }
    
    
}
