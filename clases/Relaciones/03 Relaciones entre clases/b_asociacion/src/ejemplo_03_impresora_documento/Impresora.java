
package ejemplo_03_impresora_documento;

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
        System.out.println("Tiene Tinta:" + tieneTinta);
    }
    
}
