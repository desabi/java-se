package d_ordenar;

/**
 *
 * @author desab
 */
public class EstrategiaQuickSort implements Estrategia {

    @Override
    public void ordenar(int[] datos) {
        System.out.println("ORDENAR CON QUICKSORT");
        for (int dato : datos) {
            System.out.print("[ " + dato + " ] ");
        }
        System.out.println("");
    }
    
}
