package ejemplo_b_tallas;

/**
 *
 * @author abi
 */
public class CamisaEjecutableA {
    public static void main(String[] args) {
        
        Camisa miCamisa = new Camisa();
        
        miCamisa.setColor("Guinda");
        miCamisa.setTalla(Talla.MEDIANA);
        
        System.out.println(miCamisa.getColor());
        System.out.println(miCamisa.getTalla());
        
        Talla nuevaTalla = Talla.CHICA;
        
        miCamisa.setTalla(nuevaTalla);
        System.out.println(miCamisa.getTalla());
        
        System.out.println("Tallas disponibles: ");
        for (Talla talla: Talla.values()) {
            System.out.println(talla);
        }
    }
}
