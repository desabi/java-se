
package a_operaciones;

/**
 *
 * @author Abi
 */
public class Contexto {

    private Estrategia estrategia;
    
    public Contexto(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    
    public int ejecutarEstrategia(int numero1, int numero2){
        return estrategia.hacerOperacion(numero1, numero2);
    }
}
