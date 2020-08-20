package ejemplo_e_pesos;

import java.util.ArrayList;

/**
 *
 * @author abi
 */
public class ObjetoEjecutableB {
    public static void main(String[] args) {
        
        ArrayList<Objeto> misObjetos = new ArrayList<>();
        
        misObjetos.add(new Objeto("Laptop", UnidadPeso.KILO));
        misObjetos.add(new Objeto("Lentes", UnidadPeso.GRAMO));
        misObjetos.add(new Objeto("Carro", UnidadPeso.TONELADA));
        
        for (Objeto objeto : misObjetos) {
            
            String nombre = objeto.getNombre();
            UnidadPeso peso = objeto.getPeso();            
            //int valor = objeto.getPeso().getValor();
            int pesoValor = objeto.getPesoValor();
            
            System.out.println(nombre + " - " + peso + " - " + pesoValor);
            
        }
    }
}
