
package d_vehiculo;

/**
 * Autor: Abi
 * Fecha: 25/04/2016
 * Hora: 01:23:51 PM
 */

public class Submarino extends Vehiculo {

    public Submarino(String marca, double precio) {
        super(marca, precio);
    }

    @Override
    public String getMasCaro(Vehiculo elVehiculo) {
        
        double precioSubmarino = this.getPrecio();
        double precioVehiculo = elVehiculo.getPrecio();
        
        boolean submarinoMasCaro = precioSubmarino > precioVehiculo;
        
        if (submarinoMasCaro == true) {
            String texto = "El submarino de marca: " + this.getMarca();
            texto += " cuesta: " + this.getPrecio();
            return texto;
        } else {
            String texto = "El vehiculo de marca: " + elVehiculo.getMarca() ;
            texto += "cuesta: " + elVehiculo.getPrecio();
            return texto;
        }
    }
    
}
