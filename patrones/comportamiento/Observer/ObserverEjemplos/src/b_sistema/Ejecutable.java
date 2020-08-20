package b_sistema;

/**
 *
 * @author Abi
 */
public class Ejecutable {
    public static void main(String[] args) {
        SistemaObservableConcreto sistema = new SistemaObservableConcreto();
        
        ObservadorBinario binario = new ObservadorBinario(sistema);
        ObservadorOctal octal = new ObservadorOctal(sistema);
        ObservadorHexadecimal hexadecimal = new ObservadorHexadecimal(sistema);
        
        sistema.setNumero(199);
    }
}
