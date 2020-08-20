
package patosv5;

/**
 *
 * @author Abi
 */
public class PatoSilvestre extends Pato {

    public PatoSilvestre() {
        sonido = new Graznar();
        vuelo = new VolarConAlas();
    }
    
    @Override
    public void mostrar() {
        System.out.println("<PATO SILVESTRE>");
    }

}
