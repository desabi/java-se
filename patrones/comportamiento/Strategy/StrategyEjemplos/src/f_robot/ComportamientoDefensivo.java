package f_robot;

/**
 *
 * @author desab
 */
public class ComportamientoDefensivo implements Comportamiento {

    @Override
    public int movimiento() {
        System.out.println("COMPORTAMIENTO DEFENSICO:");
        System.out.println("Si encuentra otro robot, huye de el.");
        return 0;
    }
    
}
