package a_vestido;

/**
 *
 * @author Abi
 */
public class ObservadoraConcreta implements Observadora {

    private SujetoObservableConcreto sujetoObservableConcreto;

    public ObservadoraConcreta(SujetoObservableConcreto sujetoObsevableConcreto) {
        this.sujetoObservableConcreto = sujetoObsevableConcreto;
        this.sujetoObservableConcreto.agregarObservadora(this);
    }

    @Override
    public void actualizar() {
        boolean disponible = sujetoObservableConcreto.isDisponible();
        
        if (disponible == true) {
            System.out.println("El vestido esta disponible.");
        } else {
            System.out.println("Vestido NO disponible.");
        }
    }
       
}
