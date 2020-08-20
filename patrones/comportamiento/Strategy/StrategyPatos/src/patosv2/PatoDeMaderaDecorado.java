
package patosv2;

/**
 *
 * @author Abi
 */
public class PatoDeMaderaDecorado extends Pato {

    /* un pato de madera no puede hacer quak */
    /* se puede sobre escribir el metodo y no hacer nada dentro de el */
    @Override
    public void quack() {
    }
    
    @Override
    public void mostrar() {
        System.out.println("PATO DE MADERA DECORADO"); 
    }

    /* un pato de madera no puede volar */
    @Override
    public void volar() {
        System.out.println("El PATO DE MADERA DECORADO esta volando.");
    }
    
    /* se puede sobre escribir y no hacer nada dentro del metodo */
}
