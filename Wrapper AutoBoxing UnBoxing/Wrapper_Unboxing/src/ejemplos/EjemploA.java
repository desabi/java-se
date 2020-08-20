package ejemplos;

/**
 *
 * @author abi
 */
public class EjemploA {
    public static void main(String[] args) {
        
        /* Antes de java 5 */
        
        /* Boxing: primitivo a objeto */
        int primitivo_x = 8;
        Integer objetoA = new Integer(primitivo_x);
        Integer objetoB = Integer.valueOf(primitivo_x);
        
        /* Unboxing: objeto a primitivo */
        int primitivo_y = objetoA.intValue();
        
        /* las lineas amarillas marca: unnecessary unboxing */
        
        System.out.println(Integer.MIN_VALUE);
    }
}
