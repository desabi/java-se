package com.abi;

/**
 *
 * @author abi
 */
public class OuterMain {
    
    static class Inner {
        void show() {
            System.out.println("XYZ");
        }
    }
    
    public static void main(String[] args) {
        
        Outer.Inner in = new Outer.Inner();
        in.display(); // imprime ABC
        
        /* se hace de manera directa, Inner y main estan en el mismo archivo,
           el metodo main es static por lo tanto puede llamar a la clase
           Inner que es static */
        Inner inner = new Inner();
        inner.show(); // imprime XYZ
    }
}
