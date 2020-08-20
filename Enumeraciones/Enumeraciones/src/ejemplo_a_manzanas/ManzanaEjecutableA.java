package ejemplo_a_manzanas;

/**
 *
 * @author abi
 */
public class ManzanaEjecutableA {

    public static void main(String[] args) {

        // imprime: AMARILLA
        System.out.println(Manzana.AMARILLA);

        // imprime ROJA 
        Manzana miManzana = Manzana.ROJA;
        System.out.println(miManzana);

        /*        METODOS:
        -> toString(): String
        -> ordinal(): int
        -> equals(): boolean
        -> compareTo(): int
         */
        
        // imprime VERDE
        System.out.println(Manzana.VERDE.toString());

        // imprime 2
        System.out.println(Manzana.VERDE.ordinal());
        
        // imprime false 
        System.out.println(Manzana.AMARILLA.equals(Manzana.ROJA));
        
        // imprime un entero
        // negativo, cero, positivo
        System.out.println(Manzana.AMARILLA.compareTo(Manzana.VERDE));
        
        // Imprime true
        Manzana ma = Manzana.ROJA;
        Manzana mb = Manzana.ROJA;
        
        boolean comparacion = ma == mb;
        System.out.println(comparacion);
    }
}
