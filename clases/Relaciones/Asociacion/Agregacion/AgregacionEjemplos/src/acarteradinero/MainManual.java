
package acarteradinero;

/**
 *
 * @author Abi
 */
public class MainManual {
    public static void main(String[] args) {
        
        Cartera laCartera = new Cartera();
        laCartera.setDueño("Abi");
        laCartera.setColor("Cafe");
        
        Dinero elDinero = new Dinero();
        elDinero.setTipoMoneda("pesos");
        elDinero.setCantidad(150.50);
        
        laCartera.setDinero(elDinero);
        
        laCartera.imprimir();
        
    }
}
