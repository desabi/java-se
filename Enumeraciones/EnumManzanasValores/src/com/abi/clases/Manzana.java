
package com.abi.clases;

/**
 *
 * @author Abi
 */
public enum Manzana {    
    /*
     * The arguments to the constructor are specified by putting them inside 
     * parentheses after each constant.
     */
    Amarilla(10),
    Roja(15),
    Verde(20);
    /*
     * These values are passed to the precio parameter of Manzana(), which
     * then assigns this value to price. The constructor is called once
     * for each constant
     */      
    private final int precio;
    
    /*
     * When you define a constructor for a enum, the constructor is called 
     * when each enumeration constant is created.
     * Each enumeration constant has its own copy of any instance variables
     * defined by the enumeration
    */
    private Manzana(int precio){
        this.precio = precio;
    }
    
    public int getPrecio(){
        return precio;
    }
    
}
