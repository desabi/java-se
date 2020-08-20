
package ejemplo_03_impresora;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de los objetos */
        Impresora laImpresora = new Impresora();
        Documento elDocumento = new Documento();
        
        /* 2do: Colocar datos a las instancias */
        laImpresora.setMarca("EPSON");
        laImpresora.setTieneTinta(true);
        
        elDocumento.setTitulo("Investigacion");
        elDocumento.setHojas(10);
        
        /* 3ro: Imprimir los datos */
        laImpresora.imprimir();
        laImpresora.imprimirDocumento(elDocumento);
        
    }
}
