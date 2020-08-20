
package taxichofer;

/**
 *
 * @author Abi
 */
public class Taxi {
    
    private Chofer chofer;
    private int numero;
    private String placas;

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }
    
    public void imprimirDatos() {
        System.out.println("--- DATOS DEL CHOFER ---");
        System.out.println("Nombre: " + chofer.getNombre() );
        System.out.println("Telefono " + chofer.getTelefono() );
        System.out.println("--- DATOS DEL TAXI ---");
        System.out.println("Numero: " + numero);
        System.out.println("Placas: " + placas);
    }
}
