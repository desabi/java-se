package edu.abi;

/**
 *
 * @author abi
 */
public class OuterMain {
    public static void main(String[] args) {
        
        Outer.Inner in = new Outer.Inner();
        
        System.out.println(in.calculoNeto(45343.800));
    }
}
