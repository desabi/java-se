
package c_pagos;

/**
 *
 * @author Abi
 */
public class EstrategiaPaypal implements EstrategiaPago {
    
    private String correo;
    private String contrasena;

    public EstrategiaPaypal(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public void pagar(int cantidad) {
        System.out.println("cantidad = " + cantidad + " pagada con paypal.");
    }
    
}
