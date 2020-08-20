package libro_a;

/**
 *
 * @author abi
 */
public class EjecutableF {
    public static void main(String[] args) {
        
        Dia miDia = Dia.VIERNES;
        
        if (miDia.compareTo(Dia.LUNES) > 0) {
            System.out.println(miDia + " es mayor que " + Dia.LUNES);
        }
        
    }
}
