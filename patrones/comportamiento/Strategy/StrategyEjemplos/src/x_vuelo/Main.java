
package x_vuelo;

/**
 *
 * @author Abi
 */

public class Main {
    public static void main(String[] args) {
        
        Animal miPerro = new Perro();
        
        Animal miPajaro = new Pajaro();
        
        System.out.println("Perro: " + miPerro.realizarVuelo() );
        System.out.println("Pajaro: " + miPajaro.realizarVuelo() );
        
        /* Hacer que el perro pueda bolar */
        miPerro.setEstrategiaVuelo(new EstrategiaVueloSI() );
        
        System.out.println("Perro: " + miPerro.realizarVuelo() );
    }
}
