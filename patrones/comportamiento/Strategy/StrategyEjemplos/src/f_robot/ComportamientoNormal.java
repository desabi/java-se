package f_robot;

/**
 *
 * @author desab
 */
public class ComportamientoNormal implements Comportamiento {

    @Override
    public int movimiento() {
        System.out.println("COMPORTAMIENTO NORMAL");
        System.out.println("Si encuentra otro robot, ignoralo.");
        return 0;
    }
    
}
