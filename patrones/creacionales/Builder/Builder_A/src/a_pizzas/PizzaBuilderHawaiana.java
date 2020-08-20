
package a_pizzas;

/**
 *
 * Autor:    Abi
 */

public class PizzaBuilderHawaiana extends PizzaBuilder {

    @Override
    public void construirMasa() {
        pizza.setMasa("suave");
    }

    @Override
    public void construirSalsa() {
        pizza.setSalsa("dulce");
    }

    @Override
    public void ConstruirRelleno() {
        pizza.setRelleno("chorizo+alcachofas");
    }

}
