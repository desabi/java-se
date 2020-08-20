
package ejemplo_02_taxi;

/**
 *
 * Autor:    Abi
 */

public class Taxi {
    
    private String sitio;
    private int numero;
    
    /* Instancia de una clase como atributo */
    private Chofer elChofer;

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

    public Chofer getElChofer() {
        return elChofer;
    }

    public void setElChofer(Chofer elChofer) {
        this.elChofer = elChofer;
    }

    public void imprimir() {
        System.out.println("TAXI:");
        System.out.println("Sitio: " + sitio);
        System.out.println("Numero:" + numero);
        
        /* utilizamos la instancia: elChofer y sus metodos get */
        /* para obtener los datos del chofer */
        System.out.println("CHOFER");
        System.out.println("Nombre: " + elChofer.getNombre() );
        System.out.println("Telefono: " + elChofer.getTelefono() );
    }    
  
}
