package ejemplo_f_pesos;

/**
 *
 * @author abi
 */
public class EjecutableA {
    public static void main(String[] args) {
        
        UnidadPeso up = UnidadPeso.KILOGRAMO;
        
        System.out.println(up);
        System.out.println(up.getAbreviacion());
        System.out.println(up.getValor());
        
        System.out.println("\nUNIDADES DISPONIBLES\n");
        for (UnidadPeso peso : UnidadPeso.values()) {
            
            int ordinal = peso.ordinal();
            String abreviacion = peso.getAbreviacion();
            int valor = peso.getValor();
            
            System.out.println(ordinal + " - " + peso + " - " + abreviacion + " - " + valor);
        }
    }
}
