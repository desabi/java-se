
package version_5;

/**
 *
 * Autor:    Abi
 */

public abstract class Pato {
    
    protected ComportamientoSonido comportamientoSonido;
    protected ComportamientoVolar comportamientoVolar;
    
    public abstract void mostrarEnPantalla();
    
    public void nadar() {
        System.out.println(":: El pato esta nadando ::");
    }
    
    public void realizarSonido() {
        comportamientoSonido.sonido();
    }
    
    public void realizarVuelo() {
        comportamientoVolar.volar();
    }
}
