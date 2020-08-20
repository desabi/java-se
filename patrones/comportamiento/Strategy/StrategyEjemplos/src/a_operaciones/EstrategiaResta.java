
package a_operaciones;

/**
 *
 * @author Abi
 */
public class EstrategiaResta implements Estrategia {

    @Override
    public int hacerOperacion(int numero1, int numero2) {
        return numero1 - numero2;
    }
    
}
