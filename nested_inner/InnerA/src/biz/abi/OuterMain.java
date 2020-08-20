package biz.abi;

/**
 *
 * @author abi
 */
public class OuterMain {

    public static void main(String[] args) {
        
        Outer out = new Outer();
        out.test();
        
        /* Se pueden crear objetos de la clase interna */
        Outer.Inner in = out.new Inner();
        in.display();
    }
}
