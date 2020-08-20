
package ejemplo_02_taxi;

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
        elTaxi.setSitio("Aviacion");
        elTaxi.setNumero(89);
        
        elChofer.setNombre("ABI");
        elChofer.setTelefono(7571002850L);
        
        /* 3ro: Imprimir los datos */
        elTaxi.imprimir();
        elTaxi.imprimirChofer(elChofer);
        
    }
}
