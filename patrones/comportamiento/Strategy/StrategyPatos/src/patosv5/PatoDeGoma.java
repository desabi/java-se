
package patosv5;

/**
 *
 * @author Abi
 */
public class PatoDeGoma extends Pato {

    public PatoDeGoma() {
        sonido = new Chirriar();
        vuelo = new VolarNo();
    }
    
    @Override
    public void mostrar() {
        System.out.println("<PATO DE GOMA>");
    }
    
}
