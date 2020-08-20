package a_cafeteria;

/**
 *
 * @author abi
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffe";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
