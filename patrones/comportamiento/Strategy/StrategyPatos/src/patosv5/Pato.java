
package patosv5;

/**
 *
 * @author Abi
 */
public abstract class Pato {
    
    Vuelo vuelo;
    Sonido sonido;
    
    public abstract void mostrar();
    
    public void nadar() {
        System.out.println("El pato esta nadando.");
    }
    
    public void realizarSonido() {
        sonido.sonar();
    }
    
    public void realizarVuelo() {
        vuelo.volar();
    }
    
}
