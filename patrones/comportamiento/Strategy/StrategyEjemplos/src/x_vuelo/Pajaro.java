
package x_vuelo;

/**
 *
 * @author Abi
 */

public class Pajaro extends Animal {
    
    public Pajaro() {
        /* SI puede volar */
       this.estrategiaVuelo = new EstrategiaVueloSI();
    }
    
}
