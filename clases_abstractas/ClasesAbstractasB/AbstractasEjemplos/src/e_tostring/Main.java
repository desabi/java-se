
package e_tostring;

/**
 * Autor: Abi
 * Fecha: 26/04/2016
 * Hora: 04:13:35 PM
 */

public class Main {
    public static void main(String[] args) {
        
        Libro elLibro = new Libro();
        elLibro.setTitulo("Java: Manual de referencia.");
        elLibro.setPrecio(900);
        
        String texto = elLibro.toString();
        System.out.println(texto);
        
        System.out.println(elLibro.toString());
    }
}
