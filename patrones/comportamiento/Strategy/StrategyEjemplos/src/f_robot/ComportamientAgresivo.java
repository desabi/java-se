package f_robot;

/**
 *
 * @author desab
 */
public class ComportamientAgresivo implements Comportamiento {

    @Override
    public int movimiento() {
        System.out.println("COMPORTAMIENTO AGRESIVO:");
        System.out.println("Si encuentra otro robor, atacalo");
        return 1;
    }
    
}
