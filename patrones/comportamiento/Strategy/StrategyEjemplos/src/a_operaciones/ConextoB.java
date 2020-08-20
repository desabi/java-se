package a_operaciones;

/**
 *
 * @author desab
 */
public class ConextoB {
    
    private Estrategia estrategia;

    public ConextoB() {
    }
    
    public void setEstrategia(Estrategia laEstrategia) {
        this.estrategia = laEstrategia;
    }
    
    public int ejecutarOperacion(int numero1, int numero2) {
        return this.estrategia.hacerOperacion(numero1, numero2);
    }
}
