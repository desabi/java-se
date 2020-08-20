
package a_pizzas;

/**
 *
 * Autor:    Abi
 */

public class Cocina {
    
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }
    
    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
    
    public void construirPizza() {
        pizzaBuilder.crearPizza();
        pizzaBuilder.construirMasa();
        pizzaBuilder.construirSalsa();
        pizzaBuilder.ConstruirRelleno();
    }
    
}
