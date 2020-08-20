package a_vestido;

/**
 *
 * @author Abi
 */
public class Main {
    public static void main(String[] args) {
        
        /* Creamos el sujeto observable concreto */
        SujetoObservableConcreto vestidoRojo = new SujetoObservableConcreto();
        
        /* Creamos las obsevadoras que quieren saber */
        /* si el vestido esta disponible */
        
        ObservadoraConcreta lisa = new ObservadoraConcreta(vestidoRojo);
        ObservadoraConcreta chica1 = new ObservadoraConcreta(vestidoRojo);
        ObservadoraConcreta chica2 = new ObservadoraConcreta(vestidoRojo);
        ObservadoraConcreta chica3 = new ObservadoraConcreta(vestidoRojo);
        
        /* establecemos si el vestido esta disponible o no */
        vestidoRojo.setDisponible(true);
        
    }
}
