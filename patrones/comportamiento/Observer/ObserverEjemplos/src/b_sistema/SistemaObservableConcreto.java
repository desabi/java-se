package b_sistema;

import java.util.ArrayList;

/**
 *
 * @author Abi
 */
public class SistemaObservableConcreto implements SistemaObservable {

    private ArrayList<Observador> observadores = new ArrayList<>();
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
        notificarObservadores();
    }

    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void quitarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }

}
