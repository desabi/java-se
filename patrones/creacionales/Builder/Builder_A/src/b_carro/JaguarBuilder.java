
package b_carro;

/**
 *
 * Autor:    Abi
 */

public class JaguarBuilder extends AutoBuilder {

    @Override
    public void construirMarca() {
        auto.setMarca("JAGUAR");
    }

    @Override
    public void construirModelo() {
        auto.setModelo("2018");
    }

    @Override
    public void construirPuertas() {
        auto.setPuertas(2);
    }
    
}
