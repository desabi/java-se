package com.abi;

/**
 *
 * @author abi
 */
public class Dispatch {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        // Superclass reference
        A r;

        r = a;          // r refers to a A object
        r.callme();     // calls A's version of callme

        r = b;          // r refers to a B object
        r.callme();     // calls B's version of callme

        r = c;          // r refers to a C object
        r.callme();     // calls C's version of callme
    }

}
