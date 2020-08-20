
package a_pizzas;

/**
 *
 * Autor:    Abi
 */

public class PizzaBuilderPicante extends PizzaBuilder {

    @Override
    public void construirMasa() {
        pizza.setMasa("cocida");
    }

    @Override
    public void construirSalsa() {
        pizza.setSalsa("picante");
    }

    @Override
    public void ConstruirRelleno() {
        pizza.setRelleno("pimienta+salchichon");
    }

}
