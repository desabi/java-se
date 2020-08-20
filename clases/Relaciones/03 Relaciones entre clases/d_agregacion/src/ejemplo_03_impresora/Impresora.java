
package ejemplo_03_impresora;

/**
 *
 * Autor:    Abi
 */

public class Impresora {
    
    private String marca;
    private boolean tieneTinta;
    
    /* Instancia de una clase como atributo */
    private Documento elDocumento;

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

    public Documento getElDocumento() {
        return elDocumento;
    }

    public void setElDocumento(Documento elDocumento) {
        this.elDocumento = elDocumento;
    }
    
    public void imprimir() {
        System.out.println("IMPRESORA");
        System.out.println("Marca: " + marca);
        System.out.println("Tiene tinta: " + tieneTinta);
        
        /* utilizamos la instancia: elDocumento y sus metodos get */
        /* para obtener los datos del documento */
        System.out.println("DOCUMENTO:");
        System.out.println("Titulo: " + elDocumento.getTitulo() );
        System.out.println("Hojas: " + elDocumento.getHojas() );
    }
    
}
