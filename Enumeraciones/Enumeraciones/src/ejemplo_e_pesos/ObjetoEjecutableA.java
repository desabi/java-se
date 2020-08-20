package ejemplo_e_pesos;

/**
 *
 * @author abi
 */
public class ObjetoEjecutableA {
    public static void main(String[] args) {
        
        Objeto miObjeto = new Objeto("Carro", UnidadPeso.TONELADA);
        
        System.out.println("Nombre: " + miObjeto.getNombre());
        System.out.println("Peso: " + miObjeto.getPeso());
        
        // imprimen lo mismo las siguientes lineas
        System.out.println("Peso: " + miObjeto.getPeso().getValor());
        System.out.println("Peso: " + miObjeto.getPesoValor());
        
    }
}
