package overloading;

/**
 *
 * @author abi
 */
public class B extends A {
    
    /*
    Este metodo sobrecarga el metodo method() de la superclase A
    */
    public void method(int i) {
        System.out.println(i);
    }
}
