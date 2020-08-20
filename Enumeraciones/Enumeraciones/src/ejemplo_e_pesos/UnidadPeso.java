
package ejemplo_e_pesos;

/**
 *
 * @author abi
 */
public enum UnidadPeso {
    
    GRAMO(1),
    KILO(1000),
    TONELADA(10_000);
    
    private final int valor;

    private UnidadPeso(int valor) {
        this.valor = valor;
    }
    
    public int getValor(){
        return valor;
    }
    
}
