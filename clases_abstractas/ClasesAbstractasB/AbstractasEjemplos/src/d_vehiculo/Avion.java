
package d_vehiculo;

/**
 * Autor: Abi
 * Fecha: 25/04/2016
 * Hora: 01:09:26 PM
 */

public class Avion extends Vehiculo {

    public Avion(String marca, double precio) {
        super(marca, precio);
    }

    @Override
    public String getMasCaro(Vehiculo elVehiculo) {
        
        double precioAvion = this.getPrecio();
        double precioVehiculo = elVehiculo.getPrecio();
        
        boolean avionMasCaro = precioAvion > precioVehiculo;
        
        if (avionMasCaro == true) {
            String texto = "El avion de marca " + this.getMarca();
            texto += " cuesta " + this.getPrecio() ;
            return texto;
        } else {
            String texto = "El vehiculo de marca " + elVehiculo.getMarca();
            texto += " cuesta " + elVehiculo.getPrecio();
            return texto;
        }
                
    }

}
