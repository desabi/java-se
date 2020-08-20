package c_producto;

/**
 *
 * @author Abi
 */
public interface ProductoObservable {
    
    public void agregarObservador(Observador observador);
    public void quitarObservador(Observador observador);
    public void notificarObseradores();
    
}
