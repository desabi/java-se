package overriding;

/**
 *
 * @author abi
 */
public class Test {
    public static void main(String[] args) {
        
        B b = new B();
        
        b.method(10);
        b.method(10.0);
        
        /* 
        los dos muestran 10.0
        Porque el metodo method() en B sobre escribe al metodo method() en A
        */
    }
}
