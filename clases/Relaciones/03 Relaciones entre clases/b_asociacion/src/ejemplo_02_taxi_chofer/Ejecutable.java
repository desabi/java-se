
package ejemplo_02_taxi_chofer;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de las clases */
        Taxi elTaxi = new Taxi();
        Chofer elChofer = new Chofer();
        
        /* 2do: Colocar datos a las instancias */
        elTaxi.setSitio("Juarez");
        elTaxi.setNumero(26);
        
        elChofer.setNombre("ABIDS");
        elChofer.setTelefono(7571251798L);
        
        /* 3ro: Imprimir los datos */
        elTaxi.imprimir();
        elChofer.imprimir();
        
    }
}
