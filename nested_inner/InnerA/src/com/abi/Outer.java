package com.abi;

/**
 *
 * @author abi
 */
public class Outer {

    int x = 100;

    class Inner {
        /* y es local de Inner */
        int y = 10;

        void display() {
            System.out.println("x = " + x);
        }
    }

    void showy() {
        /* Error: y no es conocida aqui */
        // System.out.println("y = " + y);
    }

    void test() {
        Inner i = new Inner();
        i.display();
    }
}
