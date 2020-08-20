
package b_carro;

/**
 *
 * Autor:    Abi
 */

public class ToyotaBuilder extends AutoBuilder {

    @Override
    public void construirMarca() {
        auto.setMarca("Toyota");
    }

    @Override
    public void construirModelo() {
        auto.setModelo("2017");
    }

    @Override
    public void construirPuertas() {
        auto.setPuertas(4);
    }
    
}
