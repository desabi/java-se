
package com.abi.main;

import com.abi.clases.Manzana;
import com.abi.clases.Producto;

/**
 *
 * @author Abi
 */
public class Main {
    public static void main(String[] args) {
        /*
         * When the variable m is declared in main, the constructor of
         * Manzanas is called once for each constant that is specified.
         **/
        Manzana m = Manzana.Roja;      
        System.out.println("Manzana Roja cuesta: " + m.getPrecio());
        
        Manzana x = null;
        System.out.println("Manzana Amarilla cuesta: " + x.Amarilla.getPrecio());
        
        Producto p = new Producto("MiManzana", Manzana.Roja);
        int precio = p.getPrecio();
        System.out.println("La Manzana Roja cuesta: " + precio);
    }
    
}
