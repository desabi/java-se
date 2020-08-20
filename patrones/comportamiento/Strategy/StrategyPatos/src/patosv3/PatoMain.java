
package patosv3;

/**
 *
 * @author Abi
2 */
public class PatoMain {
    public static void main(String[] args) {
        
        PatoReal patoReal = new PatoReal();
        patoReal.mostrar();
        patoReal.nadar();
        patoReal.quack();
        patoReal.volar();
        
        PatoPelirrojo patoPelirrojo = new PatoPelirrojo();
        patoPelirrojo.mostrar();
        patoPelirrojo.nadar();
        patoPelirrojo.quack();
        patoPelirrojo.volar();
        
        PatoDeGoma patoDeGoma = new PatoDeGoma();
        patoDeGoma.mostrar();
        patoDeGoma.nadar();
        patoDeGoma.quack();
        // no puede volar
        
        PatoSenuelo patoSenuelo = new PatoSenuelo();
        patoSenuelo.mostrar();
        patoSenuelo.nadar();
        // no puede hacer ruido
        // no puede volar
    }
}
