
package patosv4;

/**
 *
 * @author Abi
 */
public class PatoReal extends Pato {

    public PatoReal() {
        quackComportamiento = new Quack();
        volarComportamiento = new VolarConAlas();       
    }
    
    @Override
    public void mostrar() {
        System.out.println("<PATO REAL>");
    }

}
