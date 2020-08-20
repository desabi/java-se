
package patosv2;

/**
 *
 * @author Abi
 */
public class PatoMain {
    public static void main(String[] args) {
        
        Pato pato = new PatoDeGoma();
        
        /* Si se puede mostrar en pantalla un pato de goma. */
        pato.mostrar();
        /* un pato de goma si puede emitir algun sonido */
        pato.quack();
        /* un pato de goma si puede nadar */
        pato.nadar();
        /* un pato de goma no puede volar */
        pato.volar();
        
        
    }
}
