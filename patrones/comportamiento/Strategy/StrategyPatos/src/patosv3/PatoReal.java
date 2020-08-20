
package patosv3;

/**
 *
 * @author Abi
 */
public class PatoReal extends Pato implements Volable, Quackable {

    @Override
    public void mostrar() {
        System.out.println("<PATO REAL>");
    }

    @Override
    public void volar() {
        System.out.println("El PATO REAL esta volando.");
    }

    @Override
    public void quack() {
        System.out.println("El PATO REAL hizo quack.");
    }

}
