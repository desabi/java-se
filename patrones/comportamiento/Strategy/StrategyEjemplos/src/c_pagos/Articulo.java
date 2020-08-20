
package c_pagos;

/**
 *
 * @author Abi
 */
public class Articulo {
    
    private String codigo;
    private int precio;

    public Articulo(String codigo, int precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }
    
}
