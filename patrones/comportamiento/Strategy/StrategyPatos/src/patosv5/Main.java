
package patosv5;

/**
 *
 * @author Abi
 */
public class Main {
    public static void main(String[] args) {
    
        Pato patoSilvestre = new PatoSilvestre();
        patoSilvestre.mostrar();
        patoSilvestre.nadar();
        patoSilvestre.realizarSonido();
        patoSilvestre.realizarVuelo();
        
        Pato patoPelirrojo = new PatoPelirrojo();
        patoPelirrojo.mostrar();
        patoPelirrojo.nadar();
        patoPelirrojo.realizarSonido();
        patoPelirrojo.realizarVuelo();
        
        Pato patoDeGoma = new PatoDeGoma();
        patoDeGoma.mostrar();
        patoDeGoma.nadar();
        patoDeGoma.realizarSonido();
        patoDeGoma.realizarVuelo();
        
        Pato patoSenuelo = new PatoSenuelo();
        patoSenuelo.mostrar();
        patoSenuelo.nadar();
        patoSenuelo.realizarSonido();
        patoSenuelo.realizarVuelo();
    }
}
