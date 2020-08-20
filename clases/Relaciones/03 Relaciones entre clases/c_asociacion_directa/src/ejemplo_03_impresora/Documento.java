
package ejemplo_03_impresora;

/**
 *
 * Autor:    Abi
 */

public class Documento {
    
    private String titulo;
    private int hojas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHojas() {
        return hojas;
    }

    public void setHojas(int hojas) {
        this.hojas = hojas;
    }
    
    /* No tiene el metodo imprimir */
    /* El metodo imprimir para esta clase esta en la otra clase, Impresora*/
}
