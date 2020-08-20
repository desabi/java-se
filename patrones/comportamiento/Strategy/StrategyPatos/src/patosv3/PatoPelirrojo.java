
package patosv3;

/**
 *
 * @author Abi
 */
public class PatoPelirrojo extends Pato implements Volable, Quackable {

    @Override
    public void mostrar() {
        System.out.println("<PATO PELIRROJO>");
    }

    @Override
    public void volar() {
        System.out.println("El PATO PELIRROJO esta volando");
    }

    @Override
    public void quack() {
        System.out.println("El PATO PELIRROJO hizo quack.");
    }
    
}
