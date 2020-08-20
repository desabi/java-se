package b_sistema;

/**
 *
 * @author Abi
 */
public class ObservadorBinario implements Observador {
    
    private SistemaObservableConcreto sistemaObservableConcreto;

    public ObservadorBinario(SistemaObservableConcreto sistemaObservableConcreto) {
        this.sistemaObservableConcreto = sistemaObservableConcreto;
        this.sistemaObservableConcreto.agregarObservador(this);
    }

    @Override
    public void actualizar() {
        int numero = sistemaObservableConcreto.getNumero();
        String numeroBinario = Integer.toBinaryString(numero);
        System.out.println("Numero Binario = " + numeroBinario);
    }
    
    
}
