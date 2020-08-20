package com.abi;

/**
 *
 * @author abi
 */
public class C extends A {
    
    // overrides callme() in A
    void callme() {
        System.out.println("Inside C's callme method");
    }
}
