
package ejemplo_02_taxi;

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
        System.out.println("Sitio: " + sitio);
        System.out.println("Numero: " + numero);
    }
    
    /* Se utiliza una clase de tipo Chofer como parametro */
    public void imprimirChofer(Chofer elChofer) {
        System.out.println("CHOFER: ");
        System.out.println("Nombre: " + elChofer.getNombre() );
        System.out.println("Telefono: " + elChofer.getTelefono() );
    }
}
