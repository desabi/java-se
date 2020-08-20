package net.abi;

/**
 *
 * @author abi
 */
public class Test {

    public static void main(String[] args) {
        
        /* el libro dice:  Is the no-arg constructor of Object invoked when new B(3) is invoked? */
        B b = new B(3);
        
        /*
        
        Salida: 
        
        A's constructor is invoked.
        B's constructor is invoked
        
        */
    }
}
