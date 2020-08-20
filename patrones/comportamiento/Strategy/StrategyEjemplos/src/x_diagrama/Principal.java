
package x_diagrama;

/**
 *
 * @author Abi
 */

public class Principal {
    public static void main(String[] args) {
        
        Contexto contexto = new Contexto();
        
        contexto.setEstrategia(new EstrategiaConcretaA() );
        
        contexto.realizarOperacion(); 
    }
}
