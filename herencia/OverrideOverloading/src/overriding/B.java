package overriding;

/**
 *
 * @author abi
 */
public class B extends A {
    
    // este metodo sobre escribe el metodo de la clase A
    public void method(double i){
        System.out.println(i);
    }
}
