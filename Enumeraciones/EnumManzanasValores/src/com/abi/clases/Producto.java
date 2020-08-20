
package com.abi.clases;

/**
 *
 * @author Abi
 */
public class Producto {
    String nombre;
    Manzana precio;

    public Producto(String nombre, Manzana precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio.getPrecio();
    }
    
    
}
