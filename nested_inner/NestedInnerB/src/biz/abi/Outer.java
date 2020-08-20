package biz.abi;

/**
 *
 * @author abi
 */
public class Outer {
    int i;

    static class Inner {
        /* Instancia de la clase externa */
        Outer out = new Outer();

        {
            /* Acceso a variable no static de la clase externa */
            out.i = 8;
        }

        void display() {
            System.out.println(" i = " + out.i);
        }
        
    }
}
