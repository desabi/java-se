
package patosv1;

/**
 *
 * @author Abi
 */
public class PatoMain {
    public static void main(String[] args) {
        
        /* Objetos */
        PatoReal patoReal = new PatoReal();
        patoReal.mostrar();
        patoReal.quack();
        patoReal.nadar();
        
        PatoPelirrojo patoPelirrojo = new PatoPelirrojo();
        patoPelirrojo.mostrar();
        patoPelirrojo.quack();
        patoPelirrojo.nadar();
        
        /* Polimorfismo */
        Pato elPatoReal = new PatoReal();
        elPatoReal.mostrar();
        elPatoReal.quack();
        elPatoReal.nadar();
        
        Pato elPatoPelirrojo = new PatoPelirrojo();
        elPatoPelirrojo.mostrar();
        elPatoPelirrojo.quack();
        elPatoPelirrojo.nadar();
        
        
    }
}
