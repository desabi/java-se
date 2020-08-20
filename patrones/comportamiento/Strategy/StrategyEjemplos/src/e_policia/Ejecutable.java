package e_policia;

/**
 *
 * @author desab
 */
public class Ejecutable {
    public static void main(String[] args) {
        
        PoliciaAmable policiaAmable = new PoliciaAmable();
        PoliciaDuro policiaDuro = new PoliciaDuro();
        
        Situacion situacion = new Situacion();
        
        situacion.setEstrategia(policiaDuro);
        situacion.manejarPorLaPolicia(30);
    }
}
