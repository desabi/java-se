
package x_diagrama;

/**
 *
 * @author Abi
 */

public class Contexto {

    private Estrategia estrategia;

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }    
    
    public void realizarOperacion() {
        estrategia.ejecutarOperacion();
    }
}
