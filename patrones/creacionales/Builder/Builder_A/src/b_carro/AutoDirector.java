
package b_carro;

/**
 *
 * Autor:    Abi
 */

public class AutoDirector {
    
    private AutoBuilder autoBuilder;

    public Auto getAuto() {
        return autoBuilder.getAuto();
    }

    public void setAutoBuilder(AutoBuilder autoBuilder) {
        this.autoBuilder = autoBuilder;
    }
    
    public void construirAuto() {
        autoBuilder.crearAuto();
        autoBuilder.construirMarca();
        autoBuilder.construirModelo();
        autoBuilder.construirPuertas();
    }
    
}
