
package patosv4;

/**
 *
 * @author Abi
 */
public abstract class Pato {
    
    VolarComportamiento volarComportamiento;
    QuackComportamiento quackComportamiento;
    
    public void nadar(){ 
        System.out.println("El pato esta nadando.");
    }
    
    public abstract void mostrar();
    
    public void realizarQuack() {
        quackComportamiento.quack();
    }
    
    public void realizarVuelo() {
        volarComportamiento.volar();
    }
}
