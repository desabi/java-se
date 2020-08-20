package overloading;

/**
 *
 * @author abi
 */
public class Test {
    public static void main(String[] args) {
        
        B b = new B();
        
        b.method(10);   // llama a method(int i) de la subclase B
        b.method(10.0); // llama a method(double i) de la superclase A
    }
}
