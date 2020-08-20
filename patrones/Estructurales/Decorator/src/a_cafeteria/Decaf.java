package a_cafeteria;

/**
 *
 * @author abi
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }
    
    @Override
    public double cost() {
        return 1.05;
    }

}
