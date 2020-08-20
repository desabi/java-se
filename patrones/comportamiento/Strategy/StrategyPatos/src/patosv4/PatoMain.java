
package patosv4;

/**
 *
 * @author Abi
 */
public class PatoMain {
    public static void main(String[] args) {
        
        PatoReal patoReal = new PatoReal();
        
        patoReal.mostrar();
        patoReal.nadar();
        patoReal.realizarQuack();
        patoReal.realizarVuelo();
        
        Pato elPatoReal = new PatoReal();
        elPatoReal.mostrar();
        elPatoReal.nadar();
        elPatoReal.realizarQuack();
        elPatoReal.realizarVuelo();
    }
}
