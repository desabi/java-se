
package version_5;

/**
 *
 * @author desab
 */
public class SimuladorA {
    public static void main(String[] args) {
        
        Pato pato = new PatoReal();
        
        pato.mostrarEnPantalla();        
        pato.nadar();
        pato.realizarSonido();
        pato.realizarVuelo();
        
    }
}
