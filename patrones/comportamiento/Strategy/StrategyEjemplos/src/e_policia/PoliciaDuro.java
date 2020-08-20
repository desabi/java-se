package e_policia;

/**
 *
 * @author desab
 */
public class PoliciaDuro implements Estrategia {

    @Override
    public void procesarExcesoVelocidad(int velocidad) {
        System.out.println("Ibas a una velocidad de: " + velocidad);
        System.out.println("Estas multado");
    }
    
}
