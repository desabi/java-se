package libro_a;

/**
 *
 * @author abi
 */
public class EjecutableE {
    public static void main(String[] args) {
        
        // Imprime -3
        
        // Lunes 
        // Martes     -1 
        // Miercoles  -2
        // Jueves     -3 
        int comparacion1 = Dia.LUNES.compareTo(Dia.JUEVES);
        System.out.println("comparacion1 = " + comparacion1);
        
        // Imprime 0
        // son iguales
        int comparacion2 = Dia.MARTES.compareTo(Dia.MARTES);
        System.out.println("comparacion2 = " + comparacion2);
        
        // Imprime 4
        
        // Lunes
        // Martes       1
        // Miercoles    2
        // Jueves       3
        // Viernes      4
        int comparacion3 = Dia.VIERNES.compareTo(Dia.LUNES);
        System.out.println("comparacion3 = " + comparacion3);
        
    }
}
