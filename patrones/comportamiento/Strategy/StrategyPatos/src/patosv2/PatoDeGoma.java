
package patosv2;

/**
 *
 * @author Abi
 */
public class PatoDeGoma extends Pato {

    @Override
    public void mostrar() {
        System.out.println("Hola, soy un PATO DE GOMA.");
    }

    /* Esto no se debe permitir, un pato de goma no puede volar */
    @Override
    public void volar() {
        System.out.println("El PATO DE GOMA está volando.");
    }
    /* se puede sobre escribir y no hacer nada dentro del metodo */

}
