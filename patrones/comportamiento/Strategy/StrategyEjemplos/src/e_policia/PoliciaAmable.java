package e_policia;

/**
 *
 * @author desab
 */
public class PoliciaAmable implements Estrategia {

    @Override
    public void procesarExcesoVelocidad(int velocidad) {
        System.out.println("Es tu primera vez, que no vuelva a ocurrir.");
    }
    
}
