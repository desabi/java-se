package a_vestido;

import java.util.ArrayList;

/**
 *
 * @author Abi
 */
public class SujetoObservableConcreto implements SujetoObservable {

    ArrayList<Observadora> observadoras = new ArrayList<>();
    private boolean disponible = false;

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
        notificarObservadoras();
    }

    @Override
    public void agregarObservadora(Observadora observadora) {
        observadoras.add(observadora);
    }

    @Override
    public void quitarObservadora(Observadora observadora) {
        observadoras.remove(observadora);
    }

    @Override
    public void notificarObservadoras() {
        for (Observadora observadora : observadoras) {
            observadora.actualizar();
        }
    }

}