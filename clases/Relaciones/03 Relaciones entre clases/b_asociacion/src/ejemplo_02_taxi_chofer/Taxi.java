
package ejemplo_02_taxi_chofer;

/**
 *
 * Autor:    Abi
 */

public class Taxi {

    private String sitio;
    private int numero;

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimir() {
        System.out.println("TAXI:");
        System.out.println("Sitio: " + sitio );
        System.out.println("Numero: " + numero );
    }
    
}
