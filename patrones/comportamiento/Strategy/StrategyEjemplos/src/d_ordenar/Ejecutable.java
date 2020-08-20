package d_ordenar;

/**
 *
 * @author desab
 */
public class Ejecutable {

    public static void main(String[] args) {
        
        int[] datos = {3, 7, 4, 9, 16};
        
        Contexto elContexto = new Contexto();
        
        elContexto.setEstrategia(new EstrategiaBurbuja());
        elContexto.organizar(datos);
        
        elContexto.setEstrategia(new EstrategiaQuickSort());
        elContexto.organizar(datos);
    }
}
