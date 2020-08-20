
package patosv5;

/**
 *
 * @author Abi
 */
public class PatoSenuelo extends Pato {

    public PatoSenuelo() {
        sonido = new SonidoNo();
        vuelo = new VolarNo();
    }

    @Override
    public void mostrar() {
        System.out.println("<PATO SEÑUELO>");
    }
    
}