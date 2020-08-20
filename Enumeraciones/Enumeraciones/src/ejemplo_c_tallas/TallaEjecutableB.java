package ejemplo_c_tallas;

/**
 *
 * @author abi
 */
public class TallaEjecutableB {
    public static void main(String[] args) {
        
        for (Talla talla: Talla.values()) {
            // ordinal 
            int ordinal = talla.ordinal();
            // descripcion
            String descripcion = talla.getDescripcion();
            
            System.out.println(ordinal + " - " + talla + " - " + descripcion);
        }
        
    }
}
