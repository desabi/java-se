
package ejemplo_03_impresora;

/**
 *
 * Autor:    Abi
 */

public class Impresora {
    
    private String marca;
    private boolean tieneTinta;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isTieneTinta() {
        return tieneTinta;
    }

    public void setTieneTinta(boolean tieneTinta) {
        this.tieneTinta = tieneTinta;
    }

    public void imprimir() {
        System.out.println("IMPRESORA:");
        System.out.println("Marca: " + marca);
        System.out.println("Tiene tinta: " + tieneTinta);
    }
    
    /* Se utiliza una clase de tipo Documento como parametro */
    public void imprimirDocumento(Documento elDocumento) {
        System.out.println("DOCUMENTO:");
        System.out.println("Titulo: " + elDocumento.getTitulo() );
        System.out.println("Hojas: " + elDocumento.getHojas() );
    }
    
}
