package e_policia;

/**
 *
 * @author desab
 */
public class Situacion {

    private Estrategia estrategia;

    public Situacion() {
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void manejarPorLaPolicia(int velocidad) {
        this.estrategia.procesarExcesoVelocidad(velocidad);
    }
    
}