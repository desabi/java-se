package com.abi;

/**
 *
 * @author abi
 */
public class B extends A {
    
    // overrides callme() in A
    void callme() {
        System.out.println("Inside B's callme method");
    }
}
