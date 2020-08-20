
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
        elTaxi.setNumero(78);
        
        elChofer.setNombre("ABIDS");
        elChofer.setTelefono(7571251798L);
        
        /* Colocar un chofer a elTaxi */
        elTaxi.setElChofer(elChofer);
               
        /* 3ro: Imprimir los datos */
        elTaxi.imprimir();
    }
}
