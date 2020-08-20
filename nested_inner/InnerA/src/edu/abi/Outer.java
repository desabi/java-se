package edu.abi;

/**
 *
 * @author abi
 */
public class Outer {
    
    int x = 100;
    
    void test() {
        for (int i = 0; i < 10; i++) {
            
            class Inner {
                void display() {
                    System.out.println("x = " + x);
                }
            }
            
            Inner inner = new Inner();
            inner.display();
        }
    }
}
