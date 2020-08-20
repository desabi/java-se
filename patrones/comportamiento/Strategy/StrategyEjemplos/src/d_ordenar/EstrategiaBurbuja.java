package d_ordenar;

/**
 *
 * @author desab
 */
public class EstrategiaBurbuja implements Estrategia {

    @Override
    public void ordenar(int[] datos) {
        System.out.println("ORDANAR CON METODO DE BURBUJA");
        for (int dato : datos) {
            System.out.print("[ " + dato + " ] ");
        }
        System.out.println("");
    }

}
