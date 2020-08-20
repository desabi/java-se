
package a_pizzas;

/**
 *
 * Autor:    Abi
 */

public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }
    
    public void crearPizza() {
        pizza = new Pizza();
    }
    
    public abstract void construirMasa();
    
    public abstract void construirSalsa();
    
    public abstract void ConstruirRelleno();
    
}
