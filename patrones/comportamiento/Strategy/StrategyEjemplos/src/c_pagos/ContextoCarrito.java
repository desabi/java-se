
package c_pagos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abi
 */
public class ContextoCarrito {
    
    private List<Articulo> articulos;
    
    public ContextoCarrito() {
        this.articulos = new ArrayList<>();
    }
    
    public void agregarArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }
    
    public void eliminarArticulo(Articulo articulo) {
        this.articulos.remove(articulo);
    }
    
    public int calcularTotal() {
        int total = 0;
        for (Articulo articulo : articulos) {
            total = total + articulo.getPrecio();
        }
        return total;
    }
    
    public void realizarPago(EstrategiaPago estrategiaPago) {
        int cantidad = calcularTotal();
        estrategiaPago.pagar(cantidad);
    }
    
}