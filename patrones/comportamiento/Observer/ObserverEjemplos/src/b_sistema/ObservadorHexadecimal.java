package b_sistema;

/**
 *
 * @author Abi
 */
public class ObservadorHexadecimal implements Observador {

    private SistemaObservableConcreto sistemaObsevableConcreto;

    public ObservadorHexadecimal(SistemaObservableConcreto sistemaObsevableConcreto) {
        this.sistemaObsevableConcreto = sistemaObsevableConcreto;
        this.sistemaObsevableConcreto.agregarObservador(this);
    }
    
    
    @Override
    public void actualizar() {
        int numero = sistemaObsevableConcreto.getNumero();
        String numeroHexadecimal = Integer.toHexString(numero);
        System.out.println("Numero Hexadecimal = " + numeroHexadecimal);
    }
    
    
}
