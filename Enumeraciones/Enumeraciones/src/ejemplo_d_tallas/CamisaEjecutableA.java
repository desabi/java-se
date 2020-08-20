package ejemplo_d_tallas;

/**
 *
 * @author abi
 */
public class CamisaEjecutableA {
    public static void main(String[] args) {
        
        Camisa miCamisa = new Camisa("Azul", Talla.CH);
        
        System.out.println("Color: " + miCamisa.getColor());    
        System.out.println("Talla: " + miCamisa.getTalla());
        System.out.println("Talla: " + miCamisa.getTallaDescripcion());
        
    }
}
