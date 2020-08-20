package ejemplo_c_tallas;

/**
 *
 * @author abi
 */
public class TallaEjecutableA {
    public static void main(String[] args) {
        
        Talla miTalla = Talla.CH;
        
        // imprime la talla: CH
        System.out.println(miTalla);
        
        // imprime la descripcion de la talla CH
        System.out.println(miTalla.getDescripcion());
        
        System.out.println("\nTALLAS DISPONIBLES:\n");
        
        for (Talla talla: Talla.values()) {            
            // imprime la abreviacion de la talla
            System.out.print(talla + " ");            
            // imprime la descripcion de la talla
            System.out.println(talla.getDescripcion());
        }
        
    }
}
