
package c_pagos;

/**
 *
 * @author Abi
 */
public class EstrategiaTarjeta implements EstrategiaPago {
    
    private String nombre;
    private String numeroTarjeta;
    private String fechaVencimiento;

    public EstrategiaTarjeta(String nombre, String numeroTarjeta, String fechaVencimiento) {
        this.nombre = nombre;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void pagar(int cantidad) {
        System.out.println(cantidad + " pagada con tarjeta.");
    }
    
}
