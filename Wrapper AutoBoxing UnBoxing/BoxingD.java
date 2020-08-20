
package com.abi.main;

/**
 *
 * @author Abi
 */
public class BoxingD {
    public static void main(String[] args) {
        // boxing convierte un valor primitivo en un objeto
        // unboxing convierte un objeto en un valor primitivo
        Integer k = 3;
        ++k;
        System.out.println(k);
        /*
         * 1 - unboxing del objeto Integer k a un valor entero primitivo
         * 2 - incremento de una unidad al valor entero primitivo
         * 3 - boxing asigna el valor del entero primitivo en el objeto k
         */
    }
}
