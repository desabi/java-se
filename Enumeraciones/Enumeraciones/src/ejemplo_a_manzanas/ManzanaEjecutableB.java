package ejemplo_a_manzanas;

/**
 *
 * @author abi
 */
public class ManzanaEjecutableB {
    public static void main(String[] args) {
        
        // Obtener todas las manzanas 
        Manzana[] manzanas = Manzana.values();
        
        for (Manzana manzana : manzanas) {
            System.out.println(manzana);
        }
        
        System.out.println("");
        
        for (Manzana manzana : manzanas) {
            int ordinal = manzana.ordinal();
            
            System.out.println(ordinal + " : " + manzana);
        }
    }
}
