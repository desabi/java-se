package b_sistema;

/**
 *
 * @author Abi
 */
public interface SistemaObservable {

    public void agregarObservador(Observador observador);

    public void quitarObservador(Observador observador);

    public void notificarObservadores();

}
