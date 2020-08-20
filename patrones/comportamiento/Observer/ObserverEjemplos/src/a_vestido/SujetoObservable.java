package a_vestido;

/**
 *
 * @author Abi
 */
public interface SujetoObservable {

    public void agregarObservadora(Observadora observadora);

    public void quitarObservadora(Observadora observadora);

    public void notificarObservadoras();

}
