
package x_vuelo;

/**
 *
 * @author Abi
 */

public class Perro extends Animal {

    public Perro() {
        /* NO puede volar */
        this.estrategiaVuelo = new EstrategiaVueloNO();
    }
    
    
}
