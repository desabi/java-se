package a_cafeteria;

/**
 *
 * @author abi
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffe";
    }

    @Override
    public double cost() {
        return 0.99;
    }

}
