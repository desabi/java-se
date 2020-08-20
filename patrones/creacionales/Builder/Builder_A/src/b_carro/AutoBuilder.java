
package b_carro;

/**
 *
 * Autor:    Abi
 */

public abstract class AutoBuilder {
    
    protected Auto auto;

    public Auto getAuto() {
        return auto;
    }
    
    public void crearAuto() {
        auto = new Auto();
    }
    
    public abstract void construirMarca();
    
    public abstract void construirModelo();
    
    public abstract void construirPuertas();
    
}
