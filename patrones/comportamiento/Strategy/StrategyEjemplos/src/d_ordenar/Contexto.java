package d_ordenar;

/**
 *
 * @author desab
 */
public class Contexto {

    private Estrategia estrategia;

    public Contexto() {
    }
    
    public void setEstrategia(Estrategia laEstrategia) {
        this.estrategia = laEstrategia;
    }
    
    public void organizar(int[] datos) {
        estrategia.ordenar(datos);
    }
    
}