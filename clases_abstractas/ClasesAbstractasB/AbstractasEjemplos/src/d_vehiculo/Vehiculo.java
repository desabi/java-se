
package d_vehiculo;

/**
 * Autor: Abi
 * Fecha: 25/04/2016
 * Hora: 01:05:50 PM
 */

public abstract class Vehiculo {
    
    private String marca;
    private double precio;

    public Vehiculo(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }
    
    public abstract String getMasCaro(Vehiculo elVehiculo); 
}
