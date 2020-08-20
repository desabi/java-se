
package taxichofer;

/**
 *
 * @author Abi
 */
public class MainManual {
    public static void main(String[] args) {
        
        /* Crear el objeto taxi */
        Taxi elTaxi = new Taxi();
        
        /* Colocar datos del taxi */
        elTaxi.setNumero(22);
        elTaxi.setPlacas("X6G3H4");
        
        /* crear el objeto chofer */
        Chofer elChofer = new Chofer();
        elChofer.setNombre("Fulano");
        elChofer.setTelefono(7571003990L);
        
        /* Colocar el chofer del taxi */
        elTaxi.setChofer(elChofer);
        
        elTaxi.imprimirDatos();
    }
}
