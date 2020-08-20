package ejemplo_e_pesos;

/**
 *
 * @author abi
 */
public class Objeto {
    
    private String nombre;
    private UnidadPeso peso;

    public Objeto(String nombre, UnidadPeso peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    // retorna GRAMO, KILO o TONELADA
    public UnidadPeso getPeso() {
        return peso;
    }
    
    // RETORNA 1, 1000 o 10000
    public int getPesoValor() {
        // return getPeso().getValor();
        return peso.getValor();
    }
    
}
