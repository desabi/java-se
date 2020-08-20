
package ejemplo_03_impresora_documento;

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

    public void imprimir() {
        System.out.println("DOCUMENTO:");
        System.out.println("Titulo: " + titulo);
        System.out.println("Hojas: " + hojas);
    }
    
}
