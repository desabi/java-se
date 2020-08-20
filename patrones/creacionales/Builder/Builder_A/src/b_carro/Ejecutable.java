
package b_carro;

/**
 *
 * Autor:    Abi
 */

public class Ejecutable {
    
    public static void main(String[] args) {
        
        AutoDirector autoDirector = new AutoDirector();
        
        autoDirector.setAutoBuilder(new JaguarBuilder());
        //autoDirector.setAutoBuilder(new ToyotaBuilder());
        
        autoDirector.construirAuto();
        
        Auto auto = autoDirector.getAuto();
        
        System.out.println(auto);
        
    }
}
