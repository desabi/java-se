
package ejemplo_03_impresora_documento;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        /* 1ro: Crear las instancias de las clases */
        Impresora laImpresora = new Impresora();
        Documento elDocumento = new Documento();
        
        /* 2do: Colocar datos a las instancias */
        laImpresora.setMarca("SAMSUNG");
        laImpresora.setTieneTinta(true);
        
        elDocumento.setTitulo("Tesis");
        elDocumento.setHojas(300);
        
        /* 3ro: Imprimir los datos con toString()  */
        laImpresora.imprimir();
        elDocumento.imprimir();
        
    }
}
