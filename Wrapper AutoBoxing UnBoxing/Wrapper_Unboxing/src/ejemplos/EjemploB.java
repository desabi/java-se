package ejemplos;

import java.util.ArrayList;

/**
 *
 * @author abi
 */
public class EjemploB {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        /* Boxing: */        
        /* Antes de java 5*/
        lista.add(new Integer(10));
        lista.add(Integer.valueOf(20));
        /* Despues de java 5*/
        lista.add(30);
        
        /* Unboxing */
        /* Antes de java 5 */
        int n = lista.get(0).intValue();
        /* Despues de java 5 */
        int m = lista.get(1);
        
        int c = new Integer(4);
    }
}
