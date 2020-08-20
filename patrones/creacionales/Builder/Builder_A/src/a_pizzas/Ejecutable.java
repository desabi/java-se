
package a_pizzas;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    public static void main(String[] args) {
        
        Cocina cocina = new Cocina();
        
        PizzaBuilder hawaiana = new PizzaBuilderHawaiana();
        PizzaBuilder picante = new PizzaBuilderPicante();
        
        cocina.setPizzaBuilder(hawaiana);
        
        cocina.construirPizza();
        
        Pizza pizza = cocina.getPizza();
        
        System.out.println(pizza);
        
        
    }
}
