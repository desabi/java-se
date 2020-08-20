package b_sistema;

/**
 *
 * @author Abi
 */
public class ObservadorOctal implements Observador {

    private SistemaObservableConcreto sistemaObservableConcreto;

    public ObservadorOctal(SistemaObservableConcreto sistemaObservableConcreto) {
        this.sistemaObservableConcreto = sistemaObservableConcreto;
        this.sistemaObservableConcreto.agregarObservador(this);
    }
    
    @Override
    public void actualizar() {
        int numero = sistemaObservableConcreto.getNumero();
        String numeroOctal = Integer.toOctalString(numero);
        System.out.println("Numero Octal = " + numeroOctal);
    }
    
    
}
