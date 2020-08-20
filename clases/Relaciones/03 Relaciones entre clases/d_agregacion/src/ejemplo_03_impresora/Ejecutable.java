
package ejemplo_03_impresora;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de los objetos */
        Documento elDocumento = new Documento();
        Impresora laImpresora = new Impresora();
        
        /* 2do: Colocar datos a las instancias */
        elDocumento.setTitulo("Proyecto.doc");
        elDocumento.setHojas(90);
        
        laImpresora.setMarca("SONY");
        laImpresora.setTieneTinta(true);
        
        /* Colocar elDocumento a la impresora */
        laImpresora.setElDocumento(elDocumento);
        
        /* 3ro: Imprimir */
        laImpresora.imprimir();
        
    }
}
