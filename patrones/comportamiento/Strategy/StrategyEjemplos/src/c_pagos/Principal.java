
package c_pagos;

/**
 *
 * @author Abi
 */
public class Principal {
    public static void main(String[] args) {
        
        ContextoCarrito contextoCarrito = new ContextoCarrito();
        
        contextoCarrito.agregarArticulo(new Articulo("Kingston", 890));
        contextoCarrito.agregarArticulo(new Articulo("DDE", 1300));
        contextoCarrito.agregarArticulo(new Articulo("Mouse", 350));
        
        contextoCarrito.realizarPago(new EstrategiaPaypal("desabi@live.com", "mypass"));
        contextoCarrito.realizarPago(new EstrategiaTarjeta("abi", "00099 88789 67677", "2019"));
    }
}
