package org.abi;

/**
 *
 * @author abi
 */
public class A {
    
    int i = 7;
    
    public void setI(int i) {
        this.i = 2 * i;
    }
    
    public A() {
        setI(20); // 2 * 20 = 40
        System.out.println("i from A is " + i);
    }
}
