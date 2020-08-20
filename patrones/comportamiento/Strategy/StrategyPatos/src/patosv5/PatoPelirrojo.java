
package patosv5;

/**
 *
 * @author Abi
 */
public class PatoPelirrojo extends Pato {

    public PatoPelirrojo() {
        sonido = new Graznar();
        vuelo = new VolarConAlas();
    }
    
    @Override
    public void mostrar() {
        System.out.println("<PATO PELIRROJO>");
    }

}